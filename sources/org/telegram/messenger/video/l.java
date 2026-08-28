package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.wy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Object obj, boolean z10, boolean z11, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = z10;
        this.c = z11;
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
                ((wy) this.d).Q(false, this.b, this.c);
                break;
        }
    }
}
