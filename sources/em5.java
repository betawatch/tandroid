// default package

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class em5 extends fm5 {
    public Object[] a;
    public int b;
    public boolean c;

    public em5(int i) {
        krd.b(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof gm5) {
                this.b = ((gm5) collection).i(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int b = fm5.b(objArr.length, this.b + i);
        if (b > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, b);
            this.c = false;
        }
    }
}
