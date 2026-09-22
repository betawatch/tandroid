package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                aq0.U((aq0) this.d, (boolean[]) this.e, this.b, this.c, (yo0) this.f, (yh.c3) obj, (nf.e) obj2);
                break;
            default:
                yh.z3 z3Var = (yh.z3) this.d;
                nf.e eVar = (nf.e) this.e;
                xh.j0 j0Var = (xh.j0) this.f;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    yh.l2 l2Var = z3Var.O0;
                    if (l2Var != null) {
                        l2Var.b(this.b, this.c, j0Var != null);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        z3Var.skipDismissAnimation();
                    }
                    z3Var.dismiss();
                    break;
                }
                break;
        }
    }
}
