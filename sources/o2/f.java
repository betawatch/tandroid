package o2;

import a8.xa;
import b3.s;
import j2.b0;
import java.io.IOException;
import x2.u;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class f implements b3.k {
    public final /* synthetic */ h a;

    @Override // b3.k
    public b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        s sVar = (s) mVar;
        h hVar = this.a;
        xa xaVar = hVar.q;
        long j11 = sVar.a;
        j2.m mVar2 = sVar.b;
        b0 b0Var = sVar.d;
        xaVar.r(new u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b), sVar.c, iOException, true);
        hVar.m.getClass();
        hVar.y(iOException);
        return b3.p.e;
    }

    @Override // b3.k
    public void p(b3.m mVar, long j3, long j10, boolean z10) {
        this.a.x((s) mVar, j3, j10);
    }

    @Override // b3.k
    public void z(b3.m mVar, long j3, long j10) {
        s sVar = (s) mVar;
        h hVar = this.a;
        long j11 = sVar.a;
        j2.m mVar2 = sVar.b;
        b0 b0Var = sVar.d;
        u uVar = new u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        hVar.m.getClass();
        hVar.q.p(uVar, sVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.K = ((Long) sVar.f).longValue() - j3;
        hVar.z(true);
    }

    @Override // b3.k
    public /* synthetic */ void s(b3.m mVar, long j3, long j10, int i7) {
    }
}
