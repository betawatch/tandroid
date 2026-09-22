package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.bm0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                r6.a0((qb) obj2, (Integer) obj);
                break;
            case 1:
                ei.k3 k3Var = (ei.k3) obj2;
                Float f7 = (Float) obj;
                k3Var.y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(qr.f);
                    duration.addUpdateListener(new ei.d2(k3Var, 1));
                    duration.addListener(new ai.b(k3Var, 21));
                    duration.start();
                    break;
                }
                break;
            case 2:
                ei.q4 q4Var = (ei.q4) obj2;
                Float f10 = (Float) obj;
                q4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(qr.f);
                    duration2.addUpdateListener(new ei.h4(q4Var, 0));
                    duration2.addListener(new ai.b(q4Var, 22));
                    duration2.start();
                    q4Var.L();
                    break;
                }
                break;
            case 3:
                ((gg.m) obj2).R.z4(((Float) obj).floatValue());
                break;
            case 4:
                ((pg.u) obj2).h(((Integer) obj).intValue());
                break;
            case 5:
                xh.y4 y4Var = (xh.y4) obj2;
                if (((c5.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new xh.o4(y4Var, 1));
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.h) obj).a;
                boolean z10 = i11 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i11);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new bm0(callback2, z10, responseCodeString, 12));
                break;
        }
    }
}
