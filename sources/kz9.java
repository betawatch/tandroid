// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kz9 extends u0b {
    public final /* synthetic */ ny9 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz9(ny9 ny9Var, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context);
        this.H3 = ny9Var;
    }

    @Override // u0b
    public final boolean B1() {
        return e86.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // u0b
    public final void H1(int i) {
        super.H1(i);
        this.H3.d(false);
    }
}
