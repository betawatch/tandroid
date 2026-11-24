// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e85 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g95 b;

    public /* synthetic */ e85(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                g95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                g95Var.T3.h(null);
                gm.V3(g95Var.e4);
                g95Var.b.requestLayout();
                break;
            default:
                g95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                g95Var.T3.h(null);
                gm.V3(g95Var.e4);
                g95Var.b.requestLayout();
                break;
        }
        return false;
    }
}
