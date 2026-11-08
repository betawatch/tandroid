package li;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((p) this.b).e0();
                break;
            case 1:
                ((b2) this.b).B0();
                break;
            case 2:
                t3 t3Var = (t3) this.b;
                t3Var.h3 = (view2 == null || t3Var.F(view2) == null) ? false : true;
                if (view2 instanceof g1) {
                    t3Var.S3 = (g1) view2;
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
