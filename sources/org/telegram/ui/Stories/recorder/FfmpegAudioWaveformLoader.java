package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class FfmpegAudioWaveformLoader {
    private i8c onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i, i8c i8cVar) {
        this.onChunkReceived = i8cVar;
        Utilities.h.c(new va7((Object) this, (Object) str, i, (byte) 25));
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
        gl.c3(new va7((Object) this, (Object) sArr, i, (byte) 26));
    }

    public void destroy() {
        Utilities.h.c(new s54((Object) this, (byte) 4));
    }
}
