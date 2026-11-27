// default package

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lp2 extends AbstractMap implements Serializable {
    public static final Object w = new Object();
    public static final Object x = new Object();
    public static final Object y = new Object();
    public final /* synthetic */ byte a;
    public transient Object b;
    public transient int[] c;
    public transient Object[] d;
    public transient Object[] e;
    public transient int f;
    public transient int h;
    public transient AbstractSet n;
    public transient AbstractSet r;
    public transient AbstractCollection s;

    public /* synthetic */ lp2(byte b) {
        this.a = b;
        this.f = 12;
    }

    public static lp2 b() {
        lp2 lp2Var = new lp2();
        lp2Var.f = 3;
        return lp2Var;
    }

    public static lp2 c(int i) {
        lp2 lp2Var = new lp2();
        yve.e("Expected size must be >= 0", i >= 0);
        lp2Var.f = Math.min(Math.max(i, 1), 1073741823);
        return lp2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                if (!i()) {
                    this.f += 32;
                    Map d = d();
                    if (d == null) {
                        Object[] objArr = this.d;
                        Objects.requireNonNull(objArr);
                        Arrays.fill(objArr, 0, this.h, (Object) null);
                        Object[] objArr2 = this.e;
                        Objects.requireNonNull(objArr2);
                        Arrays.fill(objArr2, 0, this.h, (Object) null);
                        Object obj = this.b;
                        Objects.requireNonNull(obj);
                        if (obj instanceof byte[]) {
                            Arrays.fill((byte[]) obj, (byte) 0);
                        } else if (obj instanceof short[]) {
                            Arrays.fill((short[]) obj, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj, 0);
                        }
                        int[] iArr = this.c;
                        Objects.requireNonNull(iArr);
                        Arrays.fill(iArr, 0, this.h, 0);
                        this.h = 0;
                        break;
                    } else {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        d.clear();
                        this.b = null;
                        this.h = 0;
                        break;
                    }
                }
                break;
            case 1:
                if (!p()) {
                    this.f += 32;
                    Map m = m();
                    if (m != null) {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        m.clear();
                        this.b = null;
                        this.h = 0;
                        break;
                    } else {
                        Object[] objArr3 = this.d;
                        objArr3.getClass();
                        Arrays.fill(objArr3, 0, this.h, (Object) null);
                        Object[] objArr4 = this.e;
                        objArr4.getClass();
                        Arrays.fill(objArr4, 0, this.h, (Object) null);
                        Object obj2 = this.b;
                        obj2.getClass();
                        if (obj2 instanceof byte[]) {
                            Arrays.fill((byte[]) obj2, (byte) 0);
                        } else if (obj2 instanceof short[]) {
                            Arrays.fill((short[]) obj2, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj2, 0);
                        }
                        int[] iArr2 = this.c;
                        iArr2.getClass();
                        Arrays.fill(iArr2, 0, this.h, 0);
                        this.h = 0;
                        break;
                    }
                }
                break;
            default:
                if (!t()) {
                    this.f += 32;
                    Map n = n();
                    if (n == null) {
                        Object[] objArr5 = this.d;
                        objArr5.getClass();
                        Arrays.fill(objArr5, 0, this.h, (Object) null);
                        Object[] objArr6 = this.e;
                        objArr6.getClass();
                        Arrays.fill(objArr6, 0, this.h, (Object) null);
                        Object obj3 = this.b;
                        obj3.getClass();
                        if (obj3 instanceof byte[]) {
                            Arrays.fill((byte[]) obj3, (byte) 0);
                        } else if (obj3 instanceof short[]) {
                            Arrays.fill((short[]) obj3, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj3, 0);
                        }
                        int[] iArr3 = this.c;
                        iArr3.getClass();
                        Arrays.fill(iArr3, 0, this.h, 0);
                        this.h = 0;
                        break;
                    } else {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        n.clear();
                        this.b = null;
                        this.h = 0;
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d == null) {
                    if (f(obj) == -1) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                Map m = m();
                if (m == null) {
                    if (s(obj) == -1) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                Map n = n();
                if (n == null) {
                    if (x(obj) == -1) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.containsValue(obj);
                }
                for (int i = 0; i < this.h; i++) {
                    if (tue.a(obj, l(i))) {
                        return true;
                    }
                }
                return false;
            case 1:
                Map m = m();
                if (m != null) {
                    return m.containsValue(obj);
                }
                for (int i2 = 0; i2 < this.h; i2++) {
                    Object[] objArr = this.e;
                    objArr.getClass();
                    if (e6f.a(obj, objArr[i2])) {
                        return true;
                    }
                }
                return false;
            default:
                Map n = n();
                if (n != null) {
                    return n.containsValue(obj);
                }
                for (int i3 = 0; i3 < this.h; i3++) {
                    Object[] objArr2 = this.e;
                    objArr2.getClass();
                    if (l8f.a(obj, objArr2[i3])) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final Map d() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int e() {
        return (1 << (this.f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        byte b = 0;
        switch (this.a) {
            case 0:
                ip2 ip2Var = (ip2) this.r;
                if (ip2Var != null) {
                    return ip2Var;
                }
                ip2 ip2Var2 = new ip2(this, b);
                this.r = ip2Var2;
                return ip2Var2;
            case 1:
                fbd fbdVar = (fbd) this.r;
                if (fbdVar != null) {
                    return fbdVar;
                }
                fbd fbdVar2 = new fbd(this, b);
                this.r = fbdVar2;
                return fbdVar2;
            default:
                ndd nddVar = (ndd) this.r;
                if (nddVar != null) {
                    return nddVar;
                }
                ndd nddVar2 = new ndd(this, b);
                this.r = nddVar2;
                return nddVar2;
        }
    }

    public final int f(Object obj) {
        if (i()) {
            return -1;
        }
        int b = yne.b(obj);
        int e = e();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int d = twd.d(b & e, obj2);
        if (d == 0) {
            return -1;
        }
        int i = ~e;
        int i2 = b & i;
        do {
            int i3 = d - 1;
            int[] iArr = this.c;
            Objects.requireNonNull(iArr);
            int i4 = iArr[i3];
            if ((i4 & i) == i2 && tue.a(obj, g(i3))) {
                return i3;
            }
            d = i4 & e;
        } while (d != 0);
        return -1;
    }

    public final Object g(int i) {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.get(obj);
                }
                int f = f(obj);
                if (f != -1) {
                    return l(f);
                }
                return null;
            case 1:
                Map m = m();
                if (m != null) {
                    return m.get(obj);
                }
                int s = s(obj);
                if (s == -1) {
                    return null;
                }
                Object[] objArr = this.e;
                objArr.getClass();
                return objArr[s];
            default:
                Map n = n();
                if (n != null) {
                    return n.get(obj);
                }
                int x2 = x(obj);
                if (x2 == -1) {
                    return null;
                }
                Object[] objArr2 = this.e;
                objArr2.getClass();
                return objArr2[x2];
        }
    }

    public final void h(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.e;
        Objects.requireNonNull(objArr2);
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int b = yne.b(obj2) & i2;
        int d = twd.d(b, obj);
        if (d == size) {
            twd.e(b, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = d - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArr[i4] = twd.b(i5, i + 1, i2);
                return;
            }
            d = i6;
        }
    }

    public final boolean i() {
        return this.b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (size() == 0) {
                }
                break;
            case 1:
                if (size() == 0) {
                }
                break;
            default:
                if (size() == 0) {
                }
                break;
        }
        return false;
    }

    public final Object j(Object obj) {
        if (!i()) {
            int e = e();
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int[] iArr = this.c;
            Objects.requireNonNull(iArr);
            Object[] objArr = this.d;
            Objects.requireNonNull(objArr);
            int c = twd.c(obj, null, e, obj2, iArr, objArr, null);
            if (c != -1) {
                Object l = l(c);
                h(c, e);
                this.h--;
                this.f += 32;
                return l;
            }
        }
        return w;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object a = twd.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            twd.e(i3 & i5, i4 + 1, a);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        for (int i6 = 0; i6 <= i; i6++) {
            int d = twd.d(i6, obj);
            while (d != 0) {
                int i7 = d - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int d2 = twd.d(i10, a);
                twd.e(i10, d, a);
                iArr[i7] = twd.b(i9, d2, i5);
                d = i8 & i;
            }
        }
        this.b = a;
        this.f = twd.b(this.f, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        byte b = 1;
        switch (this.a) {
            case 0:
                ip2 ip2Var = (ip2) this.n;
                if (ip2Var != null) {
                    return ip2Var;
                }
                ip2 ip2Var2 = new ip2(this, b);
                this.n = ip2Var2;
                return ip2Var2;
            case 1:
                fbd fbdVar = (fbd) this.n;
                if (fbdVar != null) {
                    return fbdVar;
                }
                fbd fbdVar2 = new fbd(this, b);
                this.n = fbdVar2;
                return fbdVar2;
            default:
                ndd nddVar = (ndd) this.n;
                if (nddVar != null) {
                    return nddVar;
                }
                ndd nddVar2 = new ndd(this, b);
                this.n = nddVar2;
                return nddVar2;
        }
    }

    public final Object l(int i) {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    public final Map m() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Map n() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void o(int i, int i2) {
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        Object[] objArr = this.d;
        objArr.getClass();
        Object[] objArr2 = this.e;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int a = e4f.a(obj2) & i2;
        int b = b4f.b(a, obj);
        if (b == size) {
            b4f.d(a, i4, obj);
            return;
        }
        while (true) {
            int i5 = b - 1;
            int i6 = iArr[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArr[i5] = (i6 & (~i2)) | (i4 & i2);
                return;
            }
            b = i7;
        }
    }

    public final boolean p() {
        return this.b == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x028b, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0429, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        r15 = r17;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        Object obj3;
        int i3;
        int min;
        int i4;
        int i5;
        int min2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 32;
        switch (this.a) {
            case 0:
                if (i()) {
                    yve.o("Arrays already allocated", i());
                    int i12 = this.f;
                    i2 = 2;
                    int max = Math.max(i12 + 1, 2);
                    int highestOneBit = Integer.highestOneBit(max);
                    if (max <= ((int) (1.0d * highestOneBit)) || (highestOneBit = highestOneBit << 1) > 0) {
                        i4 = highestOneBit;
                        i = 4;
                    } else {
                        i = 4;
                        i4 = TLObject.FLAG_30;
                    }
                    int max2 = Math.max(i, i4);
                    this.b = twd.a(max2);
                    this.f = twd.b(this.f, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
                    this.c = new int[i12];
                    this.d = new Object[i12];
                    this.e = new Object[i12];
                } else {
                    i = 4;
                    i2 = 2;
                }
                Map d = d();
                if (d != null) {
                    return d.put(obj, obj2);
                }
                int[] iArr = this.c;
                Objects.requireNonNull(iArr);
                Object[] objArr = this.d;
                Objects.requireNonNull(objArr);
                Object[] objArr2 = this.e;
                Objects.requireNonNull(objArr2);
                int i13 = this.h;
                int i14 = i13 + 1;
                int b = yne.b(obj);
                int e = e();
                int i15 = b & e;
                Object obj4 = this.b;
                Objects.requireNonNull(obj4);
                int d2 = twd.d(i15, obj4);
                if (d2 == 0) {
                    if (i14 > e) {
                        e = k(e, (e + 1) * (e < 32 ? i : i2), b, i13);
                    } else {
                        Object obj5 = this.b;
                        Objects.requireNonNull(obj5);
                        twd.e(i15, i14, obj5);
                    }
                    obj3 = null;
                } else {
                    int i16 = ~e;
                    int i17 = b & i16;
                    int i18 = 0;
                    while (true) {
                        int i19 = d2 - 1;
                        int i20 = iArr[i19];
                        if ((i20 & i16) == i17 && tue.a(obj, objArr[i19])) {
                            Object obj6 = objArr2[i19];
                            objArr2[i19] = obj2;
                            return obj6;
                        }
                        int i21 = i20 & e;
                        i18++;
                        if (i21 != 0) {
                            d2 = i21;
                        } else if (i18 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(e() + 1, 1.0f);
                            if (!isEmpty()) {
                                i3 = 0;
                                while (i3 >= 0) {
                                    linkedHashMap.put(g(i3), l(i3));
                                    i3++;
                                    if (i3 >= this.h) {
                                    }
                                }
                                this.b = linkedHashMap;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f += 32;
                                return linkedHashMap.put(obj, obj2);
                            }
                            i3 = -1;
                        } else {
                            obj3 = null;
                            if (i14 > e) {
                                e = k(e, (e + 1) * (e < 32 ? 4 : 2), b, i13);
                            } else {
                                iArr[i19] = twd.b(i20, i14, e);
                            }
                        }
                    }
                }
                int[] iArr2 = this.c;
                Objects.requireNonNull(iArr2);
                int length = iArr2.length;
                if (i14 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    int[] iArr3 = this.c;
                    Objects.requireNonNull(iArr3);
                    this.c = Arrays.copyOf(iArr3, min);
                    Object[] objArr3 = this.d;
                    Objects.requireNonNull(objArr3);
                    this.d = Arrays.copyOf(objArr3, min);
                    Object[] objArr4 = this.e;
                    Objects.requireNonNull(objArr4);
                    this.e = Arrays.copyOf(objArr4, min);
                }
                int b2 = twd.b(b, 0, e);
                int[] iArr4 = this.c;
                Objects.requireNonNull(iArr4);
                iArr4[i13] = b2;
                Object[] objArr5 = this.d;
                Objects.requireNonNull(objArr5);
                objArr5[i13] = obj;
                Object[] objArr6 = this.e;
                Objects.requireNonNull(objArr6);
                objArr6[i13] = obj2;
                this.h = i14;
                this.f += 32;
                return obj3;
            case 1:
                if (p()) {
                    if (!p()) {
                        grb.i("Arrays already allocated");
                        return null;
                    }
                    int i22 = this.f;
                    int max3 = Math.max(i22 + 1, 2);
                    int highestOneBit2 = Integer.highestOneBit(max3);
                    if (max3 <= highestOneBit2 || (highestOneBit2 = highestOneBit2 << 1) > 0) {
                        i6 = highestOneBit2;
                        i7 = 4;
                    } else {
                        i7 = 4;
                        i6 = TLObject.FLAG_30;
                    }
                    int max4 = Math.max(i7, i6);
                    this.b = b4f.c(max4);
                    this.f = (this.f & (-32)) | ((32 - Integer.numberOfLeadingZeros(max4 - 1)) & 31);
                    this.c = new int[i22];
                    this.d = new Object[i22];
                    this.e = new Object[i22];
                }
                Map m = m();
                if (m != null) {
                    return m.put(obj, obj2);
                }
                int[] iArr5 = this.c;
                iArr5.getClass();
                Object[] objArr7 = this.d;
                objArr7.getClass();
                Object[] objArr8 = this.e;
                objArr8.getClass();
                int i23 = this.h;
                int i24 = i23 + 1;
                int a = e4f.a(obj);
                int q = q();
                int i25 = a & q;
                Object obj7 = this.b;
                obj7.getClass();
                int b3 = b4f.b(i25, obj7);
                if (b3 != 0) {
                    int i26 = ~q;
                    int i27 = a & i26;
                    int i28 = 0;
                    while (true) {
                        int i29 = b3 - 1;
                        int i30 = iArr5[i29];
                        int i31 = i30 & i26;
                        int i32 = i28;
                        if (i31 == i27 && e6f.a(obj, objArr7[i29])) {
                            Object obj8 = objArr8[i29];
                            objArr8[i29] = obj2;
                            return obj8;
                        }
                        int i33 = i30 & q;
                        int i34 = i32 + 1;
                        if (i33 != 0) {
                            i28 = i34;
                            b3 = i33;
                        } else if (i34 >= 9) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(q() + 1, 1.0f);
                            if (!isEmpty()) {
                                i5 = 0;
                                while (i5 >= 0) {
                                    Object[] objArr9 = this.d;
                                    objArr9.getClass();
                                    Object obj9 = objArr9[i5];
                                    Object[] objArr10 = this.e;
                                    objArr10.getClass();
                                    linkedHashMap2.put(obj9, objArr10[i5]);
                                    i5++;
                                    if (i5 >= this.h) {
                                    }
                                }
                                this.b = linkedHashMap2;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f += 32;
                                return linkedHashMap2.put(obj, obj2);
                            }
                            i5 = -1;
                        } else if (i24 > q) {
                            q = u(q, (q + 1) * (q < 32 ? 4 : 2), a, i23);
                        } else {
                            iArr5[i29] = i31 | (i24 & q);
                        }
                    }
                } else if (i24 > q) {
                    q = u(q, (q + 1) * (q < 32 ? 4 : 2), a, i23);
                } else {
                    Object obj10 = this.b;
                    obj10.getClass();
                    b4f.d(i25, i24, obj10);
                }
                int[] iArr6 = this.c;
                iArr6.getClass();
                int length2 = iArr6.length;
                if (i24 > length2 && (min2 = Math.min(1073741823, (Math.max(1, length2 >>> 1) + length2) | 1)) != length2) {
                    int[] iArr7 = this.c;
                    iArr7.getClass();
                    this.c = Arrays.copyOf(iArr7, min2);
                    Object[] objArr11 = this.d;
                    objArr11.getClass();
                    this.d = Arrays.copyOf(objArr11, min2);
                    Object[] objArr12 = this.e;
                    objArr12.getClass();
                    this.e = Arrays.copyOf(objArr12, min2);
                }
                int i35 = a & (~q);
                int[] iArr8 = this.c;
                iArr8.getClass();
                iArr8[i23] = i35;
                Object[] objArr13 = this.d;
                objArr13.getClass();
                objArr13[i23] = obj;
                Object[] objArr14 = this.e;
                objArr14.getClass();
                objArr14[i23] = obj2;
                this.h = i24;
                this.f += 32;
                return null;
            default:
                if (!t()) {
                    i8 = -1;
                } else {
                    if (!t()) {
                        grb.i("Arrays already allocated");
                        return null;
                    }
                    int i36 = this.f;
                    int max5 = Math.max(i36 + 1, 2);
                    i8 = -1;
                    int highestOneBit3 = Integer.highestOneBit(max5);
                    int max6 = Math.max(4, (max5 <= ((int) ((double) highestOneBit3)) || (highestOneBit3 = highestOneBit3 << 1) > 0) ? highestOneBit3 : TLObject.FLAG_30);
                    this.b = f4f.c(max6);
                    this.f = (this.f & (-32)) | ((32 - Integer.numberOfLeadingZeros(max6 - 1)) & 31);
                    this.c = new int[i36];
                    this.d = new Object[i36];
                    this.e = new Object[i36];
                }
                Map n = n();
                if (n != null) {
                    return n.put(obj, obj2);
                }
                int[] iArr9 = this.c;
                iArr9.getClass();
                Object[] objArr15 = this.d;
                objArr15.getClass();
                Object[] objArr16 = this.e;
                objArr16.getClass();
                int i37 = this.h;
                int i38 = i37 + 1;
                int a2 = g4f.a(obj);
                int w2 = w();
                int i39 = a2 & w2;
                Object obj11 = this.b;
                obj11.getClass();
                int b4 = f4f.b(i39, obj11);
                if (b4 == 0) {
                    if (i38 > w2) {
                        w2 = y(w2, (w2 + 1) * (w2 < 32 ? 4 : 2), a2, i37);
                    } else {
                        Object obj12 = this.b;
                        obj12.getClass();
                        f4f.d(i39, i38, obj12);
                    }
                    i9 = 1;
                } else {
                    int i40 = ~w2;
                    i9 = 1;
                    int i41 = a2 & i40;
                    int i42 = 0;
                    while (true) {
                        int i43 = b4 - 1;
                        int i44 = iArr9[i43];
                        int i45 = i11;
                        int i46 = i44 & i40;
                        if (i46 == i41 && l8f.a(obj, objArr15[i43])) {
                            Object obj13 = objArr16[i43];
                            objArr16[i43] = obj2;
                            return obj13;
                        }
                        int i47 = i44 & w2;
                        int[] iArr10 = iArr9;
                        int i48 = i42 + 1;
                        if (i47 != 0) {
                            i42 = i48;
                            b4 = i47;
                            iArr9 = iArr10;
                            i11 = 32;
                            i9 = 1;
                        } else if (i48 >= 9) {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(w() + 1, 1.0f);
                            if (!isEmpty()) {
                                i10 = 0;
                                while (i10 >= 0) {
                                    Object[] objArr17 = this.d;
                                    objArr17.getClass();
                                    Object obj14 = objArr17[i10];
                                    Object[] objArr18 = this.e;
                                    objArr18.getClass();
                                    linkedHashMap3.put(obj14, objArr18[i10]);
                                    i10++;
                                    if (i10 >= this.h) {
                                    }
                                }
                                this.b = linkedHashMap3;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f += 32;
                                return linkedHashMap3.put(obj, obj2);
                            }
                            i10 = i8;
                        } else if (i38 > w2) {
                            w2 = y(w2, (w2 + 1) * (w2 < i45 ? 4 : 2), a2, i37);
                        } else {
                            iArr10[i43] = i46 | (i38 & w2);
                        }
                    }
                }
                int[] iArr11 = this.c;
                iArr11.getClass();
                int length3 = iArr11.length;
                if (i38 > length3) {
                    int i49 = i9;
                    int min3 = Math.min(1073741823, (Math.max(i49, length3 >>> 1) + length3) | i49);
                    if (min3 != length3) {
                        int[] iArr12 = this.c;
                        iArr12.getClass();
                        this.c = Arrays.copyOf(iArr12, min3);
                        Object[] objArr19 = this.d;
                        objArr19.getClass();
                        this.d = Arrays.copyOf(objArr19, min3);
                        Object[] objArr20 = this.e;
                        objArr20.getClass();
                        this.e = Arrays.copyOf(objArr20, min3);
                    }
                }
                int[] iArr13 = this.c;
                iArr13.getClass();
                iArr13[i37] = a2 & (~w2);
                Object[] objArr21 = this.d;
                objArr21.getClass();
                objArr21[i37] = obj;
                Object[] objArr22 = this.e;
                objArr22.getClass();
                objArr22[i37] = obj2;
                this.h = i38;
                this.f += 32;
                return null;
        }
    }

    public final int q() {
        return (1 << (this.f & 31)) - 1;
    }

    public final void r(int i, int i2) {
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        Object[] objArr = this.d;
        objArr.getClass();
        Object[] objArr2 = this.e;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int a = g4f.a(obj2) & i2;
        int b = f4f.b(a, obj);
        if (b == size) {
            f4f.d(a, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = b - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArr[i4] = (i5 & (~i2)) | ((i + 1) & i2);
                return;
            }
            b = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.remove(obj);
                }
                Object j = j(obj);
                if (j != w) {
                    return j;
                }
                return null;
            case 1:
                Map m = m();
                if (m != null) {
                    return m.remove(obj);
                }
                Object v = v(obj);
                if (v != x) {
                    return v;
                }
                return null;
            default:
                Map n = n();
                if (n != null) {
                    return n.remove(obj);
                }
                Object z = z(obj);
                if (z != y) {
                    return z;
                }
                return null;
        }
    }

    public final int s(Object obj) {
        if (p()) {
            return -1;
        }
        int a = e4f.a(obj);
        int q = q();
        Object obj2 = this.b;
        obj2.getClass();
        int b = b4f.b(a & q, obj2);
        if (b != 0) {
            int i = ~q;
            int i2 = a & i;
            do {
                int i3 = b - 1;
                int[] iArr = this.c;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.d;
                    objArr.getClass();
                    if (e6f.a(obj, objArr[i3])) {
                        return i3;
                    }
                }
                b = i4 & q;
            } while (b != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d == null) {
                    break;
                } else {
                    break;
                }
            case 1:
                Map m = m();
                if (m == null) {
                    break;
                } else {
                    break;
                }
            default:
                Map n = n();
                if (n == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.h;
    }

    public final boolean t() {
        return this.b == null;
    }

    public final int u(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object c = b4f.c(i2);
        if (i4 != 0) {
            b4f.d(i3 & i5, i4 + 1, c);
        }
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int b = b4f.b(i6, obj);
            while (b != 0) {
                int i7 = b - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int b2 = b4f.b(i10, c);
                b4f.d(i10, b, c);
                iArr[i7] = (i9 & (~i5)) | (b2 & i5);
                b = i8 & i;
            }
        }
        this.b = c;
        this.f = (this.f & (-32)) | ((32 - Integer.numberOfLeadingZeros(i5)) & 31);
        return i5;
    }

    public final Object v(Object obj) {
        if (!p()) {
            int q = q();
            Object obj2 = this.b;
            obj2.getClass();
            int[] iArr = this.c;
            iArr.getClass();
            Object[] objArr = this.d;
            objArr.getClass();
            int a = b4f.a(obj, null, q, obj2, iArr, objArr, null);
            if (a != -1) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                Object obj3 = objArr2[a];
                o(a, q);
                this.h--;
                this.f += 32;
                return obj3;
            }
        }
        return x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.s;
                if (q3Var != null) {
                    return q3Var;
                }
                q3 q3Var2 = new q3((Object) this, (byte) 2);
                this.s = q3Var2;
                return q3Var2;
            case 1:
                q3 q3Var3 = (q3) this.s;
                if (q3Var3 != null) {
                    return q3Var3;
                }
                q3 q3Var4 = new q3((Object) this, (byte) 4);
                this.s = q3Var4;
                return q3Var4;
            default:
                q3 q3Var5 = (q3) this.s;
                if (q3Var5 != null) {
                    return q3Var5;
                }
                q3 q3Var6 = new q3((Object) this, (byte) 5);
                this.s = q3Var6;
                return q3Var6;
        }
    }

    public final int w() {
        return (1 << (this.f & 31)) - 1;
    }

    public final int x(Object obj) {
        if (t()) {
            return -1;
        }
        int a = g4f.a(obj);
        int w2 = w();
        Object obj2 = this.b;
        obj2.getClass();
        int b = f4f.b(a & w2, obj2);
        if (b != 0) {
            int i = ~w2;
            int i2 = a & i;
            do {
                int i3 = b - 1;
                int[] iArr = this.c;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.d;
                    objArr.getClass();
                    if (l8f.a(obj, objArr[i3])) {
                        return i3;
                    }
                }
                b = i4 & w2;
            } while (b != 0);
        }
        return -1;
    }

    public final int y(int i, int i2, int i3, int i4) {
        Object c = f4f.c(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            f4f.d(i3 & i5, i4 + 1, c);
        }
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int b = f4f.b(i6, obj);
            while (b != 0) {
                int i7 = b - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int b2 = f4f.b(i10, c);
                f4f.d(i10, b, c);
                iArr[i7] = (i9 & (~i5)) | (b2 & i5);
                b = i8 & i;
            }
        }
        this.b = c;
        this.f = (this.f & (-32)) | ((32 - Integer.numberOfLeadingZeros(i5)) & 31);
        return i5;
    }

    public final Object z(Object obj) {
        if (!t()) {
            int w2 = w();
            Object obj2 = this.b;
            obj2.getClass();
            int[] iArr = this.c;
            iArr.getClass();
            Object[] objArr = this.d;
            objArr.getClass();
            int a = f4f.a(obj, null, w2, obj2, iArr, objArr, null);
            if (a != -1) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                Object obj3 = objArr2[a];
                r(a, w2);
                this.h--;
                this.f += 32;
                return obj3;
            }
        }
        return y;
    }

    public /* synthetic */ lp2() {
        this.a = (byte) 0;
    }
}
