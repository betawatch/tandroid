package o8;

import g7.r6;
import j$.util.Objects;
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
public final class p extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient n h;
    public transient n n;
    public transient h7.m r;

    public static p a() {
        p pVar = new p();
        pVar.e = r6.b(8, 1);
        return pVar;
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
            this.e = r6.b(size(), 3);
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
        for (int i9 = 0; i9 < this.f; i9++) {
            if (g7.c0.a(obj, j()[i9])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int p6 = l.p(obj);
        int c10 = c();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int q10 = l.q(p6 & c10, obj2);
        if (q10 == 0) {
            return -1;
        }
        int i9 = ~c10;
        int i10 = p6 & i9;
        do {
            int i11 = q10 - 1;
            int i12 = h()[i11];
            if ((i12 & i9) == i10 && g7.c0.a(obj, i()[i11])) {
                return i11;
            }
            q10 = i12 & c10;
        } while (q10 != 0);
        return -1;
    }

    public final void e(int i9, int i10) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i11 = i();
        Object[] j10 = j();
        int size = size();
        int i12 = size - 1;
        if (i9 >= i12) {
            i11[i9] = null;
            j10[i9] = null;
            h[i9] = 0;
            return;
        }
        Object obj2 = i11[i12];
        i11[i9] = obj2;
        j10[i9] = j10[i12];
        i11[i12] = null;
        j10[i12] = null;
        h[i9] = h[i12];
        h[i12] = 0;
        int p6 = l.p(obj2) & i10;
        int q10 = l.q(p6, obj);
        if (q10 == size) {
            l.r(p6, i9 + 1, obj);
            return;
        }
        while (true) {
            int i13 = q10 - 1;
            int i14 = h[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                h[i13] = l.j(i14, i9 + 1, i10);
                return;
            }
            q10 = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n nVar = this.n;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 0);
        this.n = nVar2;
        return nVar2;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int c10 = c();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int m10 = l.m(obj, null, c10, obj2, h(), i(), null);
            if (m10 != -1) {
                Object obj3 = j()[m10];
                e(m10, c10);
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

    public final int k(int i9, int i10, int i11, int i12) {
        Object b10 = l.b(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            l.r(i11 & i13, i12 + 1, b10);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i14 = 0; i14 <= i9; i14++) {
            int q10 = l.q(i14, obj);
            while (q10 != 0) {
                int i15 = q10 - 1;
                int i16 = h[i15];
                int i17 = ((~i9) & i16) | i14;
                int i18 = i17 & i13;
                int q11 = l.q(i18, b10);
                l.r(i18, q10, b10);
                h[i15] = l.j(i17, q11, i13);
                q10 = i16 & i9;
            }
        }
        this.a = b10;
        this.e = l.j(this.e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        n nVar = this.h;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 1);
        this.h = nVar2;
        return nVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0105 -> B:47:0x00eb). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i9;
        int min;
        int i10 = 1;
        if (f()) {
            if (!f()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i11 = this.e;
            int max = Math.max(i11 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = l.b(max2);
            this.e = l.j(this.e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.b = new int[i11];
            this.c = new Object[i11];
            this.d = new Object[i11];
        }
        Map b10 = b();
        if (b10 != null) {
            return b10.put(obj, obj2);
        }
        int[] h = h();
        Object[] i12 = i();
        Object[] j10 = j();
        int i13 = this.f;
        int i14 = i13 + 1;
        int p6 = l.p(obj);
        int c10 = c();
        int i15 = p6 & c10;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int q10 = l.q(i15, obj3);
        if (q10 != 0) {
            int i16 = ~c10;
            int i17 = p6 & i16;
            int i18 = 0;
            while (true) {
                int i19 = q10 - i10;
                int i20 = h[i19];
                if ((i20 & i16) == i17 && g7.c0.a(obj, i12[i19])) {
                    Object obj4 = j10[i19];
                    j10[i19] = obj2;
                    return obj4;
                }
                int i21 = i20 & c10;
                int i22 = i18 + 1;
                if (i21 != 0) {
                    i18 = i22;
                    q10 = i21;
                    i10 = 1;
                } else {
                    if (i22 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        if (!isEmpty()) {
                            i9 = 0;
                            while (i9 >= 0) {
                                linkedHashMap.put(i()[i9], j()[i9]);
                                int i23 = i9 + 1;
                                if (i23 < this.f) {
                                    i9 = i23;
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i9 = -1;
                        while (i9 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i14 > c10) {
                        c10 = k(c10, (c10 + 1) * (c10 < 32 ? 4 : 2), p6, i13);
                    } else {
                        h[i19] = l.j(i20, i14, c10);
                    }
                }
            }
        } else if (i14 > c10) {
            c10 = k(c10, (c10 + 1) * (c10 < 32 ? 4 : 2), p6, i13);
        } else {
            Object obj5 = this.a;
            Objects.requireNonNull(obj5);
            l.r(i15, i14, obj5);
        }
        int length = h().length;
        if (i14 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(h(), min);
            this.c = Arrays.copyOf(i(), min);
            this.d = Arrays.copyOf(j(), min);
        }
        h()[i13] = l.j(p6, 0, c10);
        i()[i13] = obj;
        j()[i13] = obj2;
        this.f = i14;
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
        h7.m mVar = this.r;
        if (mVar != null) {
            return mVar;
        }
        h7.m mVar2 = new h7.m(5, this);
        this.r = mVar2;
        return mVar2;
    }
}
