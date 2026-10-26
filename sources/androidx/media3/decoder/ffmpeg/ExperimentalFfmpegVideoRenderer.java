package androidx.media3.decoder.ffmpeg;

import a3.m0;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.w0;
import b2.x;
import c3.h0;
import e2.n0;
import h2.e;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends a3.a {
    public static final int r0 = ((n0.g(720, 64) * n0.g(1280, 64)) * 6144) / 2;
    public final int n0;
    public final int o0;
    public final int p0;
    public ExperimentalFfmpegVideoDecoder q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j10, Handler handler, m0 m0Var, int i10) {
        super(j10, handler, m0Var, i10);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.p0 = availableProcessors;
        this.n0 = 4;
        this.o0 = 4;
    }

    @Override // i2.b
    public final int C(x xVar) {
        String str = xVar.s;
        String str2 = FfmpegLibrary.a;
        if (!w0.m(str)) {
            return h0.c(0, 0, 0, 0);
        }
        if (!FfmpegLibrary.d(str)) {
            return h0.c(1, 0, 0, 0);
        }
        if (xVar.T != 0) {
            return h0.c(2, 0, 0, 0);
        }
        return 140;
    }

    @Override // a3.a
    public final e F(x xVar) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i10 = xVar.t;
        if (i10 == -1) {
            i10 = r0;
        }
        int i11 = i10;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.n0, this.o0, i11, Math.max(this.p0, 1), xVar);
        this.q0 = experimentalFfmpegVideoDecoder;
        Trace.endSection();
        return experimentalFfmpegVideoDecoder;
    }

    @Override // a3.a
    public final void N(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        try {
            ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.q0;
            if (experimentalFfmpegVideoDecoder == null) {
                throw new FfmpegDecoderException("Failed to render output buffer to surface: decoder is not initialized.");
            }
            experimentalFfmpegVideoDecoder.p(videoDecoderOutputBuffer, surface);
        } finally {
            videoDecoderOutputBuffer.release();
        }
    }

    @Override // a3.a
    public final void O(int i10) {
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.q0;
        if (experimentalFfmpegVideoDecoder != null) {
            experimentalFfmpegVideoDecoder.q = i10;
        }
    }

    @Override // i2.b
    public final String j() {
        return "ExperimentalFfmpegVideoRenderer";
    }
}
