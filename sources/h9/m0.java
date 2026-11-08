package h9;

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class m0 extends h2 {
    public final h2 a;
    public Object b;
    public h2 c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.e;
        t0 t0Var = y1Var.a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.a = t0Var;
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
