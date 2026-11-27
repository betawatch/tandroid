// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i85 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j95 b;

    public /* synthetic */ i85(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                j95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                j95Var.T3.h(null);
                hl.V3(j95Var.e4);
                j95Var.b.requestLayout();
                break;
            default:
                j95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                j95Var.T3.h(null);
                hl.V3(j95Var.e4);
                j95Var.b.requestLayout();
                break;
        }
        return false;
    }
}
