package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i10) {
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
                ((AudioTrackJNI) this.b).lambda$startThread$0();
                break;
            case 3:
                ((VoIPPendingCall) this.b).lambda$new$1();
                break;
            default:
                ((NativeInstance) this.b).stopGroup();
                break;
        }
    }
}
