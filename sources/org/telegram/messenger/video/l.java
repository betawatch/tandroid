package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.mz;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Object obj, boolean z4, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z4;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.b, this.c);
                break;
            case 1:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.b, this.c);
                break;
            case 2:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$1((Utilities.Callback2) this.d, this.b, this.c);
                break;
            default:
                ((mz) this.d).R(false, this.b, this.c);
                break;
        }
    }
}
