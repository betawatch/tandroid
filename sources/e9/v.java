package e9;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import v7.s6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient s h;
    public transient s n;
    public transient n r;

    public static v a(int i10) {
        v vVar = new v();
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        vVar.e = Math.min(Math.max(i10, 1), 1073741823);
        return vVar;
    }

    public final Map b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
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
        Arrays.fill(i(), 0, this.f, (Object) null);
        Arrays.fill(j(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        return b10 != null ? b10.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (s6.a(obj, j()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int t10 = q.t(obj);
        int c10 = c();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int u10 = q.u(t10 & c10, obj2);
        if (u10 == 0) {
            return -1;
        }
        int i10 = ~c10;
        int i11 = t10 & i10;
        do {
            int i12 = u10 - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && s6.a(obj, i()[i12])) {
                return i12;
            }
            u10 = i13 & c10;
        } while (u10 != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i12 = i();
        Object[] j3 = j();
        int size = size();
        int i13 = size - 1;
        if (i10 >= i13) {
            i12[i10] = null;
            j3[i10] = null;
            h[i10] = 0;
            return;
        }
        Object obj2 = i12[i13];
        i12[i10] = obj2;
        j3[i10] = j3[i13];
        i12[i13] = null;
        j3[i13] = null;
        h[i10] = h[i13];
        h[i13] = 0;
        int t10 = q.t(obj2) & i11;
        int u10 = q.u(t10, obj);
        if (u10 == size) {
            q.v(t10, i10 + 1, obj);
            return;
        }
        while (true) {
            int i14 = u10 - 1;
            int i15 = h[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                h[i14] = q.o(i15, i10 + 1, i11);
                return;
            }
            u10 = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s sVar = this.n;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 0);
        this.n = sVar2;
        return sVar2;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int c10 = c();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int q6 = q.q(obj, null, c10, obj2, h(), i(), null);
            if (q6 != -1) {
                Object obj3 = j()[q6];
                e(q6, c10);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j()[d];
    }

    public final int[] h() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object f7 = q.f(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            q.v(i12 & i14, i13 + 1, f7);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int u10 = q.u(i15, obj);
            while (u10 != 0) {
                int i16 = u10 - 1;
                int i17 = h[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int u11 = q.u(i19, f7);
                q.v(i19, u10, f7);
                h[i16] = q.o(i18, u11, i14);
                u10 = i17 & i10;
            }
        }
        this.a = f7;
        this.e = q.o(this.e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s sVar = this.h;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 1);
        this.h = sVar2;
        return sVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0105 -> B:47:0x00eb). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i10;
        int min;
        int i11 = 1;
        if (f()) {
            if (!f()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i12 = this.e;
            int max = Math.max(i12 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = q.f(max2);
            this.e = q.o(this.e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.b = new int[i12];
            this.c = new Object[i12];
            this.d = new Object[i12];
        }
        Map b10 = b();
        if (b10 != null) {
            return b10.put(obj, obj2);
        }
        int[] h = h();
        Object[] i13 = i();
        Object[] j3 = j();
        int i14 = this.f;
        int i15 = i14 + 1;
        int t10 = q.t(obj);
        int c10 = c();
        int i16 = t10 & c10;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int u10 = q.u(i16, obj3);
        if (u10 != 0) {
            int i17 = ~c10;
            int i18 = t10 & i17;
            int i19 = 0;
            while (true) {
                int i20 = u10 - i11;
                int i21 = h[i20];
                if ((i21 & i17) == i18 && s6.a(obj, i13[i20])) {
                    Object obj4 = j3[i20];
                    j3[i20] = obj2;
                    return obj4;
                }
                int i22 = i21 & c10;
                int i23 = i19 + 1;
                if (i22 != 0) {
                    i19 = i23;
                    u10 = i22;
                    i11 = 1;
                } else {
                    if (i23 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        if (!isEmpty()) {
                            i10 = 0;
                            while (i10 >= 0) {
                                linkedHashMap.put(i()[i10], j()[i10]);
                                int i24 = i10 + 1;
                                if (i24 < this.f) {
                                    i10 = i24;
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i10 = -1;
                        while (i10 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i15 > c10) {
                        c10 = k(c10, (c10 + 1) * (c10 < 32 ? 4 : 2), t10, i14);
                    } else {
                        h[i20] = q.o(i21, i15, c10);
                    }
                }
            }
        } else if (i15 > c10) {
            c10 = k(c10, (c10 + 1) * (c10 < 32 ? 4 : 2), t10, i14);
        } else {
            Object obj5 = this.a;
            Objects.requireNonNull(obj5);
            q.v(i16, i15, obj5);
        }
        int length = h().length;
        if (i15 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(h(), min);
            this.c = Arrays.copyOf(i(), min);
            this.d = Arrays.copyOf(j(), min);
        }
        h()[i14] = q.o(t10, 0, c10);
        i()[i14] = obj;
        j()[i14] = obj2;
        this.f = i15;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == s) {
            return null;
        }
        return g10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b10 = b();
        return b10 != null ? b10.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.r;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(1, this);
        this.r = nVar2;
        return nVar2;
    }
}
