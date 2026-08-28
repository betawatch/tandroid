package o8;

import g7.r6;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(int i9, String str) {
        if (i9 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i9);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object b(int i9) {
        if (i9 >= 2 && i9 <= 1073741824 && Integer.highestOneBit(i9) == i9) {
            return i9 <= 256 ? new byte[i9] : i9 <= 65536 ? new short[i9] : new int[i9];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i9);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean d(Set set, Object obj) {
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

    public static u0 e(Set set, n8.f fVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof u0)) {
                return new v0(set2, fVar);
            }
            u0 u0Var = (u0) set2;
            n8.f fVar2 = u0Var.b;
            fVar2.getClass();
            return new v0((SortedSet) u0Var.a, new n8.g(Arrays.asList(fVar2, fVar)));
        }
        if (!(set instanceof u0)) {
            set.getClass();
            return new u0(set, fVar);
        }
        u0 u0Var2 = (u0) set;
        n8.f fVar3 = u0Var2.b;
        fVar3.getClass();
        return new u0(u0Var2.a, new n8.g(Arrays.asList(fVar3, fVar)));
    }

    public static Object f(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object g(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return j3.r0.k(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int h(Set set) {
        Iterator it = set.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i9 = ~(~(i9 + (next != null ? next.hashCode() : 0)));
        }
        return i9;
    }

    public static t0 i(Set set, c0 c0Var) {
        if (set == null) {
            throw new NullPointerException("set1");
        }
        if (c0Var != null) {
            return new t0(set, c0Var);
        }
        throw new NullPointerException("set2");
    }

    public static int j(int i9, int i10, int i11) {
        return (i9 & (~i11)) | (i10 & i11);
    }

    public static ArrayList k(Object... objArr) {
        int length = objArr.length;
        a(length, "arraySize");
        ArrayList arrayList = new ArrayList(r6.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static HashSet l(int i9) {
        int i10;
        if (i9 < 3) {
            a(i9, "expectedSize");
            i10 = i9 + 1;
        } else {
            i10 = i9 < 1073741824 ? (int) ((i9 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        return new HashSet(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = j(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m(Object obj, Object obj2, int i9, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int p6 = p(obj);
        int i10 = p6 & i9;
        int q10 = q(i10, obj3);
        if (q10 != 0) {
            int i11 = ~i9;
            int i12 = p6 & i11;
            int i13 = -1;
            while (true) {
                int i14 = q10 - 1;
                int i15 = iArr[i14];
                if ((i15 & i11) != i12 || !g7.c0.a(obj, objArr[i14]) || (objArr2 != null && !g7.c0.a(obj2, objArr2[i14]))) {
                    int i16 = i15 & i9;
                    if (i16 == 0) {
                        break;
                    }
                    i13 = i14;
                    q10 = i16;
                }
            }
        }
        return -1;
    }

    public static void n(List list, n8.f fVar, int i9, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            list.remove(i11);
        }
    }

    public static int o(int i9) {
        return (int) (Integer.rotateLeft((int) (i9 * (-862048943)), 15) * 461845907);
    }

    public static int p(Object obj) {
        return o(obj == null ? 0 : obj.hashCode());
    }

    public static int q(int i9, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i9] & 255 : obj instanceof short[] ? ((short[]) obj)[i9] & 65535 : ((int[]) obj)[i9];
    }

    public static void r(int i9, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }
}
