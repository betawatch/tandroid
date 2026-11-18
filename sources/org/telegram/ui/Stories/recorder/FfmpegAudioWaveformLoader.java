package org.telegram.ui.Stories.recorder;

import ai.a1;
import hi.k;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class FfmpegAudioWaveformLoader {
    private q10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, q10 q10Var) {
        this.onChunkReceived = q10Var;
        Utilities.h.c(new a1(this, str, i7, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init, reason: merged with bridge method [inline-methods] */
    public native void lambda$new$0(String str, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$2() {
        this.running = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$receiveChunk$1(short[] sArr, int i7) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i7));
    }

    private void receiveChunk(short[] sArr, int i7) {
        g0.g3(new a1(this, sArr, i7, 15));
    }

    public void destroy() {
        Utilities.h.c(new k(this, 9));
    }
}
