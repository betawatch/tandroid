package l4;

import android.util.Pair;
import j3.r2;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s extends m1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public s(a aVar) {
        super(new w(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // l4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        int i10 = this.l;
        a aVar = this.k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.b(c0Var, rVar, j10);
        }
        Object obj = c0Var.a;
        int i11 = j3.a.d;
        c0 b10 = c0Var.b(((Pair) obj).second);
        this.m.put(b10, c0Var);
        z b11 = aVar.b(b10, rVar, j10);
        this.n.put(b11, b10);
        return b11;
    }

    @Override // l4.m1, l4.a
    public final r2 g() {
        w wVar = (w) this.k;
        int i10 = this.l;
        return i10 != Integer.MAX_VALUE ? new r(wVar.o, i10) : new q(wVar.o, 0);
    }

    @Override // l4.m1, l4.a
    public final boolean i() {
        return false;
    }

    @Override // l4.a
    public final void n(z zVar) {
        this.k.n(zVar);
        c0 c0Var = (c0) this.n.remove(zVar);
        if (c0Var != null) {
            this.m.remove(c0Var);
        }
    }

    @Override // l4.m1
    public final c0 x(c0 c0Var) {
        return this.l != Integer.MAX_VALUE ? (c0) this.m.get(c0Var) : c0Var;
    }

    @Override // l4.m1
    public final void y(r2 r2Var) {
        int i10 = this.l;
        m(i10 != Integer.MAX_VALUE ? new r(r2Var, i10) : new q(r2Var, 0));
    }
}
