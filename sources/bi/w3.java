package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qo0;
import org.telegram.ui.rp0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
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
                h7 h7Var = (h7) this.d;
                qf.c cVar = (qf.c) this.e;
                zh.i0 i0Var = (zh.i0) this.f;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    i5 i5Var = h7Var.R0;
                    if (i5Var != null) {
                        i5Var.b(this.b, this.c, i0Var != null);
                    }
                    if (i0Var != null) {
                        AndroidUtilities.runOnUIThread(new a4(i0Var, 0));
                        h7Var.skipDismissAnimation();
                    }
                    h7Var.dismiss();
                    break;
                }
                break;
            default:
                rp0.V((rp0) this.d, (boolean[]) this.e, this.b, this.c, (qo0) this.f, (d6) obj, (qf.c) obj2);
                break;
        }
    }
}
