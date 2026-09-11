package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import v7.t5;
import v7.v5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a0 extends com.google.android.gms.internal.cast.l0 {
    public static final a0 n = new a0(null, new Object[0], 0);
    public final transient Object e;
    public final transient Object[] f;
    public final transient int h;

    public a0(Object obj, Object[] objArr, int i10) {
        super(1);
        this.e = obj;
        this.f = objArr;
        this.h = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b3  */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a0 b(int i10, Object[] objArr, a5.a aVar) {
        int i11;
        char c10;
        char c11;
        char c12;
        short[] sArr;
        boolean z10;
        int i12 = i10;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return n;
        }
        Object obj = null;
        int i13 = 1;
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new a0(null, objArr2, 1);
        }
        t5.b(i12, objArr2.length >> 1);
        int max = Math.max(i12, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1);
            do {
                i11 += i11;
            } while (i11 * 0.7d < max);
        } else {
            i11 = TLObject.FLAG_30;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i12 = 1;
            c10 = 0;
            c11 = 1;
        } else {
            int i14 = i11 - 1;
            if (i11 <= 128) {
                byte[] bArr = new byte[i11];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj2 = objArr2[i18];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArr2[i18 ^ i13];
                    Objects.requireNonNull(obj3);
                    int a2 = v5.a(obj2.hashCode());
                    while (true) {
                        int i19 = a2 & i14;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArr2[i17] = obj2;
                                objArr2[i17 ^ 1] = obj3;
                            }
                            i16++;
                        } else {
                            if (obj2.equals(objArr2[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj4 = objArr2[i21];
                                Objects.requireNonNull(obj4);
                                s sVar = new s(obj2, obj3, obj4);
                                objArr2[i21] = obj3;
                                obj = sVar;
                                break;
                            }
                            a2 = i19 + 1;
                        }
                    }
                    i15++;
                    i13 = 1;
                }
                c10 = 0;
                c11 = 1;
                if (i16 == i12) {
                    obj = bArr;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i16), obj};
                    obj = sArr;
                }
            } else {
                c10 = 0;
                c11 = 1;
                if (i11 > 32768) {
                    int[] iArr = new int[i11];
                    Arrays.fill(iArr, -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i22 + i22;
                        int i25 = i23 + i23;
                        Object obj5 = objArr2[i25];
                        Objects.requireNonNull(obj5);
                        Object obj6 = objArr2[i25 ^ 1];
                        Objects.requireNonNull(obj6);
                        int a10 = v5.a(obj5.hashCode());
                        while (true) {
                            int i26 = a10 & i14;
                            int i27 = iArr[i26];
                            if (i27 == -1) {
                                iArr[i26] = i24;
                                if (i22 < i23) {
                                    objArr2[i24] = obj5;
                                    objArr2[i24 ^ 1] = obj6;
                                }
                                i22++;
                            } else {
                                if (obj5.equals(objArr2[i27])) {
                                    int i28 = i27 ^ 1;
                                    Object obj7 = objArr2[i28];
                                    Objects.requireNonNull(obj7);
                                    s sVar2 = new s(obj5, obj6, obj7);
                                    objArr2[i28] = obj6;
                                    obj = sVar2;
                                    break;
                                }
                                a10 = i26 + 1;
                            }
                        }
                    }
                    c12 = 2;
                    obj = i22 == i12 ? iArr : new Object[]{iArr, Integer.valueOf(i22), obj};
                    z10 = obj instanceof Object[];
                    Object obj8 = obj;
                    if (z10) {
                        Object[] objArr3 = (Object[]) obj;
                        s sVar3 = (s) objArr3[c12];
                        if (aVar == null) {
                            throw sVar3.a();
                        }
                        aVar.d = sVar3;
                        Object obj9 = objArr3[c10];
                        int intValue = ((Integer) objArr3[c11]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj8 = obj9;
                        i12 = intValue;
                    }
                    return new a0(obj8, objArr2, i12);
                }
                sArr = new short[i11];
                Arrays.fill(sArr, (short) -1);
                int i29 = 0;
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = i29 + i29;
                    int i32 = i30 + i30;
                    Object obj10 = objArr2[i32];
                    Objects.requireNonNull(obj10);
                    Object obj11 = objArr2[i32 ^ 1];
                    Objects.requireNonNull(obj11);
                    int a11 = v5.a(obj10.hashCode());
                    while (true) {
                        int i33 = a11 & i14;
                        char c13 = (char) sArr[i33];
                        if (c13 == 65535) {
                            sArr[i33] = (short) i31;
                            if (i29 < i30) {
                                objArr2[i31] = obj10;
                                objArr2[i31 ^ 1] = obj11;
                            }
                            i29++;
                        } else {
                            if (obj10.equals(objArr2[c13])) {
                                int i34 = c13 ^ 1;
                                Object obj12 = objArr2[i34];
                                Objects.requireNonNull(obj12);
                                s sVar4 = new s(obj10, obj11, obj12);
                                objArr2[i34] = obj11;
                                obj = sVar4;
                                break;
                            }
                            a11 = i33 + 1;
                        }
                    }
                }
                if (i29 != i12) {
                    obj = new Object[]{sArr, Integer.valueOf(i29), obj};
                }
                obj = sArr;
            }
        }
        c12 = 2;
        z10 = obj instanceof Object[];
        Object obj82 = obj;
        if (z10) {
        }
        return new a0(obj82, objArr2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.cast.l0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i10 = this.h;
            Object[] objArr = this.f;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.e;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int a2 = v5.a(obj.hashCode());
                        while (true) {
                            int i11 = a2 & length;
                            int i12 = bArr[i11] & 255;
                            if (i12 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            a2 = i11 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a10 = v5.a(obj.hashCode());
                        while (true) {
                            int i13 = a10 & length2;
                            char c10 = (char) sArr[i13];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            a10 = i13 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a11 = v5.a(obj.hashCode());
                        while (true) {
                            int i14 = a11 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                                break;
                            }
                            a11 = i14 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }
}
