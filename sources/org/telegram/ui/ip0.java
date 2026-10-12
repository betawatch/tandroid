package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ip0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j10;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                gq0.U((gq0) this.d, (boolean[]) this.e, this.b, this.c, (ep0) this.f, (zh.v2) obj, (pf.c) obj2);
                break;
            default:
                zh.r3 r3Var = (zh.r3) this.d;
                pf.c cVar = (pf.c) this.e;
                yh.k0 k0Var = (yh.k0) this.f;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    zh.f2 f2Var = r3Var.P0;
                    if (f2Var != null) {
                        f2Var.b(this.b, this.c, k0Var != null);
                    }
                    if (k0Var != null) {
                        AndroidUtilities.runOnUIThread(new yh.e0(k0Var, 2));
                        r3Var.skipDismissAnimation();
                    }
                    r3Var.dismiss();
                    break;
                }
                break;
        }
    }
}
