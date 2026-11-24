package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class FfmpegAudioWaveformLoader {
    private jac onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i, jac jacVar) {
        this.onChunkReceived = jacVar;
        Utilities.h.c(new wc7((Object) this, (Object) str, i, (byte) 25));
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
        gm.c3(new wc7((Object) this, (Object) sArr, i, (byte) 26));
    }

    public void destroy() {
        Utilities.h.c(new a14((Object) this, (byte) 11));
    }
}
