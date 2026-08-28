package a0;

import j3.r0;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class k {
    public int[] a;
    public Object[] b;
    public int c;

    public k(int i9) {
        this.a = i9 == 0 ? b0.a.a : new int[i9];
        this.b = i9 == 0 ? b0.a.c : new Object[i9 << 1];
    }

    public final int a(Object obj) {
        int i9 = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i10 = 1; i10 < i9; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i9; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i9, Object obj) {
        int i10 = this.c;
        if (i10 == 0) {
            return -1;
        }
        int a2 = b0.a.a(i10, i9, this.a);
        if (a2 < 0 || kotlin.jvm.internal.i.a(obj, this.b[a2 << 1])) {
            return a2;
        }
        int i11 = a2 + 1;
        while (i11 < i10 && this.a[i11] == i9) {
            if (kotlin.jvm.internal.i.a(obj, this.b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a2 - 1; i12 >= 0 && this.a[i12] == i9; i12--) {
            if (kotlin.jvm.internal.i.a(obj, this.b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
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
        int i9 = this.c;
        if (i9 == 0) {
            return -1;
        }
        int a2 = b0.a.a(i9, 0, this.a);
        if (a2 < 0 || this.b[a2 << 1] == null) {
            return a2;
        }
        int i10 = a2 + 1;
        while (i10 < i9 && this.a[i10] == 0) {
            if (this.b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a2 - 1; i11 >= 0 && this.a[i11] == 0; i11--) {
            if (this.b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final Object e(int i9) {
        if (i9 < 0 || i9 >= this.c) {
            throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.b[i9 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i9 = this.c;
                if (i9 != ((k) obj).c) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object e10 = e(i10);
                    Object h = h(i10);
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
            int i11 = this.c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object e11 = e(i12);
                Object h10 = h(i12);
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

    public final Object f(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.c)) {
            throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.b;
        int i11 = i9 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i9 < i12) {
                int i13 = i9 + 1;
                pc.f.b(i9, i13, i10, iArr, iArr);
                Object[] objArr2 = this.b;
                pc.f.c(i11, i13 << 1, i10 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i15);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i15 << 1);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i10 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (i9 > 0) {
                pc.f.b(0, 0, i9, iArr, this.a);
                pc.f.c(0, 0, i11, objArr, this.b);
            }
            if (i9 < i12) {
                int i16 = i9 + 1;
                pc.f.b(i9, i16, i10, iArr, this.a);
                pc.f.c(i11, i16 << 1, i10 << 1, objArr, this.b);
            }
        }
        if (i10 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i12;
        return obj;
    }

    public final Object g(int i9, Object obj) {
        if (i9 < 0 || i9 >= this.c) {
            throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i10 = (i9 << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return this.b[(c10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c10 = c(obj);
        return c10 >= 0 ? this.b[(c10 << 1) + 1] : obj2;
    }

    public final Object h(int i9) {
        if (i9 < 0 || i9 >= this.c) {
            throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.b[(i9 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i9 = this.c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i9 = this.c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b10 = obj != null ? b(hashCode, obj) : d();
        if (b10 >= 0) {
            int i10 = (b10 << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~b10;
        int[] iArr = this.a;
        if (i9 >= iArr.length) {
            int i12 = 8;
            if (i9 >= 8) {
                i12 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i12 << 1);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i9 != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i9) {
            int[] iArr2 = this.a;
            int i13 = i11 + 1;
            pc.f.b(i13, i11, i9, iArr2, iArr2);
            Object[] objArr2 = this.b;
            pc.f.c(i13 << 1, i11 << 1, this.c << 1, objArr2, objArr2);
        }
        int i14 = this.c;
        if (i9 == i14) {
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
        int c10 = c(obj);
        if (c10 >= 0) {
            return f(c10);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return g(c10, obj2);
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
        int i9 = this.c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object e10 = e(i10);
            if (e10 != sb2) {
                sb2.append(e10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object h = h(i10);
            if (h != sb2) {
                sb2.append(h);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c10 = c(obj);
        if (c10 < 0 || !kotlin.jvm.internal.i.a(obj2, h(c10))) {
            return false;
        }
        f(c10);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c10 = c(obj);
        if (c10 < 0 || !kotlin.jvm.internal.i.a(obj2, h(c10))) {
            return false;
        }
        g(c10, obj3);
        return true;
    }
}
