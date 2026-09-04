package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.dm0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                q6.a0((rb) obj2, (Integer) obj);
                break;
            case 1:
                fi.k3 k3Var = (fi.k3) obj2;
                Float f7 = (Float) obj;
                k3Var.y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(pr.f);
                    duration.addUpdateListener(new fi.d2(k3Var, 1));
                    duration.addListener(new ah.b(k3Var, 24));
                    duration.start();
                    break;
                }
                break;
            case 2:
                fi.r4 r4Var = (fi.r4) obj2;
                Float f10 = (Float) obj;
                r4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(pr.f);
                    duration2.addUpdateListener(new fi.h4(r4Var, 0));
                    duration2.addListener(new ah.b(r4Var, 25));
                    duration2.start();
                    r4Var.L();
                    break;
                }
                break;
            case 3:
                ((hg.m) obj2).R.z4(((Float) obj).floatValue());
                break;
            case 4:
                ((qg.u) obj2).h(((Integer) obj).intValue());
                break;
            case 5:
                yh.x4 x4Var = (yh.x4) obj2;
                if (((c5.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new yh.n4(x4Var, 1));
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.h) obj).a;
                boolean z10 = i11 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i11);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new dm0(callback2, z10, responseCodeString, 12));
                break;
        }
    }
}
