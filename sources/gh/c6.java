package gh;

import android.animation.ValueAnimator;
import lh.h9;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c6 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(Object obj, int i10) {
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
                m6 m6Var = (m6) obj2;
                if (((n2.g) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new b6(m6Var, 1));
                    break;
                }
                break;
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i12 = ((n2.g) obj).a;
                boolean z10 = i12 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i12);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new hh.t5(callback2, z10, responseCodeString, i11));
                break;
            case 2:
                lh.f6.a0((va) obj2, (Integer) obj);
                break;
            case 3:
                nh.b3 b3Var = (nh.b3) obj2;
                Float f10 = (Float) obj;
                b3Var.y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(er.f);
                    duration.addUpdateListener(new nh.w1(b3Var, 1));
                    duration.addListener(new h9(b3Var, 3));
                    duration.start();
                    break;
                }
                break;
            case 4:
                nh.e4 e4Var = (nh.e4) obj2;
                Float f11 = (Float) obj;
                e4Var.E.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(er.f);
                    duration2.addUpdateListener(new nh.v3(e4Var, 0));
                    duration2.addListener(new h9(e4Var, 4));
                    duration2.start();
                    e4Var.L();
                    break;
                }
                break;
            case 5:
                ((pf.k) obj2).N.z4(((Float) obj).floatValue());
                break;
            default:
                ((yf.u) obj2).h(((Integer) obj).intValue());
                break;
        }
    }
}
