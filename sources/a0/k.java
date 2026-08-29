package a0;

import j7.l1;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class k {
    public int[] a;
    public Object[] b;
    public int c;

    public k(int i10) {
        this.a = i10 == 0 ? b0.a.a : new int[i10];
        this.b = i10 == 0 ? b0.a.c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i10, Object obj) {
        int i11 = this.c;
        if (i11 == 0) {
            return -1;
        }
        int a2 = b0.a.a(i11, i10, this.a);
        if (a2 < 0 || kotlin.jvm.internal.j.a(obj, this.b[a2 << 1])) {
            return a2;
        }
        int i12 = a2 + 1;
        while (i12 < i11 && this.a[i12] == i10) {
            if (kotlin.jvm.internal.j.a(obj, this.b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a2 - 1; i13 >= 0 && this.a[i13] == i10; i13--) {
            if (kotlin.jvm.internal.j.a(obj, this.b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.c > 0) {
            this.a = b0.a.a;
            this.b = b0.a.c;
            this.c = 0;
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i10 = this.c;
        if (i10 == 0) {
            return -1;
        }
        int a2 = b0.a.a(i10, 0, this.a);
        if (a2 < 0 || this.b[a2 << 1] == null) {
            return a2;
        }
        int i11 = a2 + 1;
        while (i11 < i10 && this.a[i11] == 0) {
            if (this.b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a2 - 1; i12 >= 0 && this.a[i12] == 0; i12--) {
            if (this.b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object e(int i10) {
        if (i10 < 0 || i10 >= this.c) {
            throw new IllegalArgumentException(l1.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.b[i10 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i10 = this.c;
                if (i10 != ((k) obj).c) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object e10 = e(i11);
                    Object h = h(i11);
                    Object obj2 = kVar.get(e10);
                    if (h == null) {
                        if (obj2 != null || !kVar.containsKey(e10)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object e11 = e(i13);
                Object h10 = h(i13);
                Object obj3 = ((Map) obj).get(e11);
                if (h10 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e11)) {
                        return false;
                    }
                } else if (!h10.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.c)) {
            throw new IllegalArgumentException(l1.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                rc.f.b(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.b;
                rc.f.c(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i16 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i11 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                rc.f.b(0, 0, i10, iArr, this.a);
                rc.f.c(0, 0, i12, objArr, this.b);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                rc.f.b(i10, i17, i11, iArr, this.a);
                rc.f.c(i12, i17 << 1, i11 << 1, objArr, this.b);
            }
        }
        if (i11 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i13;
        return obj;
    }

    public final Object g(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.c) {
            throw new IllegalArgumentException(l1.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return this.b[(c3 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c3 = c(obj);
        return c3 >= 0 ? this.b[(c3 << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        if (i10 < 0 || i10 >= this.c) {
            throw new IllegalArgumentException(l1.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.b[(i10 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i10 = this.c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b10 = obj != null ? b(hashCode, obj) : d();
        if (b10 >= 0) {
            int i11 = (b10 << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~b10;
        int[] iArr = this.a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i13 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i10 != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.a;
            int i14 = i12 + 1;
            rc.f.b(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.b;
            rc.f.c(i14 << 1, i12 << 1, this.c << 1, objArr2, objArr2);
        }
        int i15 = this.c;
        if (i10 == i15) {
            int[] iArr3 = this.a;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr3 = this.b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return f(c3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return g(c3, obj2);
        }
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.c * 28);
        sb2.append('{');
        int i10 = this.c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object e10 = e(i11);
            if (e10 != sb2) {
                sb2.append(e10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object h = h(i11);
            if (h != sb2) {
                sb2.append(h);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c3 = c(obj);
        if (c3 < 0 || !kotlin.jvm.internal.j.a(obj2, h(c3))) {
            return false;
        }
        f(c3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c3 = c(obj);
        if (c3 < 0 || !kotlin.jvm.internal.j.a(obj2, h(c3))) {
            return false;
        }
        g(c3, obj3);
        return true;
    }
}
