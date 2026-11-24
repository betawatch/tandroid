// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j52 extends v46 {
    public final /* synthetic */ l32 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(l32 l32Var, Context context) {
        super(context);
        this.r = l32Var;
    }

    @Override // v46
    public final int k(int i, View view) {
        int k = super.k(i, view);
        n52 n52Var = (n52) this.r.V;
        return k - (n52Var.M.getPaddingTop() - (n52Var.r0 - n52Var.q0));
    }

    @Override // v46
    public final int m(int i) {
        return super.m(i) << 2;
    }
}
