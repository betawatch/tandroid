package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.go0;
import org.telegram.ui.ip0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b4(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
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
                l7 l7Var = (l7) this.d;
                pf.c cVar = (pf.c) this.e;
                yh.i0 i0Var = (yh.i0) this.f;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    n5 n5Var = l7Var.R0;
                    if (n5Var != null) {
                        n5Var.a(this.b, this.c, i0Var != null);
                    }
                    if (i0Var != null) {
                        AndroidUtilities.runOnUIThread(new f4(i0Var, 0));
                        l7Var.skipDismissAnimation();
                    }
                    l7Var.dismiss();
                    break;
                }
                break;
            default:
                ip0.U((ip0) this.d, (boolean[]) this.e, this.b, this.c, (go0) this.f, (i6) obj, (pf.c) obj2);
                break;
        }
    }
}
