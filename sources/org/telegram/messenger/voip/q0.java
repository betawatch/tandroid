package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0(Object obj, int i7) {
        this.a = i7;
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
