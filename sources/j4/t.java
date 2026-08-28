package j4;

import android.util.Pair;
import h3.r2;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t extends l1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public t(a aVar) {
        super(new x(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // j4.a
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        int i9 = this.l;
        a aVar = this.k;
        if (i9 == Integer.MAX_VALUE) {
            return aVar.b(d0Var, rVar, j10);
        }
        Object obj = d0Var.a;
        int i10 = h3.a.d;
        d0 b10 = d0Var.b(((Pair) obj).second);
        this.m.put(b10, d0Var);
        a0 b11 = aVar.b(b10, rVar, j10);
        this.n.put(b11, b10);
        return b11;
    }

    @Override // j4.l1, j4.a
    public final r2 g() {
        x xVar = (x) this.k;
        int i9 = this.l;
        return i9 != Integer.MAX_VALUE ? new s(xVar.o, i9) : new r(xVar.o, 0);
    }

    @Override // j4.l1, j4.a
    public final boolean i() {
        return false;
    }

    @Override // j4.a
    public final void n(a0 a0Var) {
        this.k.n(a0Var);
        d0 d0Var = (d0) this.n.remove(a0Var);
        if (d0Var != null) {
            this.m.remove(d0Var);
        }
    }

    @Override // j4.l1
    public final d0 x(d0 d0Var) {
        return this.l != Integer.MAX_VALUE ? (d0) this.m.get(d0Var) : d0Var;
    }

    @Override // j4.l1
    public final void y(r2 r2Var) {
        int i9 = this.l;
        m(i9 != Integer.MAX_VALUE ? new s(r2Var, i9) : new r(r2Var, 0));
    }
}
