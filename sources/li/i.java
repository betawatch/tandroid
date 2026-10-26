package li;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((q) this.b).c0();
                break;
            case 1:
                ((b2) this.b).x0();
                break;
            case 2:
                v3 v3Var = (v3) this.b;
                v3Var.i3 = (view2 == null || v3Var.F(view2) == null) ? false : true;
                if (view2 instanceof g1) {
                    v3Var.T3 = (g1) view2;
                    break;
                }
                break;
            default:
                p5 p5Var = (p5) this.b;
                p5Var.w();
                r5 r5Var = p5Var.v;
                if (r5Var != null) {
                    r5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
