package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class FfmpegAudioWaveformLoader {
    private icc onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i, icc iccVar) {
        this.onChunkReceived = iccVar;
        Utilities.h.c(new ze7((Object) this, (Object) str, i, (byte) 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init, reason: merged with bridge method [inline-methods] */
    public native void lambda$new$0(String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$2() {
        this.running = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$receiveChunk$1(short[] sArr, int i) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i));
    }

    private void receiveChunk(short[] sArr, int i) {
        hl.c3(new ze7((Object) this, (Object) sArr, i, (byte) 26));
    }

    public void destroy() {
        Utilities.h.c(new lw3((Object) this, (byte) 17));
    }
}
