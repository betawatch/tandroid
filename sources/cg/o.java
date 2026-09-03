package cg;

import android.animation.ValueAnimator;
import kh.d6;
import kh.t5;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import ph.c5;
import ph.h9;
import ph.j2;
import rh.g3;
import rh.n3;
import rh.p2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                d6 d6Var = (d6) obj2;
                if (((p2.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new t5(d6Var, 1));
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
                p2 p2Var = (p2) obj2;
                Float f10 = (Float) obj;
                p2Var.y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(mr.f);
                    duration.addUpdateListener(new rh.p1(p2Var, 1));
                    duration.addListener(new j2(p2Var, 9));
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
                    duration2.setInterpolator(mr.f);
                    duration2.addUpdateListener(new g3(n3Var, i11));
                    duration2.addListener(new j2(n3Var, 10));
                    duration2.start();
                    n3Var.K();
                    break;
                }
                break;
            default:
                ((tf.k) obj2).O.z4(((Float) obj).floatValue());
                break;
        }
    }
}
