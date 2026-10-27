package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.so0;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                tp0.V((tp0) this.d, (boolean[]) this.e, this.b, this.c, (so0) this.f, (d6) obj, (qf.c) obj2);
                break;
        }
    }
}
