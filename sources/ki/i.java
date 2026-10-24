package ki;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                ((d2) this.b).w0();
                break;
            case 2:
                w3 w3Var = (w3) this.b;
                w3Var.b3 = (view2 == null || w3Var.F(view2) == null) ? false : true;
                if (view2 instanceof h1) {
                    w3Var.M3 = (h1) view2;
                    break;
                }
                break;
            default:
                o5 o5Var = (o5) this.b;
                o5Var.w();
                q5 q5Var = o5Var.v;
                if (q5Var != null) {
                    q5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
