package oi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ((z1) this.b).B0();
                break;
            case 2:
                q3 q3Var = (q3) this.b;
                q3Var.i3 = (view2 == null || q3Var.F(view2) == null) ? false : true;
                if (view2 instanceof e1) {
                    q3Var.T3 = (e1) view2;
                    break;
                }
                break;
            default:
                k5 k5Var = (k5) this.b;
                k5Var.z();
                m5 m5Var = k5Var.w;
                if (m5Var != null) {
                    m5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
