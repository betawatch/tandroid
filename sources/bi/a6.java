package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wr;
import org.telegram.ui.cm0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                r7.a0((ad) obj2, (Integer) obj);
                break;
            case 1:
                di.n3 n3Var = (di.n3) obj2;
                Float f7 = (Float) obj;
                n3Var.y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(wr.f);
                    duration.addUpdateListener(new di.g2(n3Var, 1));
                    duration.addListener(new h(n3Var, 10));
                    duration.start();
                    break;
                }
                break;
            case 2:
                di.u4 u4Var = (di.u4) obj2;
                Float f10 = (Float) obj;
                u4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(wr.f);
                    duration2.addUpdateListener(new di.l4(u4Var, 0));
                    duration2.addListener(new h(u4Var, 11));
                    duration2.start();
                    u4Var.L();
                    break;
                }
                break;
            case 3:
                ((fg.m) obj2).R.z4(((Float) obj).floatValue());
                break;
            case 4:
                ((og.v) obj2).h(((Integer) obj).intValue());
                break;
            case 5:
                wh.y4 y4Var = (wh.y4) obj2;
                if (((c5.h) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new wh.o4(y4Var, 1));
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.h) obj).a;
                boolean z10 = i11 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i11);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new cm0(callback2, z10, responseCodeString, 12));
                break;
        }
    }
}
