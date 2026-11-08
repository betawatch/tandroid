package h9;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class o0 extends h2 {
    public int a;
    public Object b;
    public final /* synthetic */ Iterator c;

    public o0(h2 h2Var) {
        this.c = h2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a <= 0) {
            p1 p1Var = (p1) this.c.next();
            this.b = p1Var.a;
            this.a = p1Var.a();
        }
        this.a--;
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
