package androidx.media3.decoder.ffmpeg;

import a3.l0;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.r0;
import b2.s;
import e2.d0;
import h2.e;
import hc.b;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends a3.a {
    public static final int r0 = ((d0.f(720, 64) * d0.f(1280, 64)) * 6144) / 2;
    public final int n0;
    public final int o0;
    public final int p0;
    public ExperimentalFfmpegVideoDecoder q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j3, Handler handler, l0 l0Var, int i10) {
        super(j3, handler, l0Var, i10);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.p0 = availableProcessors;
        this.n0 = 4;
        this.o0 = 4;
    }

    @Override // i2.f
    public final int A(s sVar) {
        String str = sVar.r;
        String str2 = FfmpegLibrary.a;
        if (!r0.m(str)) {
            return b.c(0, 0, 0, 0);
        }
        if (!FfmpegLibrary.d(str)) {
            return b.c(1, 0, 0, 0);
        }
        if (sVar.S != 0) {
            return b.c(2, 0, 0, 0);
        }
        return 140;
    }

    @Override // a3.a
    public final e C(s sVar) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i10 = sVar.s;
        if (i10 == -1) {
            i10 = r0;
        }
        int i11 = i10;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.n0, this.o0, i11, Math.max(this.p0, 1), sVar);
        this.q0 = experimentalFfmpegVideoDecoder;
        Trace.endSection();
        return experimentalFfmpegVideoDecoder;
    }

    @Override // a3.a
    public final void K(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
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
    public final void L(int i10) {
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.q0;
        if (experimentalFfmpegVideoDecoder != null) {
            experimentalFfmpegVideoDecoder.q = i10;
        }
    }

    @Override // i2.f
    public final String j() {
        return "ExperimentalFfmpegVideoRenderer";
    }
}
