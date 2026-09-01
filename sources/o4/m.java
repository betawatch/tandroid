package o4;

import android.util.Pair;
import j3.o2;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m extends v0 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public m(a aVar) {
        super(new q(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // o4.a
    public final t b(v vVar, g5.q qVar, long j10) {
        int i10 = this.l;
        a aVar = this.k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.b(vVar, qVar, j10);
        }
        Object obj = vVar.a;
        int i11 = j3.a.d;
        v b10 = vVar.b(((Pair) obj).second);
        this.m.put(b10, vVar);
        t b11 = aVar.b(b10, qVar, j10);
        this.n.put(b11, b10);
        return b11;
    }

    @Override // o4.v0, o4.a
    public final o2 g() {
        q qVar = (q) this.k;
        int i10 = this.l;
        return i10 != Integer.MAX_VALUE ? new l(qVar.o, i10) : new k(qVar.o, 0);
    }

    @Override // o4.v0, o4.a
    public final boolean i() {
        return false;
    }

    @Override // o4.a
    public final void n(t tVar) {
        this.k.n(tVar);
        v vVar = (v) this.n.remove(tVar);
        if (vVar != null) {
            this.m.remove(vVar);
        }
    }

    @Override // o4.v0
    public final v s(v vVar) {
        return this.l != Integer.MAX_VALUE ? (v) this.m.get(vVar) : vVar;
    }

    @Override // o4.v0
    public final void u(o2 o2Var) {
        int i10 = this.l;
        m(i10 != Integer.MAX_VALUE ? new l(o2Var, i10) : new k(o2Var, 0));
    }
}
