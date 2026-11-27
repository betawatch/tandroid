// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class h67 extends bz1 {
    public final /* synthetic */ boolean A0;
    public final /* synthetic */ q67 B0;
    public final /* synthetic */ bz1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h67(q67 q67Var, Context context, int i, vnb vnbVar, bz1 bz1Var, boolean z) {
        super(i, vnbVar, context, false);
        this.B0 = q67Var;
        this.z0 = bz1Var;
        this.A0 = z;
    }

    @Override // bz1
    public final boolean b() {
        return this.z0.b();
    }

    @Override // bz1
    public final boolean c() {
        return this.z0.c();
    }

    @Override // bz1
    public final boolean d() {
        return (this.A0 && this.B0.u0 && this.w <= 0) ? false : true;
    }

    @Override // bz1
    public final int getFillColor() {
        return this.z0.getFillColor();
    }

    @Override // bz1
    public final boolean j() {
        return this.z0.j();
    }
}
