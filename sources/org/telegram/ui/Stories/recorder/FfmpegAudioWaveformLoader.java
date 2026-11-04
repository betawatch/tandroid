package org.telegram.ui.Stories.recorder;

import ai.e3;
import ei.z5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.n10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class FfmpegAudioWaveformLoader {
    private n10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i3, n10 n10Var) {
        this.onChunkReceived = n10Var;
        Utilities.h.c(new e3(this, str, i3, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init, reason: merged with bridge method [inline-methods] */
    public native void lambda$new$0(String str, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$2() {
        this.running = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$receiveChunk$1(short[] sArr, int i3) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i3));
    }

    private void receiveChunk(short[] sArr, int i3) {
        g0.h3(new e3(this, sArr, i3, 12));
    }

    public void destroy() {
        Utilities.h.c(new z5(this, 26));
    }
}
