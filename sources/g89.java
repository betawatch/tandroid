// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g89 extends i89 implements r53 {
    public final ov9 f;

    public g89(fm4 fm4Var, mm5 mm5Var, ov9 ov9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(fm4Var, mm5Var, ov9Var, arrayList, arrayList2, arrayList3);
        this.f = ov9Var;
    }

    @Override // r53
    public final long C(long j, long j2) {
        return this.f.g(j, j2);
    }

    @Override // r53
    public final boolean V() {
        return this.f.j();
    }

    @Override // r53
    public final long b0() {
        return this.f.d;
    }

    @Override // r53
    public final long e(long j) {
        return this.f.h(j);
    }

    @Override // r53
    public final long f0(long j) {
        return this.f.e(j);
    }

    @Override // r53
    public final long h0(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // r53
    public final long k(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override // r53
    public final long r(long j, long j2) {
        return this.f.d(j, j2);
    }

    @Override // r53
    public final long v(long j, long j2) {
        ov9 ov9Var = this.f;
        if (ov9Var.f != null) {
            return -9223372036854775807L;
        }
        long c = ov9Var.c(j, j2) + ov9Var.d(j, j2);
        return (ov9Var.f(c, j) + ov9Var.h(c)) - ov9Var.i;
    }

    @Override // r53
    public final az8 w(long j) {
        return this.f.i(this, j);
    }

    @Override // i89
    public final r53 b() {
        return this;
    }
}
