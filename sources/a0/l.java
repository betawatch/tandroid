package a0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class l {
    public int[] a;
    public Object[] b;
    public int c;

    public l(int i3) {
        this.a = i3 == 0 ? b0.a.a : new int[i3];
        this.b = i3 == 0 ? b0.a.c : new Object[i3 << 1];
    }

    public final int b(Object obj) {
        int i3 = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i10 = 1; i10 < i3; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i3; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final int c(int i3, Object obj) {
        int i10 = this.c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = b0.a.a(i10, i3, this.a);
        if (a10 < 0 || kotlin.jvm.internal.j.a(obj, this.b[a10 << 1])) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.a[i11] == i3) {
            if (kotlin.jvm.internal.j.a(obj, this.b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.a[i12] == i3; i12--) {
            if (kotlin.jvm.internal.j.a(obj, this.b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
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
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int a10 = b0.a.a(i3, 0, this.a);
        if (a10 < 0 || this.b[a10 << 1] == null) {
            return a10;
        }
        int i10 = a10 + 1;
        while (i10 < i3 && this.a[i10] == 0) {
            if (this.b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a10 - 1; i11 >= 0 && this.a[i11] == 0; i11--) {
            if (this.b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof l) {
                int i3 = this.c;
                if (i3 != ((l) obj).c) {
                    return false;
                }
                l lVar = (l) obj;
                for (int i10 = 0; i10 < i3; i10++) {
                    Object f10 = f(i10);
                    Object i11 = i(i10);
                    Object obj2 = lVar.get(f10);
                    if (i11 == null) {
                        if (obj2 != null || !lVar.containsKey(f10)) {
                            return false;
                        }
                    } else if (!i11.equals(obj2)) {
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
                Object f11 = f(i13);
                Object i14 = i(i13);
                Object obj3 = ((Map) obj).get(f11);
                if (i14 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f11)) {
                        return false;
                    }
                } else if (!i14.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        if (i3 < 0 || i3 >= this.c) {
            throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.b[i3 << 1];
    }

    public final Object g(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.c)) {
            throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.b;
        int i11 = i3 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i3 < i12) {
                int i13 = i3 + 1;
                ed.f.b(i3, i13, i10, iArr, iArr);
                Object[] objArr2 = this.b;
                ed.f.c(i11, i13 << 1, i10 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i15);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i15 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i10 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (i3 > 0) {
                ed.f.b(0, 0, i3, iArr, this.a);
                ed.f.c(0, 0, i11, objArr, this.b);
            }
            if (i3 < i12) {
                int i16 = i3 + 1;
                ed.f.b(i3, i16, i10, iArr, this.a);
                ed.f.c(i11, i16 << 1, i10 << 1, objArr, this.b);
            }
        }
        if (i10 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i12;
        return obj;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.b[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.b[(d << 1) + 1] : obj2;
    }

    public final Object h(int i3, Object obj) {
        if (i3 < 0 || i3 >= this.c) {
            throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i10 = (i3 << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i3 = this.c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i3) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final Object i(int i3) {
        if (i3 < 0 || i3 >= this.c) {
            throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.b[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3 = this.c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c2 = obj != null ? c(hashCode, obj) : e();
        if (c2 >= 0) {
            int i10 = (c2 << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~c2;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            int i12 = 8;
            if (i3 >= 8) {
                i12 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i12 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i3 != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i3) {
            int[] iArr2 = this.a;
            int i13 = i11 + 1;
            ed.f.b(i13, i11, i3, iArr2, iArr2);
            Object[] objArr2 = this.b;
            ed.f.c(i13 << 1, i11 << 1, this.c << 1, objArr2, objArr2);
        }
        int i14 = this.c;
        if (i3 == i14) {
            int[] iArr3 = this.a;
            if (i11 < iArr3.length) {
                iArr3[i11] = hashCode;
                Object[] objArr3 = this.b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.c = i14 + 1;
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
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
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
        int i3 = this.c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object f10 = f(i10);
            if (f10 != sb2) {
                sb2.append(f10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != sb2) {
                sb2.append(i11);
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
        int d = d(obj);
        if (d < 0 || !kotlin.jvm.internal.j.a(obj2, i(d))) {
            return false;
        }
        g(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !kotlin.jvm.internal.j.a(obj2, i(d))) {
            return false;
        }
        h(d, obj3);
        return true;
    }
}
