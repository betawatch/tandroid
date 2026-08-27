package com.google.android.exoplayer2.ext.ffmpeg;

import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import d5.g0;
import d5.z;
import h3.t0;
import java.nio.ByteBuffer;
import java.util.List;
import k3.i;
import k3.j;
import k3.k;
import k3.m;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class FfmpegAudioDecoder extends m {
    private static final int AUDIO_DECODER_ERROR_INVALID_DATA = -1;
    private static final int AUDIO_DECODER_ERROR_OTHER = -2;
    private static final int OUTPUT_BUFFER_SIZE_16BIT = 65536;
    private static final int OUTPUT_BUFFER_SIZE_32BIT = 131072;
    private volatile int channelCount;
    private final String codecName;
    private final int encoding;
    private final byte[] extraData;
    private boolean hasOutputFormat;
    private long nativeContext;
    private final int outputBufferSize;
    private volatile int sampleRate;

    public FfmpegAudioDecoder(t0 t0Var, int i10, int i11, int i12, boolean z10) {
        super(new i[i10], new SimpleDecoderOutputBuffer[i11]);
        if (!FfmpegLibrary.isAvailable()) {
            throw new FfmpegDecoderException("Failed to load decoder native libraries.");
        }
        String str = t0Var.B;
        String str2 = t0Var.B;
        str.getClass();
        String codecName = FfmpegLibrary.getCodecName(str2);
        codecName.getClass();
        this.codecName = codecName;
        byte[] extraData = getExtraData(str2, t0Var.D);
        this.extraData = extraData;
        this.encoding = z10 ? 4 : 2;
        this.outputBufferSize = z10 ? 131072 : 65536;
        long ffmpegInitialize = ffmpegInitialize(codecName, extraData, z10, t0Var.P, t0Var.O);
        this.nativeContext = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new FfmpegDecoderException("Initialization failed.");
        }
        setInitialInputBufferSize(i12);
    }

    private native int ffmpegDecode(long j10, ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11);

    private native int ffmpegGetChannelCount(long j10);

    private native int ffmpegGetSampleRate(long j10);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z10, int i10, int i11);

    private native void ffmpegRelease(long j10);

    private native long ffmpegReset(long j10, byte[] bArr);

    private static byte[] getAlacExtraData(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length + 12;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1634492771);
        allocate.putInt(0);
        allocate.put(bArr, 0, bArr.length);
        return allocate.array();
    }

    private static byte[] getExtraData(String str, List<byte[]> list) {
        str.getClass();
        switch (str) {
            case "audio/vorbis":
                return getVorbisExtraData(list);
            case "audio/mp4a-latm":
            case "audio/opus":
                return list.get(0);
            case "audio/alac":
                return getAlacExtraData(list);
            default:
                return null;
        }
    }

    private static byte[] getVorbisExtraData(List<byte[]> list) {
        byte[] bArr = list.get(0);
        byte[] bArr2 = list.get(1);
        byte[] bArr3 = new byte[bArr.length + bArr2.length + 6];
        bArr3[0] = (byte) (bArr.length >> 8);
        bArr3[1] = (byte) (bArr.length & 255);
        System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
        bArr3[bArr.length + 2] = 0;
        bArr3[bArr.length + 3] = 0;
        bArr3[bArr.length + 4] = (byte) (bArr2.length >> 8);
        bArr3[bArr.length + 5] = (byte) (bArr2.length & 255);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 6, bArr2.length);
        return bArr3;
    }

    @Override // k3.m
    public i createInputBuffer() {
        return new i(2, FfmpegLibrary.getInputBufferPaddingSize());
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getEncoding() {
        return this.encoding;
    }

    @Override // k3.e
    public String getName() {
        return "ffmpeg" + FfmpegLibrary.getVersion() + "-" + this.codecName;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    @Override // k3.m, k3.e
    public void release() {
        super.release();
        ffmpegRelease(this.nativeContext);
        this.nativeContext = 0L;
    }

    @Override // k3.m
    public SimpleDecoderOutputBuffer createOutputBuffer() {
        return new SimpleDecoderOutputBuffer(new j() { // from class: com.google.android.exoplayer2.ext.ffmpeg.a
            @Override // k3.j
            public final void c(k kVar) {
                FfmpegAudioDecoder.this.releaseOutputBuffer((SimpleDecoderOutputBuffer) kVar);
            }
        });
    }

    @Override // k3.m
    public FfmpegDecoderException createUnexpectedDecodeException(Throwable th) {
        return new FfmpegDecoderException("Unexpected decode error", th);
    }

    @Override // k3.m
    public FfmpegDecoderException decode(i iVar, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean z10) {
        if (z10) {
            long ffmpegReset = ffmpegReset(this.nativeContext, this.extraData);
            this.nativeContext = ffmpegReset;
            if (ffmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = iVar.b;
        int i10 = g0.a;
        int limit = byteBuffer.limit();
        ByteBuffer init = simpleDecoderOutputBuffer.init(iVar.d, this.outputBufferSize);
        int ffmpegDecode = ffmpegDecode(this.nativeContext, byteBuffer, limit, init, this.outputBufferSize);
        if (ffmpegDecode == -2) {
            return new FfmpegDecoderException("Error decoding (see logcat).");
        }
        if (ffmpegDecode == -1) {
            simpleDecoderOutputBuffer.setFlags(TLObject.FLAG_31);
            return null;
        }
        if (ffmpegDecode == 0) {
            simpleDecoderOutputBuffer.setFlags(TLObject.FLAG_31);
            return null;
        }
        if (!this.hasOutputFormat) {
            this.channelCount = ffmpegGetChannelCount(this.nativeContext);
            this.sampleRate = ffmpegGetSampleRate(this.nativeContext);
            if (this.sampleRate == 0 && "alac".equals(this.codecName)) {
                this.extraData.getClass();
                z zVar = new z(this.extraData);
                zVar.C(this.extraData.length - 4);
                this.sampleRate = zVar.u();
            }
            this.hasOutputFormat = true;
        }
        init.position(0);
        init.limit(ffmpegDecode);
        return null;
    }
}
