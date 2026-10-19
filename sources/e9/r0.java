package e9;

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class r0 extends m2 {
    public final m2 a;
    public Object b;
    public m2 c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.a = y0Var;
        }
        this.a = y0Var.iterator();
        this.b = null;
        this.c = c1.d;
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
            this.c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.c.next());
    }
}
