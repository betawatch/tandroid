package n4;

import j3.u0;
import l4.b1;
import l4.c1;
import l4.g0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements c1 {
    public final h a;
    public final b1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ h e;

    public f(h hVar, h hVar2, b1 b1Var, int i10) {
        this.e = hVar;
        this.a = hVar2;
        this.b = b1Var;
        this.c = i10;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        h hVar = this.e;
        g0 g0Var = hVar.h;
        int[] iArr = hVar.b;
        int i10 = this.c;
        g0Var.b(iArr[i10], hVar.c[i10], 0, null, hVar.F);
        this.d = true;
    }

    @Override // l4.c1
    public final int d(u0 u0Var, m3.i iVar, int i10) {
        h hVar = this.e;
        if (hVar.t()) {
            return -3;
        }
        a aVar = hVar.H;
        b1 b1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= b1Var.q()) {
            return -3;
        }
        b();
        return b1Var.z(u0Var, iVar, i10, hVar.I);
    }

    @Override // l4.c1
    public final boolean e() {
        h hVar = this.e;
        return !hVar.t() && this.b.u(hVar.I);
    }

    @Override // l4.c1
    public final int i(long j10) {
        h hVar = this.e;
        if (hVar.t()) {
            return 0;
        }
        boolean z10 = hVar.I;
        b1 b1Var = this.b;
        int s10 = b1Var.s(j10, z10);
        a aVar = hVar.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(this.c + 1) - b1Var.q());
        }
        b1Var.E(s10);
        if (s10 > 0) {
            b();
        }
        return s10;
    }

    @Override // l4.c1
    public final void a() {
    }
}
