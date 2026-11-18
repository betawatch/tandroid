package oi;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                s3 s3Var = (s3) this.b;
                s3Var.i3 = (view2 == null || s3Var.F(view2) == null) ? false : true;
                if (view2 instanceof e1) {
                    s3Var.T3 = (e1) view2;
                    break;
                }
                break;
            default:
                l5 l5Var = (l5) this.b;
                l5Var.z();
                n5 n5Var = l5Var.w;
                if (n5Var != null) {
                    n5Var.invalidate();
                    break;
                }
                break;
        }
    }
}
