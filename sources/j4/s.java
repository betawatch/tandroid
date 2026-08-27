package j4;

import android.util.Pair;
import h3.s2;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s extends l1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public s(a aVar) {
        super(new w(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // j4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        int i10 = this.l;
        a aVar = this.k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.b(c0Var, rVar, j10);
        }
        Object obj = c0Var.a;
        int i11 = h3.a.d;
        c0 b10 = c0Var.b(((Pair) obj).second);
        this.m.put(b10, c0Var);
        z b11 = aVar.b(b10, rVar, j10);
        this.n.put(b11, b10);
        return b11;
    }

    @Override // j4.l1, j4.a
    public final s2 g() {
        w wVar = (w) this.k;
        int i10 = this.l;
        return i10 != Integer.MAX_VALUE ? new r(wVar.o, i10) : new q(wVar.o, 0);
    }

    @Override // j4.l1, j4.a
    public final boolean i() {
        return false;
    }

    @Override // j4.a
    public final void n(z zVar) {
        this.k.n(zVar);
        c0 c0Var = (c0) this.n.remove(zVar);
        if (c0Var != null) {
            this.m.remove(c0Var);
        }
    }

    @Override // j4.l1
    public final c0 x(c0 c0Var) {
        return this.l != Integer.MAX_VALUE ? (c0) this.m.get(c0Var) : c0Var;
    }

    @Override // j4.l1
    public final void y(s2 s2Var) {
        int i10 = this.l;
        m(i10 != Integer.MAX_VALUE ? new r(s2Var, i10) : new q(s2Var, 0));
    }
}
