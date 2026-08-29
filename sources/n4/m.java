package n4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import h7.m5;
import j3.t0;
import l4.b1;
import o3.w;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        g9.l lVar = this.x;
        f5.a.j(lVar);
        for (b1 b1Var : (b1[]) lVar.c) {
            if (b1Var.F != 0) {
                b1Var.F = 0L;
                b1Var.z = true;
            }
        }
        w q6 = lVar.q(this.A);
        q6.b(this.B);
        try {
            long open = x0Var.open(this.b.a(this.C));
            if (open != -1) {
                open += this.C;
            }
            o3.h hVar = new o3.h(this.r, this.C, open);
            for (int i10 = 0; i10 != -1; i10 = q6.a(hVar, ConnectionsManager.DEFAULT_DATACENTER_ID, true)) {
                this.C += i10;
            }
            q6.c(this.h, 1, (int) this.C, 0, null);
            m5.a(x0Var);
            this.D = true;
        } catch (Throwable th2) {
            m5.a(x0Var);
            throw th2;
        }
    }

    @Override // n4.k
    public final boolean c() {
        return this.D;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void q() {
    }
}
