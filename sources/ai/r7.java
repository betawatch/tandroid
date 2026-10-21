package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r7(Object obj, int i10) {
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
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i12 = ((c5.i) obj).a;
                boolean z10 = i12 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i12);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new y7(callback2, z10, responseCodeString, i11));
                break;
            case 1:
                ei.f6.a0((ei.xa) obj2, (Integer) obj);
                break;
            case 2:
                gi.d3 d3Var = (gi.d3) obj2;
                Float f7 = (Float) obj;
                d3Var.y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(bs.f);
                    duration.addUpdateListener(new gi.x1(d3Var, 1));
                    duration.addListener(new ah.b(d3Var, 26));
                    duration.start();
                    break;
                }
                break;
            case 3:
                gi.f4 f4Var = (gi.f4) obj2;
                Float f10 = (Float) obj;
                f4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(bs.f);
                    duration2.addUpdateListener(new gi.x3(f4Var, i11));
                    duration2.addListener(new ah.b(f4Var, 27));
                    duration2.start();
                    f4Var.O();
                    break;
                }
                break;
            case 4:
                ((hg.m) obj2).R.x4(((Float) obj).floatValue());
                break;
            case 5:
                ((qg.v) obj2).h(((Integer) obj).intValue());
                break;
            default:
                yh.x4 x4Var = (yh.x4) obj2;
                if (((c5.i) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new yh.n4(x4Var, 1));
                    break;
                }
                break;
        }
    }
}
