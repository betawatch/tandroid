package a4;

import h5.d0;
import java.math.BigInteger;
import r3.r;
import r3.s;
import r3.t;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements s {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.s
    public final r f(long j10) {
        b bVar = this.a;
        long j11 = bVar.b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.i * j10) / 1000000);
        long j12 = bVar.c;
        t tVar = new t(j10, d0.i((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f)).longValue() + j11) - 30000, bVar.b, j12 - 1));
        return new r(tVar, tVar);
    }

    @Override // r3.s
    public final long g() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
