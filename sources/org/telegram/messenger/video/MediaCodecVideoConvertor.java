package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import c3.i0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m4.n0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.messenger.ff;
import org.telegram.messenger.kf;
import org.telegram.messenger.tz;
import org.telegram.messenger.v20;
import org.telegram.messenger.w20;
import org.telegram.messenger.x20;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import vh.m5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class MediaCodecVideoConvertor {
    private static final int MAX_DECODER_INPUTS_PER_LOOP = 8;
    private static final int MEDIACODEC_TIMEOUT_DEFAULT = 2500;
    private static final int MEDIACODEC_TIMEOUT_INCREASED = 22000;
    private static final int PROCESSOR_TYPE_INTEL = 2;
    private static final int PROCESSOR_TYPE_MTK = 3;
    private static final int PROCESSOR_TYPE_OTHER = 0;
    private static final int PROCESSOR_TYPE_QCOM = 1;
    private static final int PROCESSOR_TYPE_SEC = 4;
    private static final int PROCESSOR_TYPE_TI = 5;
    private kf callback;
    private long endPresentationTime;
    private MediaExtractor extractor;
    private Muxer muxer;
    private String outputMimeType;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class ConversionCanceledException extends RuntimeException {
        public ConversionCanceledException() {
            super("canceled conversion");
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class ConvertVideoParams {
        int account;
        long avatarStartTime;
        String backgroundPath;
        int bitrate;
        String blurPath;
        File cacheFile;
        kf callback;
        vh.r collage;
        ArrayList<w20> collageParts;
        ye cropState;
        long duration;
        long endTime;
        int framerate;
        Integer gradientBottomColor;
        Integer gradientTopColor;
        m5 hdrInfo;
        boolean isDark;
        boolean isPhoto;
        boolean isRound;
        boolean isSecret;
        boolean isSticker;
        boolean isStory;
        ArrayList<v20> mediaEntities;
        String messagePath;
        String messageVideoMaskPath;
        boolean muted;
        boolean needCompress;
        int originalBitrate;
        int originalHeight;
        int originalWidth;
        String paintPath;
        int resultHeight;
        int resultWidth;
        int rotationValue;
        ff savedFilterState;
        public ArrayList<MixedSoundInfo> soundInfos = new ArrayList<>();
        long startTime;
        long videoOffset;
        String videoPath;
        float volume;
        long wallpaperPeerId;

        private ConvertVideoParams() {
        }

        public static ConvertVideoParams of(String str, File file, long j10, int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, long j12, long j13, boolean z11, long j14, kf kfVar, x20 x20Var) {
            ConvertVideoParams convertVideoParams = new ConvertVideoParams();
            convertVideoParams.videoPath = str;
            convertVideoParams.videoOffset = j10;
            convertVideoParams.cacheFile = file;
            convertVideoParams.rotationValue = i10;
            convertVideoParams.isSecret = z10;
            convertVideoParams.originalWidth = i11;
            convertVideoParams.originalHeight = i12;
            convertVideoParams.resultWidth = i13;
            convertVideoParams.resultHeight = i14;
            convertVideoParams.framerate = i15;
            convertVideoParams.bitrate = i16;
            convertVideoParams.originalBitrate = i17;
            convertVideoParams.startTime = j11;
            convertVideoParams.endTime = j12;
            convertVideoParams.avatarStartTime = j13;
            convertVideoParams.needCompress = z11;
            convertVideoParams.duration = j14;
            convertVideoParams.savedFilterState = x20Var.A;
            convertVideoParams.paintPath = x20Var.B;
            convertVideoParams.blurPath = x20Var.C;
            convertVideoParams.mediaEntities = x20Var.G;
            convertVideoParams.isPhoto = x20Var.I;
            convertVideoParams.cropState = x20Var.H;
            convertVideoParams.isRound = x20Var.s;
            convertVideoParams.callback = kfVar;
            convertVideoParams.gradientTopColor = x20Var.Q;
            convertVideoParams.gradientBottomColor = x20Var.R;
            convertVideoParams.muted = x20Var.t;
            convertVideoParams.volume = x20Var.u;
            convertVideoParams.isStory = x20Var.J;
            convertVideoParams.hdrInfo = x20Var.K;
            convertVideoParams.isDark = x20Var.T;
            convertVideoParams.wallpaperPeerId = x20Var.U;
            convertVideoParams.account = x20Var.S;
            convertVideoParams.messagePath = x20Var.D;
            convertVideoParams.messageVideoMaskPath = x20Var.E;
            convertVideoParams.backgroundPath = x20Var.F;
            convertVideoParams.isSticker = x20Var.N;
            convertVideoParams.collage = x20Var.L;
            convertVideoParams.collageParts = x20Var.M;
            return convertVideoParams;
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class DecoderFeeder extends Thread {
        private ByteBuffer audioBuffer;
        private final int audioIndex;
        private final int audioTrackIndex;
        private final MediaCodec decoder;
        private final float durationS;
        private final long endTime;
        volatile Throwable error;
        private final MediaExtractor extractor;
        private int maxBufferSize;
        private final Muxer muxer;
        private final long startTime;
        volatile boolean stopFeeding;
        private final int videoIndex;

        public DecoderFeeder(MediaExtractor mediaExtractor, MediaCodec mediaCodec, int i10, int i11, Muxer muxer, int i12, long j10, long j11, float f7, ByteBuffer byteBuffer, int i13) {
            super("DecoderFeeder");
            this.extractor = mediaExtractor;
            this.decoder = mediaCodec;
            this.videoIndex = i10;
            this.audioIndex = i11;
            this.muxer = muxer;
            this.audioTrackIndex = i12;
            this.startTime = j10;
            this.endTime = j11;
            this.durationS = f7;
            this.audioBuffer = byteBuffer;
            this.maxBufferSize = i13;
        }

        public void finish() {
            this.stopFeeding = true;
            try {
                join();
            } catch (InterruptedException e) {
                f8.g(e, true);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            long j10 = 0;
            while (!this.stopFeeding) {
                try {
                    if (MediaCodecVideoConvertor.this.callback != null && ((x20) ((n0) MediaCodecVideoConvertor.this.callback).a).W) {
                        return;
                    }
                    int sampleTrackIndex = this.extractor.getSampleTrackIndex();
                    if (sampleTrackIndex == this.videoIndex) {
                        int dequeueInputBuffer = this.decoder.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = this.extractor.readSampleData(this.decoder.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                this.decoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                return;
                            } else {
                                this.decoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                                this.extractor.advance();
                            }
                        }
                    } else {
                        int i10 = this.audioIndex;
                        if (i10 == -1 || sampleTrackIndex != i10) {
                            if (sampleTrackIndex == -1) {
                                while (!this.stopFeeding) {
                                    int dequeueInputBuffer2 = this.decoder.dequeueInputBuffer(2500L);
                                    if (dequeueInputBuffer2 >= 0) {
                                        this.decoder.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            long sampleSize = this.extractor.getSampleSize();
                            if (sampleSize > this.maxBufferSize) {
                                int i11 = (int) (sampleSize + 1024);
                                this.maxBufferSize = i11;
                                this.audioBuffer = ByteBuffer.allocateDirect(i11);
                            }
                        }
                        int readSampleData2 = this.extractor.readSampleData(this.audioBuffer, 0);
                        bufferInfo.size = readSampleData2;
                        if (readSampleData2 < 0) {
                            return;
                        }
                        bufferInfo.presentationTimeUs = this.extractor.getSampleTime();
                        this.extractor.advance();
                        if (bufferInfo.size > 0) {
                            long j11 = this.endTime;
                            if (j11 < 0 || bufferInfo.presentationTimeUs < j11) {
                                bufferInfo.offset = 0;
                                bufferInfo.flags = this.extractor.getSampleFlags();
                                synchronized (this.muxer) {
                                    try {
                                        long writeSampleData = this.muxer.writeSampleData(this.audioTrackIndex, this.audioBuffer, bufferInfo, false);
                                        if (writeSampleData != 0 && MediaCodecVideoConvertor.this.callback != null) {
                                            long j12 = bufferInfo.presentationTimeUs - this.startTime;
                                            if (j12 > j10) {
                                                j10 = j12;
                                            }
                                            ((n0) MediaCodecVideoConvertor.this.callback).k(writeSampleData, (j10 / 1000.0f) / this.durationS);
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable th2) {
                    this.error = th2;
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class MixedSoundInfo {
        final String audioFile;
        public long audioOffset;
        public long duration;
        public long startTime;
        public float volume = 1.0f;

        public MixedSoundInfo(String str) {
            this.audioFile = str;
        }
    }

    private static void applyAudioInputs(ArrayList<MixedSoundInfo> arrayList, ArrayList<tf.a> arrayList2) {
        if (arrayList == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MixedSoundInfo mixedSoundInfo = arrayList.get(i10);
            try {
                tf.c cVar = new tf.c(mixedSoundInfo.audioFile);
                AudioDecoder audioDecoder = cVar.b;
                cVar.a = Math.max(0.0f, Math.min(mixedSoundInfo.volume, 1.0f));
                long j10 = mixedSoundInfo.startTime;
                if (j10 > 0) {
                    if (j10 < 0) {
                        j10 = 0;
                    }
                    cVar.d = j10;
                }
                long j11 = mixedSoundInfo.audioOffset;
                if (j11 > 0) {
                    audioDecoder.setStartTimeUs(j11);
                } else {
                    j11 = 0;
                }
                long j12 = mixedSoundInfo.duration;
                if (j12 > 0) {
                    audioDecoder.setEndTimeUs(j11 + j12);
                }
                arrayList2.add(cVar);
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    private void checkConversionCanceled() {
        kf kfVar = this.callback;
        if (kfVar != null && ((x20) ((n0) kfVar).a).W) {
            throw new ConversionCanceledException();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1025:? -> B:1018:0x1568). Please report as a decompilation issue!!! */
    private boolean convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r116, boolean r117, int r118) {
        /*
            Method dump skipped, instructions count: 7804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, boolean, int):boolean");
    }

    private MediaCodec createEncoderForMimeType() {
        MediaCodec createEncoderByType;
        if (!this.outputMimeType.equals("video/hevc") || Build.VERSION.SDK_INT < 29) {
            if (this.outputMimeType.equals("video/hevc")) {
                this.outputMimeType = "video/avc";
            }
            createEncoderByType = MediaCodec.createEncoderByType(this.outputMimeType);
        } else {
            String l4 = tz.l();
            createEncoderByType = l4 != null ? MediaCodec.createByCodecName(l4) : null;
        }
        if (createEncoderByType != null || !this.outputMimeType.equals("video/hevc")) {
            return createEncoderByType;
        }
        this.outputMimeType = "video/avc";
        return MediaCodec.createEncoderByType("video/avc");
    }

    private static String createFragmentShader(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        float f7 = i10;
        float f10 = f7 / (z11 ? i13 : i12);
        float f11 = i11;
        float f12 = f11 / (z11 ? i12 : i13);
        int i15 = 1;
        int max = Math.max(1, Math.round(f10));
        int max2 = Math.max(1, Math.round(f12));
        if (tz.o() <= 1) {
            max2 = 1;
        } else {
            i15 = max;
        }
        int min = Math.min(i14, i15);
        int min2 = Math.min(i14, max2);
        float f13 = f10 / min;
        float f14 = f12 / min2;
        float f15 = (-(min - 1)) / 2.0f;
        float f16 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f15 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f16 += 0.01f;
        }
        StringBuilder m10 = i0.a.m("source size ", i10, "x", i11, "    dest size ");
        i0.a.t(m10, i12, "x", i13, "   rotated ");
        m10.append(z11);
        m10.append("   ratio ");
        m10.append(f10);
        m10.append("x");
        m10.append(f12);
        m10.append("   samples ");
        m10.append(min);
        m10.append("x");
        m10.append(min2);
        m10.append("   kernel scale ");
        m10.append(f13);
        m10.append("x");
        m10.append(f14);
        f8.b(m10.toString());
        String glslFloat = glslFloat(f15);
        String glslFloat2 = glslFloat(f16);
        String glslFloat3 = glslFloat(f13);
        String glslFloat4 = glslFloat(f14);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f7);
        String glslFloat7 = glslFloat(1.0f / f11);
        String str = z10 ? "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\n" : "uniform sampler2D sTexture;\n";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("precision highp float;\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        i0.r(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        i0.r(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb2.append(";\nconst float pixelSizeY = ");
        sb2.append(glslFloat7);
        sb2.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb2.append(min);
        sb2.append("; ++i) {\n        for (int j = 0; j < ");
        sb2.append(min2);
        sb2.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += texture2D(sTexture, uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void cutOfNalData(String str, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10 = str.equals("video/hevc") ? 3 : 1;
        if (bufferInfo.size > 100) {
            byteBuffer.position(bufferInfo.offset);
            byte[] bArr = new byte[100];
            byteBuffer.get(bArr);
            int i11 = 0;
            for (int i12 = 0; i12 < 96; i12++) {
                if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1 && (i11 = i11 + 1) > i10) {
                    bufferInfo.offset += i12;
                    bufferInfo.size -= i12;
                    return;
                }
            }
        }
    }

    private MediaCodec getDecoderByFormat(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            throw new RuntimeException("getDecoderByFormat: format is null");
        }
        ArrayList arrayList = new ArrayList();
        String string = mediaFormat.getString("mime");
        arrayList.add(string);
        if ("video/dolby-vision".equals(string)) {
            arrayList.add("video/hevc");
            arrayList.add("video/avc");
        }
        Exception exc = null;
        while (!arrayList.isEmpty()) {
            try {
                String str = (String) arrayList.remove(0);
                mediaFormat.setString("mime", str);
                return MediaCodec.createDecoderByType(str);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new RuntimeException(exc);
    }

    private static String glslFloat(float f7) {
        boolean z10 = f7 < 0.0f;
        if (z10) {
            f7 = -f7;
        }
        long round = Math.round(f7 * 1000000.0f);
        long j10 = round / 1000000;
        long j11 = round % 1000000;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        sb2.append(j10);
        sb2.append('.');
        String valueOf = String.valueOf(j11);
        for (int length = valueOf.length(); length < 6; length++) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    private static String hdrFragmentShader(int i10, int i11, int i12, int i13, boolean z10, m5 m5Var, int i14, boolean z11) {
        if (!z10) {
            return createFragmentShader(i10, i11, i12, i13, false, i14, z11);
        }
        float f7 = i10;
        float f10 = f7 / (z11 ? i13 : i12);
        float f11 = i11;
        float f12 = f11 / (z11 ? i12 : i13);
        int max = Math.max(1, Math.round(f10));
        int max2 = Math.max(1, Math.round(f12));
        if (tz.o() <= 1) {
            max = 1;
            max2 = 1;
        }
        int min = Math.min(i14, max);
        int min2 = Math.min(i14, max2);
        float f13 = f10 / min;
        float f14 = f12 / min2;
        float f15 = (-(min - 1)) / 2.0f;
        float f16 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f15 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f16 += 0.01f;
        }
        StringBuilder m10 = i0.a.m("HDR source size ", i10, "x", i11, "    dest size ");
        i0.a.t(m10, i12, "x", i13, "   rotated ");
        m10.append(z11);
        m10.append("   ratio ");
        m10.append(f10);
        m10.append("x");
        m10.append(f12);
        m10.append("   samples ");
        m10.append(min);
        m10.append("x");
        m10.append(min2);
        m10.append("   kernel scale ");
        m10.append(f13);
        m10.append("x");
        m10.append(f14);
        f8.b(m10.toString());
        String glslFloat = glslFloat(f15);
        String glslFloat2 = glslFloat(f16);
        String glslFloat3 = glslFloat(f13);
        String glslFloat4 = glslFloat(f14);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f7);
        String glslFloat7 = glslFloat(1.0f / f11);
        String y22 = m5Var.a() == 1 ? org.telegram.messenger.i0.y2(null, R.raw.hdr2sdr_hlg) : org.telegram.messenger.i0.y2(null, R.raw.hdr2sdr_pq);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y22);
        sb2.append("\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        i0.r(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        i0.r(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb2.append(";\nconst float pixelSizeY = ");
        sb2.append(glslFloat7);
        sb2.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb2.append(min);
        sb2.append("; ++i) {\n        for (int j = 0; j < ");
        sb2.append(min2);
        sb2.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += TEX(uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb2.toString();
    }

    private boolean isMediatekAvcEncoder(MediaCodec mediaCodec) {
        return mediaCodec.getName().equals("c2.mtk.avc.encoder");
    }

    private static boolean isSocModel(String... strArr) {
        String str;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        for (String str2 : strArr) {
            str = Build.SOC_MODEL;
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0117, code lost:
    
        if (r14[r4 + 3] != 1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long readAndWriteTracks(MediaExtractor mediaExtractor, Muxer muxer, MediaCodec.BufferInfo bufferInfo, long j10, long j11, long j12, File file, boolean z10) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        byte[] array;
        int i17;
        int i18;
        int i19;
        int i20 = 0;
        int w9 = MediaController.w(mediaExtractor, false);
        int w10 = z10 ? MediaController.w(mediaExtractor, true) : -1;
        float f10 = j12 / 1000.0f;
        if (w9 >= 0) {
            mediaExtractor.selectTrack(w9);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(w9);
            i10 = muxer.addTrack(trackFormat, false);
            try {
                i19 = trackFormat.getInteger("max-input-size");
            } catch (Exception e) {
                f8.g(e, true);
                i19 = 0;
            }
            if (j10 > 0) {
                mediaExtractor.seekTo(j10, 0);
            } else {
                mediaExtractor.seekTo(0L, 0);
            }
            f7 = 1000.0f;
            i11 = i19;
        } else {
            f7 = 1000.0f;
            i10 = -1;
            i11 = 0;
        }
        if (w10 >= 0) {
            mediaExtractor.selectTrack(w10);
            MediaFormat trackFormat2 = mediaExtractor.getTrackFormat(w10);
            if (trackFormat2.getString("mime").equals("audio/unknown")) {
                i12 = -1;
                w10 = -1;
            } else {
                i12 = muxer.addTrack(trackFormat2, true);
                try {
                    i11 = Math.max(trackFormat2.getInteger("max-input-size"), i11);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                if (j10 > 0) {
                    mediaExtractor.seekTo(j10, 0);
                } else {
                    mediaExtractor.seekTo(0L, 0);
                }
            }
        } else {
            i12 = -1;
        }
        if (i11 <= 0) {
            i11 = 65536;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11);
        long j13 = -1;
        if (w10 < 0 && w9 < 0) {
            return -1L;
        }
        checkConversionCanceled();
        boolean z12 = false;
        long j14 = -1;
        long j15 = 0;
        while (!z12) {
            checkConversionCanceled();
            long j16 = j13;
            if (Build.VERSION.SDK_INT >= 28) {
                long sampleSize = mediaExtractor.getSampleSize();
                i13 = w10;
                if (sampleSize > i11) {
                    int i21 = (int) (sampleSize + 1024);
                    i11 = i21;
                    allocateDirect = ByteBuffer.allocateDirect(i21);
                }
            } else {
                i13 = w10;
            }
            bufferInfo.size = mediaExtractor.readSampleData(allocateDirect, i20);
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == w9) {
                w10 = i13;
                i14 = i10;
            } else {
                w10 = i13;
                i14 = sampleTrackIndex == w10 ? i12 : -1;
            }
            if (i14 != -1) {
                if (sampleTrackIndex != w10 && (array = allocateDirect.array()) != null) {
                    int arrayOffset = allocateDirect.arrayOffset();
                    int limit = allocateDirect.limit() + arrayOffset;
                    int i22 = arrayOffset;
                    int i23 = -1;
                    while (true) {
                        int i24 = limit - 4;
                        if (i22 > i24) {
                            break;
                        }
                        if (array[i22] == 0 && array[i22 + 1] == 0 && array[i22 + 2] == 0) {
                            i17 = i12;
                            i18 = i11;
                        } else {
                            i17 = i12;
                            i18 = i11;
                        }
                        if (i22 != i24) {
                            i22++;
                            i12 = i17;
                            i11 = i18;
                        }
                        if (i23 != -1) {
                            int i25 = (i22 - i23) - (i22 != i24 ? 4 : 0);
                            array[i23] = (byte) (i25 >> 24);
                            array[i23 + 1] = (byte) (i25 >> 16);
                            array[i23 + 2] = (byte) (i25 >> 8);
                            array[i23 + 3] = (byte) i25;
                        }
                        i23 = i22;
                        i22++;
                        i12 = i17;
                        i11 = i18;
                    }
                }
                i15 = i12;
                i16 = i11;
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    z11 = false;
                } else {
                    bufferInfo.size = 0;
                    z11 = true;
                }
                if (bufferInfo.size > 0 && !z11) {
                    if (sampleTrackIndex == w9 && j10 > 0 && j14 == j16) {
                        j14 = bufferInfo.presentationTimeUs;
                    }
                    if (j11 < 0 || bufferInfo.presentationTimeUs < j11) {
                        bufferInfo.offset = 0;
                        bufferInfo.flags = mediaExtractor.getSampleFlags();
                        long writeSampleData = muxer.writeSampleData(i14, allocateDirect, bufferInfo, false);
                        if (writeSampleData != 0) {
                            kf kfVar = this.callback;
                            if (kfVar != null) {
                                long j17 = bufferInfo.presentationTimeUs - j14;
                                if (j17 <= j15) {
                                    j17 = j15;
                                }
                                ((n0) kfVar).k(writeSampleData, (j17 / f7) / f10);
                                j15 = j17;
                            }
                            if (!z11) {
                                mediaExtractor.advance();
                            }
                        }
                        if (!z11) {
                        }
                    } else {
                        z11 = true;
                    }
                }
                if (!z11) {
                }
            } else {
                i15 = i12;
                i16 = i11;
                if (sampleTrackIndex == -1) {
                    z11 = true;
                } else {
                    mediaExtractor.advance();
                    z11 = false;
                }
            }
            if (z11) {
                z12 = true;
            }
            i12 = i15;
            j13 = j16;
            i11 = i16;
            i20 = 0;
        }
        if (w9 >= 0) {
            mediaExtractor.unselectTrack(w9);
        }
        if (w10 >= 0) {
            mediaExtractor.unselectTrack(w10);
        }
        return j14;
    }

    private static void setDecoderOperatingRate(MediaFormat mediaFormat) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 25) {
            return;
        }
        if (i10 >= 31 && isSocModel("s5e8835", "SA8155P")) {
            mediaFormat.setInteger("priority", 1);
        }
        mediaFormat.setInteger("operating-rate", 10000);
    }

    private static void setEncoderOperatingRate(MediaFormat mediaFormat) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 25) {
            return;
        }
        mediaFormat.setInteger("priority", 1);
        if (i10 == 26) {
            mediaFormat.setInteger("operating-rate", 30);
        } else if (i10 < 31 || i10 > 34 || !isSocModel("SM8550", "SM7450", "SM6450", "SC9863A", "T612", "T606", "T603")) {
            mediaFormat.setInteger("operating-rate", ConnectionsManager.DEFAULT_DATACENTER_ID);
        } else {
            mediaFormat.setInteger("operating-rate", 1000);
        }
    }

    public boolean convertVideo(ConvertVideoParams convertVideoParams) {
        if (convertVideoParams.isSticker) {
            return WebmEncoder.convert(convertVideoParams, 0);
        }
        this.callback = convertVideoParams.callback;
        return convertVideoInternal(convertVideoParams, false, 0);
    }

    public long getLastFrameTimestamp() {
        return this.endPresentationTime;
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class Muxer {
        public final MediaMuxer mediaMuxer;
        public final MP4Builder mp4Builder;
        private boolean started;

        public Muxer(MP4Builder mP4Builder) {
            this.started = false;
            this.mp4Builder = mP4Builder;
            this.mediaMuxer = null;
        }

        public int addTrack(MediaFormat mediaFormat, boolean z10) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                return mediaMuxer.addTrack(mediaFormat);
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.addTrack(mediaFormat, z10);
            }
            return 0;
        }

        public void finishMovie() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.mediaMuxer.release();
            } else {
                MP4Builder mP4Builder = this.mp4Builder;
                if (mP4Builder != null) {
                    mP4Builder.finishMovie();
                }
            }
        }

        public long getLastFrameTimestamp(int i10, MediaCodec.BufferInfo bufferInfo) {
            if (this.mediaMuxer != null) {
                return bufferInfo.presentationTimeUs;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.getLastFrameTimestamp(i10);
            }
            return 0L;
        }

        public void start() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.start();
            }
        }

        public synchronized long writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
            try {
                MediaMuxer mediaMuxer = this.mediaMuxer;
                if (mediaMuxer != null) {
                    if (!this.started) {
                        mediaMuxer.start();
                        this.started = true;
                    }
                    this.mediaMuxer.writeSampleData(i10, byteBuffer, bufferInfo);
                    return 0L;
                }
                MP4Builder mP4Builder = this.mp4Builder;
                if (mP4Builder == null) {
                    return 0L;
                }
                return mP4Builder.writeSampleData(i10, byteBuffer, bufferInfo, z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public Muxer(MediaMuxer mediaMuxer) {
            this.started = false;
            this.mp4Builder = null;
            this.mediaMuxer = mediaMuxer;
        }
    }
}
