package h9;

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class m0 extends g2 {
    public final g2 a;
    public Object b;
    public g2 c;

    public m0(j0 j0Var) {
        x1 x1Var = j0Var.e;
        t0 t0Var = x1Var.a;
        if (t0Var == null) {
            t0Var = x1Var.c();
            x1Var.a = t0Var;
        }
        this.a = t0Var.iterator();
        this.b = null;
        this.c = x0.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.c.next());
    }
}
