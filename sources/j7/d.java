package j7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f;
    public transient b h;
    public transient b n;
    public transient h7.m r;

    public final Map a() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i9, int i10) {
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        Object[] objArr = this.c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i11 = size - 1;
        if (i9 >= i11) {
            objArr[i9] = null;
            objArr2[i9] = null;
            iArr[i9] = 0;
            return;
        }
        int i12 = i9 + 1;
        Object obj2 = objArr[i11];
        objArr[i9] = obj2;
        objArr2[i9] = objArr2[i11];
        objArr[i11] = null;
        objArr2[i11] = null;
        iArr[i9] = iArr[i11];
        iArr[i11] = 0;
        int a2 = f7.u8.a(obj2) & i10;
        int b10 = f7.t8.b(a2, obj);
        if (b10 == size) {
            f7.t8.d(a2, i12, obj);
            return;
        }
        while (true) {
            int i13 = b10 - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                iArr[i13] = (i14 & (~i10)) | (i10 & i12);
                return;
            }
            b10 = i15;
        }
    }

    public final boolean c() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.e += 32;
        Map a2 = a();
        if (a2 != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            a2.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f, (Object) null);
        Object[] objArr2 = this.d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f, (Object) null);
        Object obj = this.a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a2 = a();
        return a2 != null ? a2.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.containsValue(obj);
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            Object[] objArr = this.d;
            objArr.getClass();
            if (f7.x8.a(obj, objArr[i9])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int a2 = f7.u8.a(obj);
        int d = d();
        Object obj2 = this.a;
        obj2.getClass();
        int b10 = f7.t8.b(a2 & d, obj2);
        if (b10 != 0) {
            int i9 = ~d;
            int i10 = a2 & i9;
            do {
                int i11 = b10 - 1;
                int[] iArr = this.b;
                iArr.getClass();
                int i12 = iArr[i11];
                if ((i12 & i9) == i10) {
                    Object[] objArr = this.c;
                    objArr.getClass();
                    if (f7.x8.a(obj, objArr[i11])) {
                        return i11;
                    }
                }
                b10 = i12 & d;
            } while (b10 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.n;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.n = bVar2;
        return bVar2;
    }

    public final int f(int i9, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object c10 = f7.t8.c(i10);
        if (i12 != 0) {
            f7.t8.d(i11 & i13, i12 + 1, c10);
        }
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        for (int i14 = 0; i14 <= i9; i14++) {
            int b10 = f7.t8.b(i14, obj);
            while (b10 != 0) {
                int i15 = b10 - 1;
                int i16 = iArr[i15];
                int i17 = ((~i9) & i16) | i14;
                int i18 = i17 & i13;
                int b11 = f7.t8.b(i18, c10);
                f7.t8.d(i18, b10, c10);
                iArr[i15] = ((~i13) & i17) | (b11 & i13);
                b10 = i16 & i9;
            }
        }
        this.a = c10;
        this.e = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.e & (-32));
        return i13;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int d = d();
            Object obj2 = this.a;
            obj2.getClass();
            int[] iArr = this.b;
            iArr.getClass();
            Object[] objArr = this.c;
            objArr.getClass();
            int a2 = f7.t8.a(obj, null, d, obj2, iArr, objArr, null);
            if (a2 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a2];
                b(a2, d);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.get(obj);
        }
        int e10 = e(obj);
        if (e10 == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[e10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b bVar = this.h;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 1);
        this.h = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i9 = this.e;
            int max = Math.max(i9 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = f7.t8.c(max2);
            this.e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i9];
            this.c = new Object[i9];
            this.d = new Object[i9];
        }
        Map a2 = a();
        if (a2 != null) {
            return a2.put(obj, obj2);
        }
        int[] iArr = this.b;
        iArr.getClass();
        Object[] objArr = this.c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i10 = this.f;
        int i11 = i10 + 1;
        int a3 = f7.u8.a(obj);
        int d = d();
        int i12 = a3 & d;
        Object obj3 = this.a;
        obj3.getClass();
        int b10 = f7.t8.b(i12, obj3);
        if (b10 != 0) {
            int i13 = ~d;
            int i14 = a3 & i13;
            int i15 = 0;
            while (true) {
                int i16 = b10 - 1;
                int i17 = iArr[i16];
                int i18 = i17 & i13;
                if (i18 == i14 && f7.x8.a(obj, objArr[i16])) {
                    Object obj4 = objArr2[i16];
                    objArr2[i16] = obj2;
                    return obj4;
                }
                int i19 = i17 & d;
                int i20 = i15 + 1;
                if (i19 != 0) {
                    i15 = i20;
                    b10 = i19;
                } else {
                    if (i20 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        int i21 = isEmpty() ? -1 : 0;
                        while (i21 >= 0) {
                            Object[] objArr3 = this.c;
                            objArr3.getClass();
                            Object obj5 = objArr3[i21];
                            Object[] objArr4 = this.d;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[i21]);
                            int i22 = i21 + 1;
                            i21 = i22 < this.f ? i22 : -1;
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i11 > d) {
                        d = f(d, (d + 1) * (d < 32 ? 4 : 2), a3, i10);
                    } else {
                        iArr[i16] = (i11 & d) | i18;
                    }
                }
            }
        } else if (i11 > d) {
            d = f(d, (d + 1) * (d < 32 ? 4 : 2), a3, i10);
        } else {
            Object obj6 = this.a;
            obj6.getClass();
            f7.t8.d(i12, i11, obj6);
        }
        int[] iArr2 = this.b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i11 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.b;
            iArr3.getClass();
            this.b = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.c;
            objArr5.getClass();
            this.c = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.d;
            objArr6.getClass();
            this.d = Arrays.copyOf(objArr6, min);
        }
        int i23 = (~d) & a3;
        int[] iArr4 = this.b;
        iArr4.getClass();
        iArr4[i10] = i23;
        Object[] objArr7 = this.c;
        objArr7.getClass();
        objArr7[i10] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i10] = obj2;
        this.f = i11;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == s) {
            return null;
        }
        return g10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a2 = a();
        return a2 != null ? a2.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        h7.m mVar = this.r;
        if (mVar != null) {
            return mVar;
        }
        h7.m mVar2 = new h7.m(2, this);
        this.r = mVar2;
        return mVar2;
    }
}
