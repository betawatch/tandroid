package lh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class w5 implements yf.a1 {
    public final /* synthetic */ va a;

    public w5(va vaVar) {
        this.a = vaVar;
    }

    @Override // yf.a1
    public final void b() {
        x5 x5Var = this.a.L0;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    @Override // yf.a1
    public final void c() {
        va vaVar = this.a;
        if (vaVar.Y0) {
            vaVar.Y0 = false;
        } else {
            vaVar.g1.b(1);
            vaVar.l((yf.m) yf.m.a.get(0));
        }
    }

    @Override // yf.a1
    public final boolean d() {
        va vaVar = this.a;
        boolean z10 = vaVar.F0 == null;
        if (!z10) {
            vaVar.D0(null, true);
        }
        return z10;
    }

    @Override // yf.a1
    public final void e() {
        va vaVar = this.a;
        vaVar.z0.a.g();
        vaVar.Z0.setViewHidden(false);
    }

    @Override // yf.a1
    public final void f() {
        va vaVar = this.a;
        if (vaVar.F0 != null) {
            vaVar.D0(null, true);
        }
        vaVar.Z0.setViewHidden(true);
    }

    @Override // yf.a1
    public final void a() {
    }
}
