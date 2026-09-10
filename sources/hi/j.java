package hi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((s) this.b).Z();
                break;
            case 1:
                ((g2) this.b).w0();
                break;
            case 2:
                z3 z3Var = (z3) this.b;
                z3Var.a3 = (view2 == null || z3Var.F(view2) == null) ? false : true;
                if (view2 instanceof k1) {
                    z3Var.L3 = (k1) view2;
                    break;
                }
                break;
            default:
                r5 r5Var = (r5) this.b;
                r5Var.x();
                t5 t5Var = r5Var.v;
                if (t5Var != null) {
                    t5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
