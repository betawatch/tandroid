package l4;

import h3.u0;
import j4.a1;
import j4.b1;
import j4.h0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements b1 {
    public final h a;
    public final a1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ h e;

    public f(h hVar, h hVar2, a1 a1Var, int i9) {
        this.e = hVar;
        this.a = hVar2;
        this.b = a1Var;
        this.c = i9;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        h hVar = this.e;
        h0 h0Var = hVar.h;
        int[] iArr = hVar.b;
        int i9 = this.c;
        h0Var.b(iArr[i9], hVar.c[i9], 0, null, hVar.F);
        this.d = true;
    }

    @Override // j4.b1
    public final boolean f() {
        h hVar = this.e;
        return !hVar.t() && this.b.u(hVar.I);
    }

    @Override // j4.b1
    public final int j(long j10) {
        h hVar = this.e;
        if (hVar.t()) {
            return 0;
        }
        boolean z10 = hVar.I;
        a1 a1Var = this.b;
        int s10 = a1Var.s(j10, z10);
        a aVar = hVar.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(this.c + 1) - a1Var.q());
        }
        a1Var.E(s10);
        if (s10 > 0) {
            b();
        }
        return s10;
    }

    @Override // j4.b1
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        h hVar = this.e;
        if (hVar.t()) {
            return -3;
        }
        a aVar = hVar.H;
        a1 a1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= a1Var.q()) {
            return -3;
        }
        b();
        return a1Var.z(u0Var, iVar, i9, hVar.I);
    }

    @Override // j4.b1
    public final void a() {
    }
}
