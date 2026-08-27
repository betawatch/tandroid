package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ap0;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
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
                i5 i5Var = (i5) this.d;
                we.d dVar = (we.d) this.e;
                gh.x0 x0Var = (gh.x0) this.f;
                dVar.b();
                if (((Boolean) obj).booleanValue()) {
                    s3 s3Var = i5Var.K0;
                    if (s3Var != null) {
                        s3Var.a(this.b, this.c, x0Var != null);
                    }
                    if (x0Var != null) {
                        AndroidUtilities.runOnUIThread(new gh.q0(x0Var, 2));
                        i5Var.skipDismissAnimation();
                    }
                    i5Var.dismiss();
                    break;
                }
                break;
            default:
                ap0.V((ap0) this.d, (boolean[]) this.e, this.b, this.c, (ib0) this.f, (k4) obj, (we.d) obj2);
                break;
        }
    }
}
