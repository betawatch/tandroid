// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
