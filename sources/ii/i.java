package ii;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ((e2) this.b).w0();
                break;
            case 2:
                x3 x3Var = (x3) this.b;
                x3Var.a3 = (view2 == null || x3Var.F(view2) == null) ? false : true;
                if (view2 instanceof i1) {
                    x3Var.L3 = (i1) view2;
                    break;
                }
                break;
            default:
                p5 p5Var = (p5) this.b;
                p5Var.x();
                r5 r5Var = p5Var.v;
                if (r5Var != null) {
                    r5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
