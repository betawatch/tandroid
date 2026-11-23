package h9;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
