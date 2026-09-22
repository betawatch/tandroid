package ii;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ((d2) this.b).w0();
                break;
            case 2:
                w3 w3Var = (w3) this.b;
                w3Var.a3 = (view2 == null || w3Var.G(view2) == null) ? false : true;
                if (view2 instanceof i1) {
                    w3Var.L3 = (i1) view2;
                    break;
                }
                break;
            default:
                o5 o5Var = (o5) this.b;
                o5Var.x();
                q5 q5Var = o5Var.v;
                if (q5Var != null) {
                    q5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
