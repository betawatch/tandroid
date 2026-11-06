package c8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public transient a8.n r;

    public final Map b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void c(int i7, int i10) {
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
        if (i7 >= i11) {
            objArr[i7] = null;
            objArr2[i7] = null;
            iArr[i7] = 0;
            return;
        }
        int i12 = i7 + 1;
        Object obj2 = objArr[i11];
        objArr[i7] = obj2;
        objArr2[i7] = objArr2[i11];
        objArr[i11] = null;
        objArr2[i11] = null;
        iArr[i7] = iArr[i11];
        iArr[i11] = 0;
        int a10 = a8.w7.a(obj2) & i10;
        int b10 = a8.v7.b(a10, obj);
        if (b10 == size) {
            a8.v7.d(a10, i12, obj);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (d()) {
            return;
        }
        this.e += 32;
        Map b10 = b();
        if (b10 != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            b10.clear();
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
        Map b10 = b();
        return b10 != null ? b10.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f; i7++) {
            Object[] objArr = this.d;
            objArr.getClass();
            if (a8.e8.a(obj, objArr[i7])) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.a == null;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
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

    public final int f(Object obj) {
        if (d()) {
            return -1;
        }
        int a10 = a8.w7.a(obj);
        int e10 = e();
        Object obj2 = this.a;
        obj2.getClass();
        int b10 = a8.v7.b(a10 & e10, obj2);
        if (b10 != 0) {
            int i7 = ~e10;
            int i10 = a10 & i7;
            do {
                int i11 = b10 - 1;
                int[] iArr = this.b;
                iArr.getClass();
                int i12 = iArr[i11];
                if ((i12 & i7) == i10) {
                    Object[] objArr = this.c;
                    objArr.getClass();
                    if (a8.e8.a(obj, objArr[i11])) {
                        return i11;
                    }
                }
                b10 = i12 & e10;
            } while (b10 != 0);
        }
        return -1;
    }

    public final int g(int i7, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object c10 = a8.v7.c(i10);
        if (i12 != 0) {
            a8.v7.d(i11 & i13, i12 + 1, c10);
        }
        Object obj = this.a;
        obj.getClass();
        int[] iArr = this.b;
        iArr.getClass();
        for (int i14 = 0; i14 <= i7; i14++) {
            int b10 = a8.v7.b(i14, obj);
            while (b10 != 0) {
                int i15 = b10 - 1;
                int i16 = iArr[i15];
                int i17 = ((~i7) & i16) | i14;
                int i18 = i17 & i13;
                int b11 = a8.v7.b(i18, c10);
                a8.v7.d(i18, b10, c10);
                iArr[i15] = ((~i13) & i17) | (b11 & i13);
                b10 = i16 & i7;
            }
        }
        this.a = c10;
        this.e = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.e & (-32));
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int f10 = f(obj);
        if (f10 == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[f10];
    }

    public final Object h(Object obj) {
        if (!d()) {
            int e10 = e();
            Object obj2 = this.a;
            obj2.getClass();
            int[] iArr = this.b;
            iArr.getClass();
            Object[] objArr = this.c;
            objArr.getClass();
            int a10 = a8.v7.a(obj, null, e10, obj2, iArr, objArr, null);
            if (a10 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a10];
                c(a10, e10);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return s;
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
        int i7;
        int i10 = 32;
        if (d()) {
            if (!d()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i11 = this.e;
            int max = Math.max(i11 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = a8.v7.c(max2);
            this.e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i11];
            this.c = new Object[i11];
            this.d = new Object[i11];
        }
        Map b10 = b();
        if (b10 != null) {
            return b10.put(obj, obj2);
        }
        int[] iArr = this.b;
        iArr.getClass();
        Object[] objArr = this.c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i12 = this.f;
        int i13 = i12 + 1;
        int a10 = a8.w7.a(obj);
        int e10 = e();
        int i14 = a10 & e10;
        Object obj3 = this.a;
        obj3.getClass();
        int b11 = a8.v7.b(i14, obj3);
        if (b11 == 0) {
            if (i13 > e10) {
                e10 = g(e10, (e10 + 1) * (e10 < 32 ? 4 : 2), a10, i12);
            } else {
                Object obj4 = this.a;
                obj4.getClass();
                a8.v7.d(i14, i13, obj4);
            }
            i7 = 1;
        } else {
            int i15 = ~e10;
            int i16 = a10 & i15;
            int i17 = 0;
            while (true) {
                int i18 = b11 - 1;
                int i19 = iArr[i18];
                i7 = 1;
                int i20 = i19 & i15;
                int i21 = i10;
                if (i20 == i16 && a8.e8.a(obj, objArr[i18])) {
                    Object obj5 = objArr2[i18];
                    objArr2[i18] = obj2;
                    return obj5;
                }
                int i22 = i19 & e10;
                int i23 = i17 + 1;
                if (i22 != 0) {
                    i17 = i23;
                    b11 = i22;
                    i10 = i21;
                } else {
                    if (i23 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(e() + 1, 1.0f);
                        int i24 = isEmpty() ? -1 : 0;
                        while (i24 >= 0) {
                            Object[] objArr3 = this.c;
                            objArr3.getClass();
                            Object obj6 = objArr3[i24];
                            Object[] objArr4 = this.d;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i24]);
                            int i25 = i24 + 1;
                            i24 = i25 < this.f ? i25 : -1;
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > e10) {
                        e10 = g(e10, (e10 + 1) * (e10 < i21 ? 4 : 2), a10, i12);
                    } else {
                        iArr[i18] = (i13 & e10) | i20;
                    }
                }
            }
        }
        int[] iArr2 = this.b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i13 > length) {
            int i26 = i7;
            int min = Math.min(1073741823, (Math.max(i26, length >>> 1) + length) | i26);
            if (min != length) {
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
        }
        int i27 = (~e10) & a10;
        int[] iArr4 = this.b;
        iArr4.getClass();
        iArr4[i12] = i27;
        Object[] objArr7 = this.c;
        objArr7.getClass();
        objArr7[i12] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i12] = obj2;
        this.f = i13;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object h = h(obj);
        if (h == s) {
            return null;
        }
        return h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b10 = b();
        return b10 != null ? b10.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        a8.n nVar = this.r;
        if (nVar != null) {
            return nVar;
        }
        a8.n nVar2 = new a8.n((Object) this, 2);
        this.r = nVar2;
        return nVar2;
    }
}
