package a4;

import f3.b0;
import f3.c0;
import f3.d0;
import h2.m0;
import java.math.BigInteger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a implements c0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // f3.c0
    public final boolean d() {
        return true;
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        b bVar = this.a;
        long j10 = bVar.b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.i * j3) / 1000000);
        long j11 = bVar.c;
        d0 d0Var = new d0(j3, m0.j((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f)).longValue() + j10) - 30000, bVar.b, j11 - 1));
        return new b0(d0Var, d0Var);
    }

    @Override // f3.c0
    public final long h() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
