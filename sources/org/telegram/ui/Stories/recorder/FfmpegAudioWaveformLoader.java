package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.ui.Wallet.x0;
import vh.d0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class FfmpegAudioWaveformLoader {
    private j20 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i10, j20 j20Var) {
        this.onChunkReceived = j20Var;
        Utilities.h.c(new x0(this, str, i10, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init, reason: merged with bridge method [inline-methods] */
    public native void lambda$new$0(String str, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$2() {
        this.running = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$receiveChunk$1(short[] sArr, int i10) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i10));
    }

    private void receiveChunk(short[] sArr, int i10) {
        i0.g3(new x0(this, sArr, i10, 20));
    }

    public void destroy() {
        Utilities.h.c(new d0(this, 7));
    }
}
