package ki;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                w3Var.Y2 = (view2 == null || w3Var.F(view2) == null) ? false : true;
                if (view2 instanceof h1) {
                    w3Var.J3 = (h1) view2;
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
