// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e28 implements qq7, ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d38 b;

    public /* synthetic */ e28(d38 d38Var, byte b) {
        this.a = b;
        this.b = d38Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        iq5 H0 = gm.H0(wzcVar, false);
        d38 d38Var = this.b;
        d38Var.c0 = H0;
        m28 m28Var = d38Var.h.b;
        int i = H0.a;
        int paddingTop = m28Var.getPaddingTop();
        iq5 iq5Var = d38Var.c0;
        m28Var.setPadding(i, paddingTop, iq5Var.c, gm.L(72.0f) + iq5Var.d);
        m28 m28Var2 = d38Var.n.b;
        int i2 = d38Var.c0.a;
        int paddingTop2 = m28Var2.getPaddingTop();
        iq5 iq5Var2 = d38Var.c0;
        m28Var2.setPadding(i2, paddingTop2, iq5Var2.c, gm.L(72.0f) + iq5Var2.d);
        FrameLayout frameLayout = d38Var.Q;
        iq5 iq5Var3 = d38Var.c0;
        frameLayout.setPadding(iq5Var3.a, 0, iq5Var3.c, iq5Var3.d);
        return wzc.b;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        d38 d38Var = this.b;
        switch (b) {
            case 1:
                d38Var.finishFragment();
                break;
            default:
                d38Var.B0();
                break;
        }
    }
}
