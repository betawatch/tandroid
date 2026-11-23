package oi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((o) this.b).e0();
                break;
            case 1:
                ((b2) this.b).B0();
                break;
            case 2:
                t3 t3Var = (t3) this.b;
                t3Var.i3 = (view2 == null || t3Var.F(view2) == null) ? false : true;
                if (view2 instanceof f1) {
                    t3Var.T3 = (f1) view2;
                    break;
                }
                break;
            default:
                m5 m5Var = (m5) this.b;
                m5Var.z();
                o5 o5Var = m5Var.w;
                if (o5Var != null) {
                    o5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
