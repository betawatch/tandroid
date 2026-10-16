package ji;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
