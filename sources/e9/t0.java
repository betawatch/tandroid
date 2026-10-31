package e9;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t0 extends m2 {
    public int a;
    public Object b;
    public final /* synthetic */ Iterator c;

    public t0(m2 m2Var) {
        this.c = m2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a <= 0) {
            t1 t1Var = (t1) this.c.next();
            this.b = t1Var.a;
            this.a = t1Var.a();
        }
        this.a--;
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
