// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e42 extends v46 {
    public final /* synthetic */ l32 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e42(l32 l32Var, Context context) {
        super(context);
        this.r = l32Var;
    }

    @Override // v46
    public final int k(int i, View view) {
        return hg9.f(56.0f, ((p42) this.r.V).r.getPaddingTop() - gm.m, super.k(i, view));
    }

    @Override // v46
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
