package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import d3.h0;
import e2.s0;
import e2.u;
import h2.m0;
import jg.g;
import k2.e;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends d3.a {
    public static final int r0 = ((m0.g(720, 64) * m0.g(1280, 64)) * 6144) / 2;
    public final int n0;
    public final int o0;
    public final int p0;
    public ExperimentalFfmpegVideoDecoder q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j3, Handler handler, h0 h0Var, int i7) {
        super(j3, handler, h0Var, i7);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.p0 = availableProcessors;
        this.n0 = 4;
        this.o0 = 4;
    }

    @Override // l2.b
    public final int C(u uVar) {
        String str = uVar.s;
        String str2 = FfmpegLibrary.a;
        return !s0.m(str) ? g.b(0, 0, 0, 0) : !FfmpegLibrary.d(str) ? g.b(1, 0, 0, 0) : uVar.T != 0 ? g.b(2, 0, 0, 0) : qs.W1;
    }

    @Override // d3.a
    public final e F(u uVar) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i7 = uVar.t;
        if (i7 == -1) {
            i7 = r0;
        }
        int i10 = i7;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.n0, this.o0, i10, Math.max(this.p0, 1), uVar);
        this.q0 = experimentalFfmpegVideoDecoder;
        Trace.endSection();
        return experimentalFfmpegVideoDecoder;
    }

    @Override // d3.a
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

    @Override // d3.a
    public final void O(int i7) {
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.q0;
        if (experimentalFfmpegVideoDecoder != null) {
            experimentalFfmpegVideoDecoder.q = i7;
        }
    }

    @Override // l2.b
    public final String i() {
        return "ExperimentalFfmpegVideoRenderer";
    }
}
