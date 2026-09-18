package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                ((VoIPPendingCall) this.b).lambda$new$1();
                break;
            default:
                ((NativeInstance) this.b).stopGroup();
                break;
        }
    }
}
