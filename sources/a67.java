// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a67 extends xz1 {
    public final /* synthetic */ j67 A0;
    public final /* synthetic */ xz1 y0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a67(j67 j67Var, Context context, int i, ylb ylbVar, xz1 xz1Var, boolean z) {
        super(i, ylbVar, context, false);
        this.A0 = j67Var;
        this.y0 = xz1Var;
        this.z0 = z;
    }

    @Override // xz1
    public final boolean b() {
        return this.y0.b();
    }

    @Override // xz1
    public final boolean c() {
        return this.y0.c();
    }

    @Override // xz1
    public final boolean d() {
        return (this.z0 && this.A0.u0 && this.w <= 0) ? false : true;
    }

    @Override // xz1
    public final int getFillColor() {
        return this.y0.getFillColor();
    }

    @Override // xz1
    public final boolean j() {
        return this.y0.j();
    }
}
