package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgc extends zzft {
    static final zzft zza = new zzgc(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgc(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0198  */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzgc zzh(int i, Object[] objArr, zzfs zzfsVar) {
        char c;
        char c2;
        short[] sArr;
        byte[] bArr;
        boolean z;
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i2 == 0) {
            return (zzgc) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zzfh.zza(obj2, obj3);
            return new zzgc(null, objArr2, 1);
        }
        zzez.zzb(i2, objArr2.length >> 1, "index");
        int zzh = zzfu.zzh(i2);
        if (i2 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zzfh.zza(obj4, obj5);
            i2 = 1;
            c = 0;
        } else {
            int i4 = zzh - 1;
            if (zzh <= 128) {
                byte[] bArr2 = new byte[zzh];
                Arrays.fill(bArr2, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    int i7 = i5 + i5;
                    int i8 = i6 + i6;
                    Object obj6 = objArr2[i8];
                    obj6.getClass();
                    Object obj7 = objArr2[i8 ^ 1];
                    obj7.getClass();
                    zzfh.zza(obj6, obj7);
                    int zza2 = zzfj.zza(obj6.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr2[i9] & 255;
                        if (i10 == 255) {
                            bArr2[i9] = (byte) i7;
                            if (i5 < i6) {
                                objArr2[i7] = obj6;
                                objArr2[i7 ^ 1] = obj7;
                            }
                            i5++;
                        } else {
                            if (obj6.equals(objArr2[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArr2[i11];
                                obj8.getClass();
                                zzfr zzfrVar = new zzfr(obj6, obj7, obj8);
                                objArr2[i11] = obj7;
                                obj = zzfrVar;
                                break;
                            }
                            zza2 = i9 + 1;
                        }
                    }
                }
                c = 0;
                bArr = bArr2;
                if (i5 != i2) {
                    sArr = new Object[]{bArr2, Integer.valueOf(i5), obj};
                    obj = sArr;
                }
                obj = bArr;
            } else {
                c = 0;
                if (zzh > 32768) {
                    int[] iArr = new int[zzh];
                    Arrays.fill(iArr, -1);
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < i2) {
                        int i14 = i13 + i13;
                        int i15 = i12 + i12;
                        Object obj9 = objArr2[i15];
                        obj9.getClass();
                        Object obj10 = objArr2[i15 ^ i3];
                        obj10.getClass();
                        zzfh.zza(obj9, obj10);
                        int zza3 = zzfj.zza(obj9.hashCode());
                        while (true) {
                            int i16 = zza3 & i4;
                            int i17 = iArr[i16];
                            if (i17 == -1) {
                                iArr[i16] = i14;
                                if (i13 < i12) {
                                    objArr2[i14] = obj9;
                                    objArr2[i14 ^ 1] = obj10;
                                }
                                i13++;
                            } else {
                                if (obj9.equals(objArr2[i17])) {
                                    int i18 = i17 ^ 1;
                                    Object obj11 = objArr2[i18];
                                    obj11.getClass();
                                    zzfr zzfrVar2 = new zzfr(obj9, obj10, obj11);
                                    objArr2[i18] = obj10;
                                    obj = zzfrVar2;
                                    break;
                                }
                                zza3 = i16 + 1;
                            }
                        }
                        i12++;
                        i3 = 1;
                    }
                    c2 = 1;
                    obj = i13 == i2 ? iArr : new Object[]{iArr, Integer.valueOf(i13), obj};
                    z = obj instanceof Object[];
                    Object obj12 = obj;
                    if (z) {
                        Object[] objArr3 = (Object[]) obj;
                        zzfsVar.zzc = (zzfr) objArr3[2];
                        Object obj13 = objArr3[c];
                        int intValue = ((Integer) objArr3[c2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj12 = obj13;
                        i2 = intValue;
                    }
                    return new zzgc(obj12, objArr2, i2);
                }
                sArr = new short[zzh];
                Arrays.fill(sArr, (short) -1);
                int i19 = 0;
                for (int i20 = 0; i20 < i2; i20++) {
                    int i21 = i19 + i19;
                    int i22 = i20 + i20;
                    Object obj14 = objArr2[i22];
                    obj14.getClass();
                    Object obj15 = objArr2[i22 ^ 1];
                    obj15.getClass();
                    zzfh.zza(obj14, obj15);
                    int zza4 = zzfj.zza(obj14.hashCode());
                    while (true) {
                        int i23 = zza4 & i4;
                        char c3 = (char) sArr[i23];
                        if (c3 == 65535) {
                            sArr[i23] = (short) i21;
                            if (i19 < i20) {
                                objArr2[i21] = obj14;
                                objArr2[i21 ^ 1] = obj15;
                            }
                            i19++;
                        } else {
                            if (obj14.equals(objArr2[c3])) {
                                int i24 = c3 ^ 1;
                                Object obj16 = objArr2[i24];
                                obj16.getClass();
                                zzfr zzfrVar3 = new zzfr(obj14, obj15, obj16);
                                objArr2[i24] = obj15;
                                obj = zzfrVar3;
                                break;
                            }
                            zza4 = i23 + 1;
                        }
                    }
                }
                if (i19 != i2) {
                    bArr = new Object[]{sArr, Integer.valueOf(i19), obj};
                    obj = bArr;
                }
                obj = sArr;
            }
        }
        c2 = 1;
        z = obj instanceof Object[];
        Object obj122 = obj;
        if (z) {
        }
        return new zzgc(obj122, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.cast.zzft, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzfj.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzfj.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzfj.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
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
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.cast.zzft
    final zzfm zza() {
        return new zzgb(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzft
    final zzfu zze() {
        return new zzfz(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzft
    final zzfu zzf() {
        return new zzga(this, new zzgb(this.zzb, 0, this.zzd));
    }
}
