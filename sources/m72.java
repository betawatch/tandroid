// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m72 extends v46 {
    public final /* synthetic */ l32 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m72(l32 l32Var, Context context) {
        super(context);
        this.r = l32Var;
    }

    @Override // v46
    public final int k(int i, View view) {
        int i2;
        v72 v72Var = (v72) this.r.V;
        if (v72Var.W0) {
            i = -1;
        }
        int k = super.k(i, view);
        if (v72Var.W0) {
            k += gm.L(160.0f);
        }
        if (!v72Var.W0) {
            k = hg9.f(7.0f, v72Var.S0 - gm.m, k);
        }
        if (v72Var.W0 && k == 0 && (i2 = v72Var.X0) >= 0) {
            v72Var.k0(i2);
            v72Var.X0 = -1;
        }
        v72Var.W0 = false;
        return k;
    }

    @Override // v46
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
