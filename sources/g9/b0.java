package g9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b0 extends c0 {
    public Object[] a;
    public int b;
    public boolean c;

    public b0(int i3) {
        o.g(i3, "initialCapacity");
        this.a = new Object[i3];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        objArr[i3] = obj;
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

    public final void e(int i3) {
        Object[] objArr = this.a;
        int b10 = c0.b(objArr.length, this.b + i3);
        if (b10 > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, b10);
            this.c = false;
        }
    }
}
