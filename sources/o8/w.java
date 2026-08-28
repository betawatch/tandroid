package o8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w {
    public Object[] a;
    public int b;
    public boolean c;

    public w() {
        l.a(4, "initialCapacity");
        this.a = new Object[4];
        this.b = 0;
    }

    public static int d(int i9, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i9 + (i9 >> 1) + 1;
        if (i11 < i10) {
            i11 = Integer.highestOneBit(i10 - 1) << 1;
        }
        return i11 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i11;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.b + 1);
        Object[] objArr = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        objArr[i9] = obj;
    }

    public final void b(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            e(list2.size() + this.b);
            if (list2 instanceof u) {
                this.b = ((u) list2).n(this.b, this.a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final l0 c() {
        this.c = true;
        return z.s(this.b, this.a);
    }

    public final void e(int i9) {
        Object[] objArr = this.a;
        if (objArr.length < i9) {
            this.a = Arrays.copyOf(objArr, d(objArr.length, i9));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
