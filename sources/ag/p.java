package ag;

import android.animation.ValueAnimator;
import ih.e6;
import ih.u5;
import jh.r5;
import nh.ja;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.cc1;
import ph.g3;
import ph.n3;
import ph.p2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        int i11 = 0;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((z) obj2).h(((Integer) obj).intValue());
                break;
            case 1:
                e6 e6Var = (e6) obj2;
                if (((p2.g) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new u5(e6Var, 1));
                    break;
                }
                break;
            case 2:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i12 = ((p2.g) obj).a;
                boolean z10 = i12 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i12);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new r5(callback2, z10, responseCodeString, i11));
                break;
            case 3:
                t5.a0((ja) obj2, (Integer) obj);
                break;
            case 4:
                p2 p2Var = (p2) obj2;
                Float f9 = (Float) obj;
                p2Var.y.setLoadProgressAnimated(f9.floatValue());
                if (f9.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(jr.f);
                    duration.addUpdateListener(new ph.p1(p2Var, 1));
                    duration.addListener(new cc1(p2Var, 8));
                    duration.start();
                    break;
                }
                break;
            case 5:
                n3 n3Var = (n3) obj2;
                Float f10 = (Float) obj;
                n3Var.E.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(jr.f);
                    duration2.addUpdateListener(new g3(n3Var, 0));
                    duration2.addListener(new cc1(n3Var, 9));
                    duration2.start();
                    n3Var.K();
                    break;
                }
                break;
            default:
                ((rf.l) obj2).N.z4(((Float) obj).floatValue());
                break;
        }
    }
}
