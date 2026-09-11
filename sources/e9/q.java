package e9;

import com.google.android.gms.internal.vision.e2;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.p6;
import v7.s6;
import v7.t6;
import v7.x7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class q {
    public final /* synthetic */ int a = 2;

    public static int c(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(i10 / 0.75d) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        e(i10, "expectedSize");
        return i10 + 1;
    }

    public static void d(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(i2.g.i(i11, "at index "));
            }
        }
    }

    public static void e(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static Object f(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(i2.g.i(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static boolean h(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
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

    public static j1 j(Set set, d9.g gVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof j1)) {
                return new k1(set2, gVar);
            }
            j1 j1Var = (j1) set2;
            d9.g gVar2 = j1Var.b;
            gVar2.getClass();
            return new k1((SortedSet) j1Var.a, new d9.h(Arrays.asList(gVar2, gVar)));
        }
        if (!(set instanceof j1)) {
            set.getClass();
            return new j1(set, gVar);
        }
        j1 j1Var2 = (j1) set;
        d9.g gVar3 = j1Var2.b;
        gVar3.getClass();
        return new j1(j1Var2.a, new d9.h(Arrays.asList(gVar3, gVar)));
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return p6.g(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static i1 n(Set set, m0 m0Var) {
        t6.d(set, "set1");
        t6.d(m0Var, "set2");
        return new i1(set, m0Var);
    }

    public static int o(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        e(length, "arraySize");
        ArrayList arrayList = new ArrayList(x7.e(length + 5 + (length / 10)));
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
    
        v(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = o(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int t10 = t(obj);
        int i11 = t10 & i10;
        int u10 = u(i11, obj3);
        if (u10 != 0) {
            int i12 = ~i10;
            int i13 = t10 & i12;
            int i14 = -1;
            while (true) {
                int i15 = u10 - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) != i13 || !s6.a(obj, objArr[i15]) || (objArr2 != null && !s6.a(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    u10 = i17;
                }
            }
        }
        return -1;
    }

    public static void r(List list, d9.g gVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (gVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int s(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int t(Object obj) {
        return s(obj == null ? 0 : obj.hashCode());
    }

    public static int u(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void v(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static AbstractList w(List list, d9.e eVar) {
        return e2.u(list) ? new r0(list, eVar) : new s0(list, eVar);
    }

    public abstract Object g();

    public String toString() {
        switch (this.a) {
            case 2:
                return g().toString();
            default:
                return super.toString();
        }
    }
}
