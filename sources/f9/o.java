package f9;

import a8.ed;
import a8.xb;
import a8.yb;
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
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class o {
    public final /* synthetic */ int a = 2;

    public static int c(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(i10 / 0.75d) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        f(i10, "expectedSize");
        return i10 + 1;
    }

    public static void d(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(ic.a.i(i11, "at index "));
            }
        }
    }

    public static void e(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void f(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static Object g(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(ic.a.i(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static boolean i(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean j(Set set, Object obj) {
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

    public static c2 k(Set set, e9.l lVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof c2)) {
                return new d2(set2, lVar);
            }
            c2 c2Var = (c2) set2;
            e9.l lVar2 = c2Var.b;
            lVar2.getClass();
            return new d2((SortedSet) c2Var.a, new e9.m(Arrays.asList(lVar2, lVar)));
        }
        if (!(set instanceof c2)) {
            set.getClass();
            return new c2(set, lVar);
        }
        c2 c2Var2 = (c2) set;
        e9.l lVar3 = c2Var2.b;
        lVar3.getClass();
        return new c2(c2Var2.a, new e9.m(Arrays.asList(lVar3, lVar)));
    }

    public static Object l(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object m(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return b10.h(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int n(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static b2 o(Set set, t0 t0Var) {
        yb.l(set, "set1");
        yb.l(t0Var, "set2");
        return new b2(set, t0Var);
    }

    public static int p(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList q(Object... objArr) {
        int length = objArr.length;
        f(length, "arraySize");
        ArrayList arrayList = new ArrayList(ed.e(length + 5 + (length / 10)));
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
    
        w(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = p(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int r(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int u10 = u(obj);
        int i11 = u10 & i10;
        int v = v(i11, obj3);
        if (v != 0) {
            int i12 = ~i10;
            int i13 = u10 & i12;
            int i14 = -1;
            while (true) {
                int i15 = v - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) != i13 || !xb.a(obj, objArr[i15]) || (objArr2 != null && !xb.a(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    v = i17;
                }
            }
        }
        return -1;
    }

    public static void s(List list, e9.l lVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (lVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int t(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int u(Object obj) {
        return t(obj == null ? 0 : obj.hashCode());
    }

    public static int v(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void w(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static AbstractList x(List list, e9.k kVar) {
        return list instanceof RandomAccess ? new c1(list, kVar) : new d1(list, kVar);
    }

    public abstract Object h();

    public String toString() {
        switch (this.a) {
            case 2:
                return h().toString();
            default:
                return super.toString();
        }
    }
}
