package h9;

import a8.ha;
import a8.ia;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class s extends AbstractMap implements Serializable {
    public static final Object s = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient q h;
    public transient q n;
    public transient a8.n r;

    public static s b() {
        s sVar = new s();
        sVar.e = Math.min(Math.max(3, 1), 1073741823);
        return sVar;
    }

    public static s c(int i7) {
        s sVar = new s();
        ia.e("Expected size must be >= 0", i7 >= 0);
        sVar.e = Math.min(Math.max(i7, 1), 1073741823);
        return sVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.e += 32;
        Map d = d();
        if (d != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            d.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f, (Object) null);
        Arrays.fill(l(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map d = d();
        return d != null ? d.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map d = d();
        if (d != null) {
            return d.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f; i7++) {
            if (ha.a(obj, l()[i7])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        q qVar = this.n;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this, 0);
        this.n = qVar2;
        return qVar2;
    }

    public final int f(Object obj) {
        if (h()) {
            return -1;
        }
        int v = o.v(obj);
        int e10 = e();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int w10 = o.w(v & e10, obj2);
        if (w10 == 0) {
            return -1;
        }
        int i7 = ~e10;
        int i10 = v & i7;
        do {
            int i11 = w10 - 1;
            int i12 = j()[i11];
            if ((i12 & i7) == i10 && ha.a(obj, k()[i11])) {
                return i11;
            }
            w10 = i12 & e10;
        } while (w10 != 0);
        return -1;
    }

    public final void g(int i7, int i10) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] j3 = j();
        Object[] k10 = k();
        Object[] l10 = l();
        int size = size();
        int i11 = size - 1;
        if (i7 >= i11) {
            k10[i7] = null;
            l10[i7] = null;
            j3[i7] = 0;
            return;
        }
        Object obj2 = k10[i11];
        k10[i7] = obj2;
        l10[i7] = l10[i11];
        k10[i11] = null;
        l10[i11] = null;
        j3[i7] = j3[i11];
        j3[i11] = 0;
        int v = o.v(obj2) & i10;
        int w10 = o.w(v, obj);
        if (w10 == size) {
            o.x(v, i7 + 1, obj);
            return;
        }
        while (true) {
            int i12 = w10 - 1;
            int i13 = j3[i12];
            int i14 = i13 & i10;
            if (i14 == size) {
                j3[i12] = o.q(i13, i7 + 1, i10);
                return;
            }
            w10 = i14;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map d = d();
        if (d != null) {
            return d.get(obj);
        }
        int f10 = f(obj);
        if (f10 == -1) {
            return null;
        }
        return l()[f10];
    }

    public final boolean h() {
        return this.a == null;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int e10 = e();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int s5 = o.s(obj, null, e10, obj2, j(), k(), null);
            if (s5 != -1) {
                Object obj3 = l()[s5];
                g(s5, e10);
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

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        q qVar = this.h;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this, 1);
        this.h = qVar2;
        return qVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i7, int i10, int i11, int i12) {
        Object h = o.h(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            o.x(i11 & i13, i12 + 1, h);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] j3 = j();
        for (int i14 = 0; i14 <= i7; i14++) {
            int w10 = o.w(i14, obj);
            while (w10 != 0) {
                int i15 = w10 - 1;
                int i16 = j3[i15];
                int i17 = ((~i7) & i16) | i14;
                int i18 = i17 & i13;
                int w11 = o.w(i18, h);
                o.x(i18, w10, h);
                j3[i15] = o.q(i17, w11, i13);
                w10 = i16 & i7;
            }
        }
        this.a = h;
        this.e = o.q(this.e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11 = 32;
        int i12 = 1;
        if (h()) {
            ia.o("Arrays already allocated", h());
            int i13 = this.e;
            int max = Math.max(i13 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = TLObject.FLAG_30;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = o.h(max2);
            this.e = o.q(this.e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.b = new int[i13];
            this.c = new Object[i13];
            this.d = new Object[i13];
        }
        Map d = d();
        if (d != null) {
            return d.put(obj, obj2);
        }
        int[] j3 = j();
        Object[] k10 = k();
        Object[] l10 = l();
        int i14 = this.f;
        int i15 = i14 + 1;
        int v = o.v(obj);
        int e10 = e();
        int i16 = v & e10;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int w10 = o.w(i16, obj3);
        if (w10 == 0) {
            if (i15 > e10) {
                e10 = m(e10, (e10 + 1) * (e10 < 32 ? 4 : 2), v, i14);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                o.x(i16, i15, obj4);
            }
            i7 = 1;
        } else {
            int i17 = ~e10;
            int i18 = v & i17;
            int i19 = 0;
            while (true) {
                int i20 = w10 - i12;
                i7 = i12;
                int i21 = j3[i20];
                int i22 = i11;
                if ((i21 & i17) == i18 && ha.a(obj, k10[i20])) {
                    Object obj5 = l10[i20];
                    l10[i20] = obj2;
                    return obj5;
                }
                int i23 = i21 & e10;
                int i24 = i19 + 1;
                if (i23 != 0) {
                    i19 = i24;
                    w10 = i23;
                    i12 = i7;
                    i11 = i22;
                } else {
                    if (i24 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(e() + 1, 1.0f);
                        if (!isEmpty()) {
                            i10 = 0;
                            while (i10 >= 0) {
                                linkedHashMap.put(k()[i10], l()[i10]);
                                int i25 = i10 + 1;
                                if (i25 < this.f) {
                                    i10 = i25;
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
                    if (i15 > e10) {
                        e10 = m(e10, (e10 + 1) * (e10 < i22 ? 4 : 2), v, i14);
                    } else {
                        j3[i20] = o.q(i21, i15, e10);
                    }
                }
            }
        }
        int length = j().length;
        if (i15 > length) {
            int i26 = i7;
            int min = Math.min(1073741823, (Math.max(i26, length >>> 1) + length) | i26);
            if (min != length) {
                this.b = Arrays.copyOf(j(), min);
                this.c = Arrays.copyOf(k(), min);
                this.d = Arrays.copyOf(l(), min);
            }
        }
        j()[i14] = o.q(v, 0, e10);
        k()[i14] = obj;
        l()[i14] = obj2;
        this.f = i15;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map d = d();
        if (d != null) {
            return d.remove(obj);
        }
        Object i7 = i(obj);
        if (i7 == s) {
            return null;
        }
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map d = d();
        return d != null ? d.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        a8.n nVar = this.r;
        if (nVar != null) {
            return nVar;
        }
        a8.n nVar2 = new a8.n((Object) this, 6);
        this.r = nVar2;
        return nVar2;
    }
}
