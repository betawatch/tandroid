package h9;

import di.q4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class m1 extends l implements a1 {
    public final a1 e;
    public final g6.d0 f;

    public m1(a1 a1Var, g6.d0 d0Var) {
        a1Var.getClass();
        this.e = a1Var;
        this.f = d0Var;
    }

    @Override // h9.j1
    public final void clear() {
        this.e.clear();
    }

    @Override // h9.l
    public final Map d() {
        return new i1(this.e.b(), new q4(this, 18));
    }

    @Override // h9.l
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override // h9.l
    public final Set f() {
        return this.e.keySet();
    }

    @Override // h9.l
    public final Iterator g() {
        return new w0(this.e.a().iterator(), new f1(this.f, 0));
    }

    @Override // h9.j1
    public final Collection get(Object obj) {
        return o.y((List) this.e.get(obj), new q4.q(this.f, obj, false, 26));
    }

    @Override // h9.l, h9.j1
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // h9.j1
    public final int size() {
        return this.e.size();
    }
}
