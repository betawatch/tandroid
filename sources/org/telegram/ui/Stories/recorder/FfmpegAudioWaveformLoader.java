package org.telegram.ui.Stories.recorder;

import ai.a1;
import hi.e1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.s10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class FfmpegAudioWaveformLoader {
    private s10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, s10 s10Var) {
        this.onChunkReceived = s10Var;
        Utilities.h.c(new a1(this, str, i7, 13));
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
        g0.h3(new a1(this, sArr, i7, 14));
    }

    public void destroy() {
        Utilities.h.c(new e1(this, 5));
    }
}
