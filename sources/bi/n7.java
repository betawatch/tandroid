package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n7(Object obj, int i10) {
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
                int i12 = ((d5.i) obj).a;
                boolean z10 = i12 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i12);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new u7(callback2, z10, responseCodeString, i11));
                break;
            case 1:
                fi.e6.Y((fi.ta) obj2, (Integer) obj);
                break;
            case 2:
                hi.m3 m3Var = (hi.m3) obj2;
                Float f7 = (Float) obj;
                m3Var.E.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(ds.f);
                    duration.addUpdateListener(new hi.f2(m3Var, 1));
                    duration.addListener(new bh.b(m3Var, 28));
                    duration.start();
                    break;
                }
                break;
            case 3:
                hi.o4 o4Var = (hi.o4) obj2;
                Float f10 = (Float) obj;
                o4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(ds.f);
                    duration2.addUpdateListener(new hi.g4(o4Var, i11));
                    duration2.addListener(new bh.b(o4Var, 29));
                    duration2.start();
                    o4Var.O();
                    break;
                }
                break;
            case 4:
                ((ig.n) obj2).R.H4(((Float) obj).floatValue());
                break;
            case 5:
                ((rg.v) obj2).h(((Integer) obj).intValue());
                break;
            default:
                zh.y4 y4Var = (zh.y4) obj2;
                if (((d5.i) obj).a == 0) {
                    AndroidUtilities.runOnUIThread(new zh.o4(y4Var, 1));
                    break;
                }
                break;
        }
    }
}
