package ii;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((e2) this.b).w0();
                break;
            case 2:
                x3 x3Var = (x3) this.b;
                x3Var.Y2 = (view2 == null || x3Var.F(view2) == null) ? false : true;
                if (view2 instanceof i1) {
                    x3Var.J3 = (i1) view2;
                    break;
                }
                break;
            default:
                q5 q5Var = (q5) this.b;
                q5Var.x();
                s5 s5Var = q5Var.v;
                if (s5Var != null) {
                    s5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
