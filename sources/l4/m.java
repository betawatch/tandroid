package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import g7.l0;
import h3.t0;
import j4.a1;
import m3.w;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends a {
    public final int A;
    public final t0 B;
    public long C;
    public boolean D;

    public m(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, long j10, long j11, long j12, int i11, t0 t0Var2) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.A = i11;
        this.B = t0Var2;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        x0 x0Var = this.r;
        g5.b bVar = this.x;
        d5.a.j(bVar);
        for (a1 a1Var : (a1[]) bVar.c) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.z = true;
            }
        }
        w u10 = bVar.u(this.A);
        u10.c(this.B);
        try {
            long open = x0Var.open(this.b.a(this.C));
            if (open != -1) {
                open += this.C;
            }
            m3.h hVar = new m3.h(this.r, this.C, open);
            for (int i10 = 0; i10 != -1; i10 = u10.b(hVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.C += i10;
            }
            u10.e(this.h, 1, (int) this.C, 0, null);
            l0.a(x0Var);
            this.D = true;
        } catch (Throwable th) {
            l0.a(x0Var);
            throw th;
        }
    }

    @Override // l4.k
    public final boolean c() {
        return this.D;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void l() {
    }
}
