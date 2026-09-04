package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                bq0.U((bq0) this.d, (boolean[]) this.e, this.b, this.c, (zo0) this.f, (zh.a3) obj, (of.e) obj2);
                break;
            default:
                zh.w3 w3Var = (zh.w3) this.d;
                of.e eVar = (of.e) this.e;
                yh.j0 j0Var = (yh.j0) this.f;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    zh.j2 j2Var = w3Var.O0;
                    if (j2Var != null) {
                        j2Var.b(this.b, this.c, j0Var != null);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new yh.d0(j0Var, 2));
                        w3Var.skipDismissAnimation();
                    }
                    w3Var.dismiss();
                    break;
                }
                break;
        }
    }
}
