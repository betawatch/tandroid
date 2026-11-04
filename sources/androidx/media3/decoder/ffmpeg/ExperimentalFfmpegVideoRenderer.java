package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import c3.i0;
import d2.u0;
import d2.v;
import g2.n0;
import j2.e;
import k2.p1;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends c3.a {
    public static final int s0 = ((n0.g(720, 64) * n0.g(1280, 64)) * 6144) / 2;
    public final int o0;
    public final int p0;
    public final int q0;
    public ExperimentalFfmpegVideoDecoder r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j10, Handler handler, i0 i0Var, int i3) {
        super(j10, handler, i0Var, i3);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.q0 = availableProcessors;
        this.o0 = 4;
        this.p0 = 4;
    }

    @Override // k2.b
    public final int C(v vVar) {
        String str = vVar.s;
        String str2 = FfmpegLibrary.a;
        return !u0.m(str) ? p1.a(0, 0, 0, 0) : !FfmpegLibrary.d(str) ? p1.a(1, 0, 0, 0) : vVar.T != 0 ? p1.a(2, 0, 0, 0) : hs.W1;
    }

    @Override // c3.a
    public final e F(v vVar) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i3 = vVar.t;
        if (i3 == -1) {
            i3 = s0;
        }
        int i10 = i3;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.o0, this.p0, i10, Math.max(this.q0, 1), vVar);
        this.r0 = experimentalFfmpegVideoDecoder;
        Trace.endSection();
        return experimentalFfmpegVideoDecoder;
    }

    @Override // c3.a
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

    @Override // c3.a
    public final void O(int i3) {
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.r0;
        if (experimentalFfmpegVideoDecoder != null) {
            experimentalFfmpegVideoDecoder.q = i3;
        }
    }

    @Override // k2.b
    public final String j() {
        return "ExperimentalFfmpegVideoRenderer";
    }
}
