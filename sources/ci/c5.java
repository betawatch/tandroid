package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.ha0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                q6.a0((nb) obj2, (Integer) obj);
                break;
            case 1:
                ei.k3 k3Var = (ei.k3) obj2;
                Float f7 = (Float) obj;
                k3Var.y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(hs.f);
                    duration.addUpdateListener(new ei.d2(k3Var, 1));
                    duration.addListener(new ai.b(k3Var, 21));
                    duration.start();
                    break;
                }
                break;
            case 2:
                ei.p4 p4Var = (ei.p4) obj2;
                Float f10 = (Float) obj;
                p4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(hs.f);
                    duration2.addUpdateListener(new ei.h4(p4Var, 0));
                    duration2.addListener(new ai.b(p4Var, 22));
                    duration2.start();
                    p4Var.O();
                    break;
                }
                break;
            case 3:
                ((gg.m) obj2).R.w4(((Float) obj).floatValue());
                break;
            case 4:
                ((pg.u) obj2).h(((Integer) obj).intValue());
                break;
            case 5:
                xh.z4 z4Var = (xh.z4) obj2;
                if (((c5.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new xh.p4(z4Var, 1));
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.h) obj).a;
                boolean z10 = i11 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i11);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new ha0(callback2, z10, responseCodeString, 15));
                break;
        }
    }
}
