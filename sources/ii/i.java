package ii;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                ((r) this.b).Y();
                break;
            case 1:
                ((e2) this.b).w0();
                break;
            case 2:
                x3 x3Var = (x3) this.b;
                x3Var.h3 = (view2 == null || x3Var.F(view2) == null) ? false : true;
                if (view2 instanceof i1) {
                    x3Var.S3 = (i1) view2;
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
