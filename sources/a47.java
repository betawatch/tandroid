// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a47 extends ky1 {
    public final /* synthetic */ j47 A0;
    public final /* synthetic */ ky1 y0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a47(j47 j47Var, Context context, int i, wjb wjbVar, ky1 ky1Var, boolean z) {
        super(i, wjbVar, context, false);
        this.A0 = j47Var;
        this.y0 = ky1Var;
        this.z0 = z;
    }

    @Override // ky1
    public final boolean b() {
        return this.y0.b();
    }

    @Override // ky1
    public final boolean c() {
        return this.y0.c();
    }

    @Override // ky1
    public final boolean d() {
        return (this.z0 && this.A0.u0 && this.w <= 0) ? false : true;
    }

    @Override // ky1
    public final int getFillColor() {
        return this.y0.getFillColor();
    }

    @Override // ky1
    public final boolean j() {
        return this.y0.j();
    }
}
