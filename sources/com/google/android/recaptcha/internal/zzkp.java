package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzkp implements zzjt {
    public static final zzkp zza = new zzkp();

    private zzkp() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            p3d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            p3d.d(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (zza3 == null) {
            zza3 = null;
        }
        if (zza3 != null) {
            zzizVar.zzc().zze(i, zzb(zza2, zza3));
        } else {
            p3d.d(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) {
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() ^ ((Number) obj2).longValue());
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(kk1.a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i] ^ ((Number) obj2).byteValue())));
                    i++;
                }
                return sl2.h(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i < length2) {
                    i = qd4.g(charArray[i] ^ ((Number) obj2).intValue(), i, 1, arrayList2);
                }
                return sl2.j(arrayList2);
            }
        }
        if (z && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList4.add(Short.valueOf((short) (s ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length;
            ArrayList arrayList5 = new ArrayList(length3);
            int i2 = 0;
            while (i2 < length3) {
                i2 = qd4.g(iArr[i2] ^ ((Number) obj).intValue(), i2, 1, arrayList5);
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z4 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            int length4 = jArr.length;
            ArrayList arrayList6 = new ArrayList(length4);
            int i3 = 0;
            while (i3 < length4) {
                i3 = dze.c(i3, 1, jArr[i3] ^ ((Number) obj).longValue(), arrayList6);
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z5 = obj instanceof byte[];
        if (z5 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b2 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z6 = obj instanceof short[];
        if (z6 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s2 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s2 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z7 = obj instanceof int[];
        if (z7 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length5 = iArr2.length;
            ArrayList arrayList9 = new ArrayList(length5);
            int i4 = 0;
            while (i4 < length5) {
                i4 = qd4.g(iArr2[i4] ^ ((Number) obj2).intValue(), i4, 1, arrayList9);
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z8 = obj instanceof long[];
        if (z8 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            int length6 = jArr2.length;
            ArrayList arrayList10 = new ArrayList(length6);
            int i5 = 0;
            while (i5 < length6) {
                i5 = dze.c(i5, 1, jArr2[i5] ^ ((Number) obj2).longValue(), arrayList10);
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z5 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length7 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzjs.zza(this, length7, bArr4.length);
            ir5 a = bxe.a(0, length7);
            ArrayList arrayList11 = new ArrayList(ul2.c(a, 10));
            Iterator it = a.iterator();
            while (true) {
                hr5 hr5Var = (hr5) it;
                if (!hr5Var.c) {
                    return arrayList11.toArray(new Byte[0]);
                }
                int nextInt = hr5Var.nextInt();
                arrayList11.add(Byte.valueOf((byte) (bArr3[nextInt] ^ bArr4[nextInt])));
            }
        } else if (z6 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length8 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzjs.zza(this, length8, sArr4.length);
            ir5 a2 = bxe.a(0, length8);
            ArrayList arrayList12 = new ArrayList(ul2.c(a2, 10));
            Iterator it2 = a2.iterator();
            while (true) {
                hr5 hr5Var2 = (hr5) it2;
                if (!hr5Var2.c) {
                    return arrayList12.toArray(new Short[0]);
                }
                int nextInt2 = hr5Var2.nextInt();
                arrayList12.add(Short.valueOf((short) (sArr3[nextInt2] ^ sArr4[nextInt2])));
            }
        } else if (z7 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length9 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzjs.zza(this, length9, iArr4.length);
            ir5 a3 = bxe.a(0, length9);
            ArrayList arrayList13 = new ArrayList(ul2.c(a3, 10));
            Iterator it3 = a3.iterator();
            while (true) {
                hr5 hr5Var3 = (hr5) it3;
                if (!hr5Var3.c) {
                    return arrayList13.toArray(new Integer[0]);
                }
                int nextInt3 = hr5Var3.nextInt();
                arrayList13.add(Integer.valueOf(iArr3[nextInt3] ^ iArr4[nextInt3]));
            }
        } else {
            if (!z8 || !(obj2 instanceof long[])) {
                p3d.d(4, 5, null);
                return null;
            }
            long[] jArr3 = (long[]) obj;
            int length10 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzjs.zza(this, length10, jArr4.length);
            ir5 a4 = bxe.a(0, length10);
            ArrayList arrayList14 = new ArrayList(ul2.c(a4, 10));
            Iterator it4 = a4.iterator();
            while (true) {
                hr5 hr5Var4 = (hr5) it4;
                if (!hr5Var4.c) {
                    return arrayList14.toArray(new Long[0]);
                }
                int nextInt4 = hr5Var4.nextInt();
                arrayList14.add(Long.valueOf(jArr3[nextInt4] ^ jArr4[nextInt4]));
            }
        }
    }
}
