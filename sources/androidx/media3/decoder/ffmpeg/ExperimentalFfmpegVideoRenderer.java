package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import d3.h0;
import e2.s0;
import e2.u;
import h2.l0;
import i5.c;
import k2.e;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends d3.a {
    public static final int s0 = ((l0.g(720, 64) * l0.g(1280, 64)) * 6144) / 2;
    public final int o0;
    public final int p0;
    public final int q0;
    public ExperimentalFfmpegVideoDecoder r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j3, Handler handler, h0 h0Var, int i7) {
        super(j3, handler, h0Var, i7);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.q0 = availableProcessors;
        this.o0 = 4;
        this.p0 = 4;
    }

    @Override // l2.b
    public final int C(u uVar) {
        String str = uVar.s;
        String str2 = FfmpegLibrary.a;
        return !s0.m(str) ? c.a(0, 0, 0, 0) : !FfmpegLibrary.d(str) ? c.a(1, 0, 0, 0) : uVar.T != 0 ? c.a(2, 0, 0, 0) : ls.W1;
    }

    @Override // d3.a
    public final e F(u uVar) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i7 = uVar.t;
        if (i7 == -1) {
            i7 = s0;
        }
        int i10 = i7;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.o0, this.p0, i10, Math.max(this.q0, 1), uVar);
        this.r0 = experimentalFfmpegVideoDecoder;
        Trace.endSection();
        return experimentalFfmpegVideoDecoder;
    }

    @Override // d3.a
    public final void N(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        try {
            ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.r0;
            if (experimentalFfmpegVideoDecoder == null) {
                throw new FfmpegDecoderException("Failed to render output buffer to surface: decoder is not initialized.");
            }
            experimentalFfmpegVideoDecoder.p(videoDecoderOutputBuffer, surface);
        } finally {
            videoDecoderOutputBuffer.release();
        }
    }

    @Override // d3.a
    public final void O(int i7) {
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.r0;
        if (experimentalFfmpegVideoDecoder != null) {
            experimentalFfmpegVideoDecoder.q = i7;
        }
    }

    @Override // l2.b
    public final String i() {
        return "ExperimentalFfmpegVideoRenderer";
    }
}
