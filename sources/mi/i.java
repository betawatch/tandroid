package mi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((p) this.b).e0();
                break;
            case 1:
                ((c2) this.b).B0();
                break;
            case 2:
                t3 t3Var = (t3) this.b;
                t3Var.i3 = (view2 == null || t3Var.F(view2) == null) ? false : true;
                if (view2 instanceof h1) {
                    t3Var.T3 = (h1) view2;
                    break;
                }
                break;
            default:
                n5 n5Var = (n5) this.b;
                n5Var.z();
                p5 p5Var = n5Var.w;
                if (p5Var != null) {
                    p5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
