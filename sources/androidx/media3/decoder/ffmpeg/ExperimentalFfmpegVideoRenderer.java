package androidx.media3.decoder.ffmpeg;

import a3.m0;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.v0;
import b2.x;
import e2.l0;
import h2.e;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends a3.a {
    public static final int r0 = ((l0.g(720, 64) * l0.g(1280, 64)) * 6144) / 2;
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
        return !v0.m(str) ? i0.a.a(0, 0, 0, 0) : !FfmpegLibrary.d(str) ? i0.a.a(1, 0, 0, 0) : xVar.T != 0 ? i0.a.a(2, 0, 0, 0) : zs.W1;
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
