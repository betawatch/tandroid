package h9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class b0 extends c0 {
    public Object[] a;
    public int b;
    public boolean c;

    public b0(int i7) {
        o.g(i7, "initialCapacity");
        this.a = new Object[i7];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i7 = this.b;
        this.b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof d0) {
                this.b = ((d0) collection).i(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.a;
        int b10 = c0.b(objArr.length, this.b + i7);
        if (b10 > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, b10);
            this.c = false;
        }
    }
}
