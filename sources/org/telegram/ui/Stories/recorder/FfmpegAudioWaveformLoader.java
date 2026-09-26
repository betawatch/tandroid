package org.telegram.ui.Stories.recorder;

import ai.s1;
import androidx.fragment.app.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i10, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new s1(this, str, i10, 3));
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
        this.onChunkReceived.run(sArr, Integer.valueOf(i10));
    }

    private void receiveChunk(short[] sArr, int i10) {
        AndroidUtilities.runOnUIThread(new s1(this, sArr, i10, 4));
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new a0(this, 15));
    }
}
