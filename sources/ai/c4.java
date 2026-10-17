package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ho0;
import org.telegram.ui.jp0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c4(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
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
                k7 k7Var = (k7) this.d;
                pf.c cVar = (pf.c) this.e;
                yh.j0 j0Var = (yh.j0) this.f;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    m5 m5Var = k7Var.R0;
                    if (m5Var != null) {
                        m5Var.a(this.b, this.c, j0Var != null);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new f4(j0Var, 0));
                        k7Var.skipDismissAnimation();
                    }
                    k7Var.dismiss();
                    break;
                }
                break;
            default:
                jp0.U((jp0) this.d, (boolean[]) this.e, this.b, this.c, (ho0) this.f, (h6) obj, (pf.c) obj2);
                break;
        }
    }
}
