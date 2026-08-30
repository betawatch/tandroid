package cg;

import android.animation.ValueAnimator;
import kh.e6;
import kh.u5;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import ph.c5;
import ph.h9;
import ph.j2;
import rh.h3;
import rh.o3;
import rh.q2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                c5.a0((h9) obj2, (Integer) obj);
                break;
            case 4:
                q2 q2Var = (q2) obj2;
                Float f10 = (Float) obj;
                q2Var.y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(nr.f);
                    duration.addUpdateListener(new rh.q1(q2Var, 1));
                    duration.addListener(new j2(q2Var, 9));
                    duration.start();
                    break;
                }
                break;
            case 5:
                o3 o3Var = (o3) obj2;
                Float f11 = (Float) obj;
                o3Var.F.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(nr.f);
                    duration2.addUpdateListener(new h3(o3Var, 0));
                    duration2.addListener(new j2(o3Var, 10));
                    duration2.start();
                    o3Var.K();
                    break;
                }
                break;
            default:
                ((tf.k) obj2).O.z4(((Float) obj).floatValue());
                break;
        }
    }
}
