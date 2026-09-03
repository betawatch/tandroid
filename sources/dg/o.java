package dg;

import android.animation.ValueAnimator;
import lh.e6;
import lh.u5;
import mh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import qh.a5;
import qh.e9;
import qh.i2;
import sh.g3;
import sh.n3;
import sh.p2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
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
                ((y) obj2).h(((Integer) obj).intValue());
                break;
            case 1:
                e6 e6Var = (e6) obj2;
                if (((p2.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new u5(e6Var, 1));
                    break;
                }
                break;
            case 2:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i12 = ((p2.h) obj).a;
                boolean z4 = i12 == 0;
                String responseCodeString = z4 ? null : BillingController.getResponseCodeString(i12);
                FileLog.d("StarsController.buy onResult " + z4 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new r5(callback2, z4, responseCodeString, i11));
                break;
            case 3:
                a5.a0((e9) obj2, (Integer) obj);
                break;
            case 4:
                p2 p2Var = (p2) obj2;
                Float f10 = (Float) obj;
                p2Var.y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(pr.f);
                    duration.addUpdateListener(new sh.p1(p2Var, 1));
                    duration.addListener(new i2(p2Var, 9));
                    duration.start();
                    break;
                }
                break;
            case 5:
                n3 n3Var = (n3) obj2;
                Float f11 = (Float) obj;
                n3Var.F.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(pr.f);
                    duration2.addUpdateListener(new g3(n3Var, 0));
                    duration2.addListener(new i2(n3Var, 10));
                    duration2.start();
                    n3Var.K();
                    break;
                }
                break;
            default:
                ((uf.k) obj2).O.z4(((Float) obj).floatValue());
                break;
        }
    }
}
