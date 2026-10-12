package ji;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((r) this.b).c0();
                break;
            case 1:
                ((d2) this.b).w0();
                break;
            case 2:
                x3 x3Var = (x3) this.b;
                x3Var.Y2 = (view2 == null || x3Var.F(view2) == null) ? false : true;
                if (view2 instanceof h1) {
                    x3Var.J3 = (h1) view2;
                    break;
                }
                break;
            default:
                u5 u5Var = (u5) this.b;
                u5Var.x();
                w5 w5Var = u5Var.v;
                if (w5Var != null) {
                    w5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
