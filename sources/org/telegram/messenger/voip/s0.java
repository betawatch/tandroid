package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((VoIPService.1) this.b).lambda$run$0();
                break;
            case 1:
                ((VoIPService.9) this.b).lambda$run$0();
                break;
            case 2:
                ((VoIPPendingCall) this.b).lambda$new$1();
                break;
            case 3:
                ((NativeInstance) this.b).stopGroup();
                break;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.b);
                break;
        }
    }
}
