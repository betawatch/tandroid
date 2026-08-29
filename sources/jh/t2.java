package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.tm;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                h5 h5Var = (h5) this.d;
                ye.c cVar = (ye.c) this.e;
                ih.v0 v0Var = (ih.v0) this.f;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    s3 s3Var = h5Var.K0;
                    if (s3Var != null) {
                        s3Var.d(this.b, this.c, v0Var != null);
                    }
                    if (v0Var != null) {
                        AndroidUtilities.runOnUIThread(new ih.o0(v0Var, 2));
                        h5Var.skipDismissAnimation();
                    }
                    h5Var.dismiss();
                    break;
                }
                break;
            default:
                yo0.V((yo0) this.d, (boolean[]) this.e, this.b, this.c, (tm) this.f, (j4) obj, (ye.c) obj2);
                break;
        }
    }
}
