package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        gl.d3(new va7((Object) this, (Object) sArr, i, (byte) 26));
    }

    public void destroy() {
        Utilities.h.c(new s54((Object) this, (byte) 4));
    }
}
