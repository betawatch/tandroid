package h9;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
