package h9;

import a8.ha;
import a8.ia;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class o {
    public final /* synthetic */ int a = 2;

    public static int d(int i7) {
        if (i7 >= 3) {
            return i7 < 1073741824 ? (int) Math.ceil(i7 / 0.75d) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        g(i7, "expectedSize");
        return i7 + 1;
    }

    public static void e(int i7, Object[] objArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(jg.g.j(i10, "at index "));
            }
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void g(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static Object h(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(jg.g.j(i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
    }

    public static boolean j(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static d2 l(Set set, g9.m mVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof d2)) {
                return new e2(set2, mVar);
            }
            d2 d2Var = (d2) set2;
            g9.m mVar2 = d2Var.b;
            mVar2.getClass();
            return new e2((SortedSet) d2Var.a, new g9.n(Arrays.asList(mVar2, mVar)));
        }
        if (!(set instanceof d2)) {
            set.getClass();
            return new d2(set, mVar);
        }
        d2 d2Var2 = (d2) set;
        g9.m mVar3 = d2Var2.b;
        mVar3.getClass();
        return new d2(d2Var2.a, new g9.n(Arrays.asList(mVar3, mVar)));
    }

    public static Object m(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object n(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return rf.b.g(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int o(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static c2 p(Set set, t0 t0Var) {
        ia.k(set, "set1");
        ia.k(t0Var, "set2");
        return new c2(set, t0Var);
    }

    public static int q(int i7, int i10, int i11) {
        return (i7 & (~i11)) | (i10 & i11);
    }

    public static ArrayList r(Object... objArr) {
        int length = objArr.length;
        g(length, "arraySize");
        ArrayList arrayList = new ArrayList(c8.e1.e(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        x(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = q(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int v = v(obj);
        int i10 = v & i7;
        int w10 = w(i10, obj3);
        if (w10 != 0) {
            int i11 = ~i7;
            int i12 = v & i11;
            int i13 = -1;
            while (true) {
                int i14 = w10 - 1;
                int i15 = iArr[i14];
                if ((i15 & i11) != i12 || !ha.a(obj, objArr[i14]) || (objArr2 != null && !ha.a(obj2, objArr2[i14]))) {
                    int i16 = i15 & i7;
                    if (i16 == 0) {
                        break;
                    }
                    i13 = i14;
                    w10 = i16;
                }
            }
        }
        return -1;
    }

    public static void t(List list, g9.m mVar, int i7, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (mVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            list.remove(i11);
        }
    }

    public static int u(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    public static int v(Object obj) {
        return u(obj == null ? 0 : obj.hashCode());
    }

    public static int w(int i7, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? ((short[]) obj)[i7] & 65535 : ((int[]) obj)[i7];
    }

    public static void x(int i7, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }

    public static AbstractList y(List list, g9.k kVar) {
        return list instanceof RandomAccess ? new c1(list, kVar) : new d1(list, kVar);
    }

    public abstract Object i();

    public String toString() {
        switch (this.a) {
            case 2:
                return i().toString();
            default:
                return super.toString();
        }
    }
}
