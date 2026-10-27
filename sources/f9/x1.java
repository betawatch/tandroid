package f9;

import a8.ng;
import a8.yb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x1 extends l0 {
    public static final x1 h = new x1(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public x1(Object obj, Object[] objArr, int i10) {
        this.d = obj;
        this.e = objArr;
        this.f = i10;
    }

    public static x1 f(int i10, Object[] objArr, ng ngVar) {
        if (i10 == 0) {
            return h;
        }
        if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new x1(null, objArr, 1);
        }
        yb.m(i10, objArr.length >> 1);
        Object g7 = g(objArr, i10, t0.s(i10), 0);
        if (g7 instanceof Object[]) {
            Object[] objArr2 = (Object[]) g7;
            k0 k0Var = (k0) objArr2[2];
            if (ngVar == null) {
                throw k0Var.a();
            }
            ngVar.d = k0Var;
            Object obj = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            g7 = obj;
            i10 = intValue;
        }
        return new x1(g7, objArr, i10);
    }

    public static Object g(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        k0 k0Var = null;
        int i14 = 1;
        if (i10 == 1) {
            Objects.requireNonNull(objArr[i12]);
            Objects.requireNonNull(objArr[i12 ^ 1]);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj = objArr[i18];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj2);
                int t10 = o.t(obj.hashCode());
                while (true) {
                    int i20 = t10 & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj;
                            objArr[i19 ^ 1] = obj2;
                        }
                        i16++;
                    } else {
                        if (obj.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj3 = objArr[i22];
                            Objects.requireNonNull(obj3);
                            k0Var = new k0(obj, obj2, obj3);
                            objArr[i22] = obj2;
                            break;
                        }
                        t10 = i20 + 1;
                    }
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), k0Var};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj4 = objArr[i25];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj5);
                int t11 = o.t(obj4.hashCode());
                while (true) {
                    int i27 = t11 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj4;
                            objArr[i26 ^ 1] = obj5;
                        }
                        i23++;
                    } else {
                        if (obj4.equals(objArr[i28])) {
                            int i29 = i28 ^ 1;
                            Object obj6 = objArr[i29];
                            Objects.requireNonNull(obj6);
                            k0Var = new k0(obj4, obj5, obj6);
                            objArr[i29] = obj5;
                            break;
                        }
                        t11 = i27 + 1;
                    }
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), k0Var};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj7 = objArr[i32];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj8);
            int t12 = o.t(obj7.hashCode());
            while (true) {
                int i34 = t12 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj7;
                        objArr[i33 ^ 1] = obj8;
                    }
                    i31++;
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (obj7.equals(objArr[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj9 = objArr[i36];
                        Objects.requireNonNull(obj9);
                        k0Var = new k0(obj7, obj8, obj9);
                        objArr[i36] = obj8;
                        break;
                    }
                    t12 = i34 + 1;
                    i14 = i13;
                }
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Integer valueOf = Integer.valueOf(i31);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = valueOf;
        objArr2[2] = k0Var;
        return objArr2;
    }

    public static Object h(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int t10 = o.t(obj2.hashCode());
            while (true) {
                int i12 = t10 & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                t10 = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int t11 = o.t(obj2.hashCode());
            while (true) {
                int i14 = t11 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                t11 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int t12 = o.t(obj2.hashCode());
            while (true) {
                int i16 = t12 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                t12 = i16 + 1;
            }
        }
    }

    @Override // f9.l0
    public final u1 b() {
        return new u1(this, this.e, 0, this.f);
    }

    @Override // f9.l0
    public final v1 c() {
        return new v1(this, new w1(0, this.f, this.e));
    }

    @Override // f9.l0
    public final d0 d() {
        return new w1(1, this.f, this.e);
    }

    @Override // f9.l0, java.util.Map
    public final Object get(Object obj) {
        Object h10 = h(this.d, this.e, this.f, 0, obj);
        if (h10 == null) {
            return null;
        }
        return h10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
