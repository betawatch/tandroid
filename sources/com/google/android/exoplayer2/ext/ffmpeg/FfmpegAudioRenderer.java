package com.google.android.exoplayer2.ext.ffmpeg;

import a5.n;
import android.os.Handler;
import d5.g0;
import d5.q;
import h3.s0;
import h3.t0;
import j3.b0;
import j3.j;
import j3.o;
import j3.t;
import k3.b;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        if (getSinkFormatSupport(g0.v(4, t0Var.O, t0Var.P)) != 2) {
            return false;
        }
        return !"audio/ac3".equals(t0Var.B);
    }

    private boolean sinkSupportsFormat(t0 t0Var, int i10) {
        return sinkSupportsFormat(g0.v(i10, t0Var.O, t0Var.P));
    }

    @Override // h3.e, h3.h2
    public String getName() {
        return TAG;
    }

    @Override // j3.b0
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
    public FfmpegAudioRenderer(Handler handler, o oVar, j... jVarArr) {
        this(handler, oVar, r0.e());
        n nVar = new n(25);
        jVarArr.getClass();
        nVar.c = new n(jVarArr);
    }

    @Override // j3.b0
    public FfmpegAudioDecoder createDecoder(t0 t0Var, b bVar) {
        d5.a.c("createFfmpegAudioDecoder");
        int i10 = t0Var.C;
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(t0Var, 16, 16, i10 != -1 ? i10 : DEFAULT_INPUT_BUFFER_SIZE, shouldOutputFloat(t0Var));
        d5.a.q();
        return ffmpegAudioDecoder;
    }

    @Override // j3.b0
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

    @Override // h3.e
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) {
    }
}
