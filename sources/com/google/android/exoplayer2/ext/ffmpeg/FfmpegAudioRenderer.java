package com.google.android.exoplayer2.ext.ffmpeg;

import android.os.Handler;
import androidx.biometric.e;
import f5.d0;
import j3.s0;
import j3.t0;
import l3.b0;
import l3.g0;
import l3.j;
import l3.o;
import l3.t;
import m3.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends b0 {
    private static final int DEFAULT_INPUT_BUFFER_SIZE = 5760;
    private static final int NUM_BUFFERS = 16;
    private static final String TAG = "FfmpegAudioRenderer";

    public FfmpegAudioRenderer() {
        this((Handler) null, (o) null, new j[0]);
    }

    private boolean shouldOutputFloat(t0 t0Var) {
        if (!sinkSupportsFormat(t0Var, 2)) {
            return true;
        }
        if (getSinkFormatSupport(d0.v(4, t0Var.O, t0Var.P)) != 2) {
            return false;
        }
        return !"audio/ac3".equals(t0Var.B);
    }

    private boolean sinkSupportsFormat(t0 t0Var, int i10) {
        return sinkSupportsFormat(d0.v(i10, t0Var.O, t0Var.P));
    }

    @Override // j3.e, j3.h2
    public String getName() {
        return TAG;
    }

    @Override // l3.b0
    public int supportsFormatInternal(t0 t0Var) {
        String str = t0Var.B;
        str.getClass();
        if (!FfmpegLibrary.isAvailable() || !f5.o.h(str)) {
            return 0;
        }
        if (!FfmpegLibrary.supportsFormat(str)) {
            return 1;
        }
        if (sinkSupportsFormat(t0Var, 2) || sinkSupportsFormat(t0Var, 4)) {
            return t0Var.W != 0 ? 2 : 4;
        }
        return 1;
    }

    @Override // j3.e, j3.h2
    public int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FfmpegAudioRenderer(Handler handler, o oVar, j... jVarArr) {
        this(handler, oVar, r0.c());
        e eVar = new e(29);
        jVarArr.getClass();
        eVar.c = new g0(jVarArr);
    }

    @Override // l3.b0
    public FfmpegAudioDecoder createDecoder(t0 t0Var, b bVar) {
        f5.a.c("createFfmpegAudioDecoder");
        int i10 = t0Var.C;
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(t0Var, 16, 16, i10 != -1 ? i10 : DEFAULT_INPUT_BUFFER_SIZE, shouldOutputFloat(t0Var));
        f5.a.q();
        return ffmpegAudioDecoder;
    }

    @Override // l3.b0
    public t0 getOutputFormat(FfmpegAudioDecoder ffmpegAudioDecoder) {
        ffmpegAudioDecoder.getClass();
        s0 s0Var = new s0();
        s0Var.o = "audio/raw";
        s0Var.B = ffmpegAudioDecoder.getChannelCount();
        s0Var.C = ffmpegAudioDecoder.getSampleRate();
        s0Var.D = ffmpegAudioDecoder.getEncoding();
        return new t0(s0Var);
    }

    public FfmpegAudioRenderer(Handler handler, o oVar, t tVar) {
        super(handler, oVar, tVar);
    }

    @Override // j3.e
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f9, float f10) {
    }
}
