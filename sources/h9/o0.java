package h9;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o0 extends g2 {
    public int a;
    public Object b;
    public final /* synthetic */ Iterator c;

    public o0(g2 g2Var) {
        this.c = g2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a <= 0) {
            o1 o1Var = (o1) this.c.next();
            this.b = o1Var.a;
            this.a = o1Var.a();
        }
        this.a--;
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
