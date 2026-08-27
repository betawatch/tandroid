package l4;

import h3.u0;
import j4.a1;
import j4.b1;
import j4.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements b1 {
    public final h a;
    public final a1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ h e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.e = hVar;
        this.a = hVar2;
        this.b = a1Var;
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

    @Override // j4.b1
    public final boolean e() {
        h hVar = this.e;
        return !hVar.r() && this.b.u(hVar.I);
    }

    @Override // j4.b1
    public final int f(long j10) {
        h hVar = this.e;
        if (hVar.r()) {
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
    public final int i(u0 u0Var, k3.i iVar, int i10) {
        h hVar = this.e;
        if (hVar.r()) {
            return -3;
        }
        a aVar = hVar.H;
        a1 a1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= a1Var.q()) {
            return -3;
        }
        b();
        return a1Var.z(u0Var, iVar, i10, hVar.I);
    }

    @Override // j4.b1
    public final void a() {
    }
}
