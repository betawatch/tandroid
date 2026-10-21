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
import v7.t6;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class x extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient u h;
    public transient u n;
    public transient o r;

    public static x a() {
        x xVar = new x();
        xVar.e = Math.min(Math.max(3, 1), 1073741823);
        return xVar;
    }

    public static x b(int i10) {
        x xVar = new x();
        u6.f("Expected size must be >= 0", i10 >= 0);
        xVar.e = Math.min(Math.max(i10, 1), 1073741823);
        return xVar;
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.e += 32;
        Map c10 = c();
        if (c10 != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            c10.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f, (Object) null);
        Arrays.fill(k(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c10 = c();
        return c10 != null ? c10.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (t6.a(obj, k()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int u10 = s.u(obj);
        int d = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int v = s.v(u10 & d, obj2);
        if (v == 0) {
            return -1;
        }
        int i10 = ~d;
        int i11 = u10 & i10;
        do {
            int i12 = v - 1;
            int i13 = i()[i12];
            if ((i13 & i10) == i11 && t6.a(obj, j()[i12])) {
                return i12;
            }
            v = i13 & d;
        } while (v != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        u uVar = this.n;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this, 0);
        this.n = uVar2;
        return uVar2;
    }

    public final void f(int i10, int i11) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] i12 = i();
        Object[] j10 = j();
        Object[] k10 = k();
        int size = size();
        int i13 = size - 1;
        if (i10 >= i13) {
            j10[i10] = null;
            k10[i10] = null;
            i12[i10] = 0;
            return;
        }
        Object obj2 = j10[i13];
        j10[i10] = obj2;
        k10[i10] = k10[i13];
        j10[i13] = null;
        k10[i13] = null;
        i12[i10] = i12[i13];
        i12[i13] = 0;
        int u10 = s.u(obj2) & i11;
        int v = s.v(u10, obj);
        if (v == size) {
            s.w(u10, i10 + 1, obj);
            return;
        }
        while (true) {
            int i14 = v - 1;
            int i15 = i12[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                i12[i14] = s.p(i15, i10 + 1, i11);
                return;
            }
            v = i16;
        }
    }

    public final boolean g() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.get(obj);
        }
        int e = e(obj);
        if (e == -1) {
            return null;
        }
        return k()[e];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int d = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int r10 = s.r(obj, null, d, obj2, i(), j(), null);
            if (r10 != -1) {
                Object obj3 = k()[r10];
                f(r10, d);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return s;
    }

    public final int[] i() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        u uVar = this.h;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this, 1);
        this.h = uVar2;
        return uVar2;
    }

    public final int l(int i10, int i11, int i12, int i13) {
        Object g10 = s.g(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            s.w(i12 & i14, i13 + 1, g10);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] i15 = i();
        for (int i16 = 0; i16 <= i10; i16++) {
            int v = s.v(i16, obj);
            while (v != 0) {
                int i17 = v - 1;
                int i18 = i15[i17];
                int i19 = ((~i10) & i18) | i16;
                int i20 = i19 & i14;
                int v10 = s.v(i20, g10);
                s.w(i20, v, g10);
                i15[i17] = s.p(i19, v10, i14);
                v = i18 & i10;
            }
        }
        this.a = g10;
        this.e = s.p(this.e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12 = 32;
        int i13 = 1;
        if (g()) {
            u6.o("Arrays already allocated", g());
            int i14 = this.e;
            int max = Math.max(i14 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = s.g(max2);
            this.e = s.p(this.e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.b = new int[i14];
            this.c = new Object[i14];
            this.d = new Object[i14];
        }
        Map c10 = c();
        if (c10 != null) {
            return c10.put(obj, obj2);
        }
        int[] i15 = i();
        Object[] j10 = j();
        Object[] k10 = k();
        int i16 = this.f;
        int i17 = i16 + 1;
        int u10 = s.u(obj);
        int d = d();
        int i18 = u10 & d;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int v = s.v(i18, obj3);
        if (v == 0) {
            if (i17 > d) {
                d = l(d, (d + 1) * (d < 32 ? 4 : 2), u10, i16);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                s.w(i18, i17, obj4);
            }
            i10 = 1;
        } else {
            int i19 = ~d;
            int i20 = u10 & i19;
            int i21 = 0;
            while (true) {
                int i22 = v - i13;
                i10 = i13;
                int i23 = i15[i22];
                int i24 = i12;
                if ((i23 & i19) == i20 && t6.a(obj, j10[i22])) {
                    Object obj5 = k10[i22];
                    k10[i22] = obj2;
                    return obj5;
                }
                int i25 = i23 & d;
                int i26 = i21 + 1;
                if (i25 != 0) {
                    i21 = i26;
                    v = i25;
                    i13 = i10;
                    i12 = i24;
                } else {
                    if (i26 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        if (!isEmpty()) {
                            i11 = 0;
                            while (i11 >= 0) {
                                linkedHashMap.put(j()[i11], k()[i11]);
                                int i27 = i11 + 1;
                                if (i27 < this.f) {
                                    i11 = i27;
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i11 = -1;
                        while (i11 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i17 > d) {
                        d = l(d, (d + 1) * (d < i24 ? 4 : 2), u10, i16);
                    } else {
                        i15[i22] = s.p(i23, i17, d);
                    }
                }
            }
        }
        int length = i().length;
        if (i17 > length) {
            int i28 = i10;
            int min = Math.min(1073741823, (Math.max(i28, length >>> 1) + length) | i28);
            if (min != length) {
                this.b = Arrays.copyOf(i(), min);
                this.c = Arrays.copyOf(j(), min);
                this.d = Arrays.copyOf(k(), min);
            }
        }
        i()[i16] = s.p(u10, 0, d);
        j()[i16] = obj;
        k()[i16] = obj2;
        this.f = i17;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.remove(obj);
        }
        Object h = h(obj);
        if (h == s) {
            return null;
        }
        return h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c10 = c();
        return c10 != null ? c10.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        o oVar = this.r;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o((Object) this, 2);
        this.r = oVar2;
        return oVar2;
    }
}
