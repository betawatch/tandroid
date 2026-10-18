package ei;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class w5 implements qg.d1 {
    public final /* synthetic */ xa a;

    public w5(xa xaVar) {
        this.a = xaVar;
    }

    @Override // qg.d1
    public final void b() {
        x5 x5Var = this.a.P0;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    @Override // qg.d1
    public final void c() {
        xa xaVar = this.a;
        if (xaVar.c1) {
            xaVar.c1 = false;
        } else {
            xaVar.k1.b(1);
            xaVar.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.d1
    public final boolean d() {
        xa xaVar = this.a;
        boolean z10 = xaVar.J0 == null;
        if (!z10) {
            xaVar.C0(null, true);
        }
        return z10;
    }

    @Override // qg.d1
    public final void e() {
        xa xaVar = this.a;
        xaVar.D0.a.e();
        xaVar.d1.setViewHidden(false);
    }

    @Override // qg.d1
    public final void f() {
        xa xaVar = this.a;
        if (xaVar.J0 != null) {
            xaVar.C0(null, true);
        }
        xaVar.d1.setViewHidden(true);
    }

    @Override // qg.d1
    public final void a() {
    }
}
