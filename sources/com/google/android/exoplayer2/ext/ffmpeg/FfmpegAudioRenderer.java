package com.google.android.exoplayer2.ext.ffmpeg;

import a5.m;
import android.os.Handler;
import d5.f0;
import d5.q;
import h3.s0;
import h3.t0;
import j3.a0;
import j3.j;
import j3.n;
import j3.s;
import k3.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends a0 {
    private static final int DEFAULT_INPUT_BUFFER_SIZE = 5760;
    private static final int NUM_BUFFERS = 16;
    private static final String TAG = "FfmpegAudioRenderer";

    public FfmpegAudioRenderer() {
        this((Handler) null, (n) null, new j[0]);
    }

    private boolean shouldOutputFloat(t0 t0Var) {
        if (!sinkSupportsFormat(t0Var, 2)) {
            return true;
        }
        if (getSinkFormatSupport(f0.v(4, t0Var.O, t0Var.P)) != 2) {
            return false;
        }
        return !"audio/ac3".equals(t0Var.B);
    }

    private boolean sinkSupportsFormat(t0 t0Var, int i9) {
        return sinkSupportsFormat(f0.v(i9, t0Var.O, t0Var.P));
    }

    @Override // h3.e, h3.h2
    public String getName() {
        return TAG;
    }

    @Override // j3.a0
    public int supportsFormatInternal(t0 t0Var) {
        String str = t0Var.B;
        str.getClass();
        if (!FfmpegLibrary.isAvailable() || !q.h(str)) {
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

    @Override // h3.e, h3.h2
    public int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FfmpegAudioRenderer(Handler handler, n nVar, j... jVarArr) {
        this(handler, nVar, r0.d());
        m mVar = new m(28);
        jVarArr.getClass();
        mVar.c = new m(jVarArr);
    }

    @Override // j3.a0
    public FfmpegAudioDecoder createDecoder(t0 t0Var, b bVar) {
        d5.a.c("createFfmpegAudioDecoder");
        int i9 = t0Var.C;
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(t0Var, 16, 16, i9 != -1 ? i9 : DEFAULT_INPUT_BUFFER_SIZE, shouldOutputFloat(t0Var));
        d5.a.q();
        return ffmpegAudioDecoder;
    }

    @Override // j3.a0
    public t0 getOutputFormat(FfmpegAudioDecoder ffmpegAudioDecoder) {
        ffmpegAudioDecoder.getClass();
        s0 s0Var = new s0();
        s0Var.o = "audio/raw";
        s0Var.B = ffmpegAudioDecoder.getChannelCount();
        s0Var.C = ffmpegAudioDecoder.getSampleRate();
        s0Var.D = ffmpegAudioDecoder.getEncoding();
        return new t0(s0Var);
    }

    public FfmpegAudioRenderer(Handler handler, n nVar, s sVar) {
        super(handler, nVar, sVar);
    }

    @Override // h3.e
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) {
    }
}
