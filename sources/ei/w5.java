package ei;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
            xaVar.n((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.d1
    public final boolean d() {
        xa xaVar = this.a;
        boolean z10 = xaVar.J0 == null;
        if (!z10) {
            xaVar.B0(null, true);
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
            xaVar.B0(null, true);
        }
        xaVar.d1.setViewHidden(true);
    }

    @Override // qg.d1
    public final void a() {
    }
}
