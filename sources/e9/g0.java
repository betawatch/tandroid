package e9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class g0 extends h0 {
    public Object[] a;
    public int b;
    public boolean c;

    public g0(int i10) {
        s.f(i10, "initialCapacity");
        this.a = new Object[i10];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof i0) {
                this.b = ((i0) collection).m(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.a;
        int b10 = h0.b(objArr.length, this.b + i10);
        if (b10 > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, b10);
            this.c = false;
        }
    }
}
