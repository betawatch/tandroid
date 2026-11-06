package org.telegram.ui.Stories.recorder;

import ai.e0;
import di.s7;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class FfmpegAudioWaveformLoader {
    private v10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, v10 v10Var) {
        this.onChunkReceived = v10Var;
        Utilities.h.c(new e0(this, str, i7, 9));
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
        g0.h3(new e0(this, sArr, i7, 10));
    }

    public void destroy() {
        Utilities.h.c(new s7(this, 22));
    }
}
