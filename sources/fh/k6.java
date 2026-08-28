package fh;

import android.animation.ValueAnimator;
import kh.ya;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k6 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k6(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i9 = this.a;
        int i10 = 0;
        int i11 = 2;
        char c10 = 1;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                u6 u6Var = (u6) obj2;
                if (((n2.g) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new j6(u6Var, 1));
                    break;
                }
                break;
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i12 = ((n2.g) obj).a;
                boolean z10 = i12 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i12);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new gh.u5(callback2, z10, responseCodeString, i10));
                break;
            case 2:
                kh.g6.a0((ya) obj2, (Integer) obj);
                break;
            case 3:
                mh.c3 c3Var = (mh.c3) obj2;
                Float f10 = (Float) obj;
                c3Var.y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(gr.f);
                    duration.addUpdateListener(new mh.x1(c3Var, 1));
                    duration.addListener(new mh.x(c3Var, c10 == true ? 1 : 0));
                    duration.start();
                    break;
                }
                break;
            case 4:
                mh.g4 g4Var = (mh.g4) obj2;
                Float f11 = (Float) obj;
                g4Var.E.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(gr.f);
                    duration2.addUpdateListener(new mh.x3(g4Var, 0));
                    duration2.addListener(new mh.x(g4Var, i11));
                    duration2.start();
                    g4Var.K();
                    break;
                }
                break;
            case 5:
                ((of.m) obj2).N.z4(((Float) obj).floatValue());
                break;
            default:
                ((xf.u) obj2).h(((Integer) obj).intValue());
                break;
        }
    }
}
