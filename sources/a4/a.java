package a4;

import f3.a0;
import f3.b0;
import f3.c0;
import h2.l0;
import java.math.BigInteger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a implements b0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // f3.b0
    public final boolean d() {
        return true;
    }

    @Override // f3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.b0
    public final a0 f(long j3) {
        b bVar = this.a;
        long j10 = bVar.b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.i * j3) / 1000000);
        long j11 = bVar.c;
        c0 c0Var = new c0(j3, l0.j((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f)).longValue() + j10) - 30000, bVar.b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override // f3.b0
    public final long h() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
