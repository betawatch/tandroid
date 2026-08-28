package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.eb0;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i9) {
        this.a = i9;
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
                k5 k5Var = (k5) this.d;
                ve.d dVar = (ve.d) this.e;
                fh.z0 z0Var = (fh.z0) this.f;
                dVar.b();
                if (((Boolean) obj).booleanValue()) {
                    u3 u3Var = k5Var.K0;
                    if (u3Var != null) {
                        u3Var.a(this.b, this.c, z0Var != null);
                    }
                    if (z0Var != null) {
                        AndroidUtilities.runOnUIThread(new fh.s0(z0Var, 2));
                        k5Var.skipDismissAnimation();
                    }
                    k5Var.dismiss();
                    break;
                }
                break;
            default:
                zo0.U((zo0) this.d, (boolean[]) this.e, this.b, this.c, (eb0) this.f, (m4) obj, (ve.d) obj2);
                break;
        }
    }
}
