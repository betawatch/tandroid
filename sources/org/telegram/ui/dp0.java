package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
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
                cq0.U((cq0) this.d, (boolean[]) this.e, this.b, this.c, (zo0) this.f, (yh.b3) obj, (nf.e) obj2);
                break;
            default:
                yh.y3 y3Var = (yh.y3) this.d;
                nf.e eVar = (nf.e) this.e;
                xh.j0 j0Var = (xh.j0) this.f;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    yh.k2 k2Var = y3Var.O0;
                    if (k2Var != null) {
                        k2Var.b(this.b, this.c, j0Var != null);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        y3Var.skipDismissAnimation();
                    }
                    y3Var.dismiss();
                    break;
                }
                break;
        }
    }
}
