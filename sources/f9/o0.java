package f9;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
