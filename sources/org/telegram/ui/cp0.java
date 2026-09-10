package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                bq0.U((bq0) this.d, (boolean[]) this.e, this.b, this.c, (yo0) this.f, (xh.a3) obj, (nf.e) obj2);
                break;
            default:
                xh.x3 x3Var = (xh.x3) this.d;
                nf.e eVar = (nf.e) this.e;
                wh.k0 k0Var = (wh.k0) this.f;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    xh.k2 k2Var = x3Var.O0;
                    if (k2Var != null) {
                        k2Var.a(this.b, this.c, k0Var != null);
                    }
                    if (k0Var != null) {
                        AndroidUtilities.runOnUIThread(new wh.e0(k0Var, 2));
                        x3Var.skipDismissAnimation();
                    }
                    x3Var.dismiss();
                    break;
                }
                break;
        }
    }
}
