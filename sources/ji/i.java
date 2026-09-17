package ji;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
                ((r) this.b).Z();
                break;
            case 1:
                ((c2) this.b).w0();
                break;
            case 2:
                v3 v3Var = (v3) this.b;
                v3Var.a3 = (view2 == null || v3Var.F(view2) == null) ? false : true;
                if (view2 instanceof h1) {
                    v3Var.L3 = (h1) view2;
                    break;
                }
                break;
            default:
                s5 s5Var = (s5) this.b;
                s5Var.x();
                u5 u5Var = s5Var.v;
                if (u5Var != null) {
                    u5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
