package com.google.android.gms.internal.play_billing;

import f7.v5;
import f7.x5;
import j$.util.Objects;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 extends com.google.android.gms.internal.cast.j0 {
    public static final a0 n = new a0(null, new Object[0], 0);
    public final transient Object e;
    public final transient Object[] f;
    public final transient int h;

    public a0(Object obj, Object[] objArr, int i9) {
        super(1);
        this.e = obj;
        this.f = objArr;
        this.h = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b3  */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a0 b(int i9, Object[] objArr, a6.a aVar) {
        int i10;
        char c10;
        char c11;
        char c12;
        short[] sArr;
        boolean z10;
        int i11 = i9;
        Object[] objArr2 = objArr;
        if (i11 == 0) {
            return n;
        }
        Object obj = null;
        int i12 = 1;
        if (i11 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new a0(null, objArr2, 1);
        }
        v5.b(i11, objArr2.length >> 1);
        int max = Math.max(i11, 2);
        if (max < 751619276) {
            i10 = Integer.highestOneBit(max - 1);
            do {
                i10 += i10;
            } while (i10 * 0.7d < max);
        } else {
            i10 = TLObject.FLAG_30;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i11 = 1;
            c10 = 0;
            c11 = 1;
        } else {
            int i13 = i10 - 1;
            if (i10 <= 128) {
                byte[] bArr = new byte[i10];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj2 = objArr2[i17];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArr2[i17 ^ i12];
                    Objects.requireNonNull(obj3);
                    int a2 = x5.a(obj2.hashCode());
                    while (true) {
                        int i18 = a2 & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArr2[i16] = obj2;
                                objArr2[i16 ^ 1] = obj3;
                            }
                            i15++;
                        } else {
                            if (obj2.equals(objArr2[i19])) {
                                int i20 = i19 ^ 1;
                                Object obj4 = objArr2[i20];
                                Objects.requireNonNull(obj4);
                                s sVar = new s(obj2, obj3, obj4);
                                objArr2[i20] = obj3;
                                obj = sVar;
                                break;
                            }
                            a2 = i18 + 1;
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                c10 = 0;
                c11 = 1;
                if (i15 == i11) {
                    obj = bArr;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i15), obj};
                    obj = sArr;
                }
            } else {
                c10 = 0;
                c11 = 1;
                if (i10 > 32768) {
                    int[] iArr = new int[i10];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj5 = objArr2[i24];
                        Objects.requireNonNull(obj5);
                        Object obj6 = objArr2[i24 ^ 1];
                        Objects.requireNonNull(obj6);
                        int a3 = x5.a(obj5.hashCode());
                        while (true) {
                            int i25 = a3 & i13;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i23;
                                if (i21 < i22) {
                                    objArr2[i23] = obj5;
                                    objArr2[i23 ^ 1] = obj6;
                                }
                                i21++;
                            } else {
                                if (obj5.equals(objArr2[i26])) {
                                    int i27 = i26 ^ 1;
                                    Object obj7 = objArr2[i27];
                                    Objects.requireNonNull(obj7);
                                    s sVar2 = new s(obj5, obj6, obj7);
                                    objArr2[i27] = obj6;
                                    obj = sVar2;
                                    break;
                                }
                                a3 = i25 + 1;
                            }
                        }
                    }
                    c12 = 2;
                    obj = i21 == i11 ? iArr : new Object[]{iArr, Integer.valueOf(i21), obj};
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
                        i11 = intValue;
                    }
                    return new a0(obj8, objArr2, i11);
                }
                sArr = new short[i10];
                Arrays.fill(sArr, (short) -1);
                int i28 = 0;
                for (int i29 = 0; i29 < i11; i29++) {
                    int i30 = i28 + i28;
                    int i31 = i29 + i29;
                    Object obj10 = objArr2[i31];
                    Objects.requireNonNull(obj10);
                    Object obj11 = objArr2[i31 ^ 1];
                    Objects.requireNonNull(obj11);
                    int a10 = x5.a(obj10.hashCode());
                    while (true) {
                        int i32 = a10 & i13;
                        char c13 = (char) sArr[i32];
                        if (c13 == 65535) {
                            sArr[i32] = (short) i30;
                            if (i28 < i29) {
                                objArr2[i30] = obj10;
                                objArr2[i30 ^ 1] = obj11;
                            }
                            i28++;
                        } else {
                            if (obj10.equals(objArr2[c13])) {
                                int i33 = c13 ^ 1;
                                Object obj12 = objArr2[i33];
                                Objects.requireNonNull(obj12);
                                s sVar4 = new s(obj10, obj11, obj12);
                                objArr2[i33] = obj11;
                                obj = sVar4;
                                break;
                            }
                            a10 = i32 + 1;
                        }
                    }
                }
                if (i28 != i11) {
                    obj = new Object[]{sArr, Integer.valueOf(i28), obj};
                }
                obj = sArr;
            }
        }
        c12 = 2;
        z10 = obj instanceof Object[];
        Object obj82 = obj;
        if (z10) {
        }
        return new a0(obj82, objArr2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.cast.j0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i9 = this.h;
            Object[] objArr = this.f;
            if (i9 == 1) {
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
                        int a2 = x5.a(obj.hashCode());
                        while (true) {
                            int i10 = a2 & length;
                            int i11 = bArr[i10] & 255;
                            if (i11 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            a2 = i10 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a3 = x5.a(obj.hashCode());
                        while (true) {
                            int i12 = a3 & length2;
                            char c10 = (char) sArr[i12];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            a3 = i12 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a10 = x5.a(obj.hashCode());
                        while (true) {
                            int i13 = a10 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                                break;
                            }
                            a10 = i13 + 1;
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
