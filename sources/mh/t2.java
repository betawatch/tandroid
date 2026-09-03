package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.no0;
import org.telegram.ui.np0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
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
                g5 g5Var = (g5) this.d;
                af.f fVar = (af.f) this.e;
                lh.u0 u0Var = (lh.u0) this.f;
                fVar.b();
                if (((Boolean) obj).booleanValue()) {
                    r3 r3Var = g5Var.L0;
                    if (r3Var != null) {
                        r3Var.b(this.b, this.c, u0Var != null);
                    }
                    if (u0Var != null) {
                        AndroidUtilities.runOnUIThread(new lh.n0(u0Var, 2));
                        g5Var.skipDismissAnimation();
                    }
                    g5Var.dismiss();
                    break;
                }
                break;
            default:
                np0.U((np0) this.d, (boolean[]) this.e, this.b, this.c, (no0) this.f, (i4) obj, (af.f) obj2);
                break;
        }
    }
}
