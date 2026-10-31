package bi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.a) {
            case 0:
                ((t) this.b).c0();
                break;
            case 1:
                ((k2) this.b).A0();
                break;
            case 2:
                d4 d4Var = (d4) this.b;
                d4Var.h3 = (view2 == null || d4Var.F(view2) == null) ? false : true;
                if (view2 instanceof n1) {
                    d4Var.S3 = (n1) view2;
                    break;
                }
                break;
            default:
                z5 z5Var = (z5) this.b;
                z5Var.z();
                b6 b6Var = z5Var.w;
                if (b6Var != null) {
                    b6Var.invalidate();
                    break;
                }
                break;
        }
    }
}
