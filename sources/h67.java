// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
