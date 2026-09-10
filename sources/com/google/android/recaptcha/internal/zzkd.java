package com.google.android.recaptcha.internal;

import hd.g;
import hd.i;
import java.util.ArrayList;
import java.util.Iterator;
import ud.b;
import ud.e;
import w7.t7;
import xd.a;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class zzkd implements zzjt {
    public static final zzkd zza = new zzkd();

    private zzkd() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                return new String(g.j(arrayList), a.a);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                return g.l(arrayList2);
            }
        }
        if (z10 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j3 : jArr) {
                arrayList6.add(Long.valueOf(j3 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z14 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f7 : fArr) {
                arrayList7.add(Float.valueOf(f7 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z15 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d : dArr) {
                arrayList8.add(Double.valueOf(d % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z16 = obj instanceof byte[];
        if (z16 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof short[];
        if (z17 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z18 = obj instanceof int[];
        if (z18 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i10 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i10] % ((Number) obj2).intValue()));
                i10++;
            }
            return g.l(arrayList11);
        }
        boolean z19 = obj instanceof long[];
        if (z19 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList12.add(Long.valueOf(j10 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z20 = obj instanceof float[];
        if (z20 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f10 : fArr2) {
                arrayList13.add(Float.valueOf(f10 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z21 = obj instanceof double[];
        if (z21 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d10 : dArr2) {
                arrayList14.add(Double.valueOf(d10 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z16 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzjs.zza(this, length4, bArr4.length);
            e a2 = t7.a(0, length4);
            ArrayList arrayList15 = new ArrayList(i.d(a2));
            Iterator it = a2.iterator();
            while (true) {
                b bVar = (b) it;
                if (!bVar.d) {
                    return arrayList15.toArray(new Integer[0]);
                }
                int nextInt = bVar.nextInt();
                arrayList15.add(Integer.valueOf(bArr3[nextInt] % bArr4[nextInt]));
            }
        } else if (z17 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzjs.zza(this, length5, sArr4.length);
            e a10 = t7.a(0, length5);
            ArrayList arrayList16 = new ArrayList(i.d(a10));
            Iterator it2 = a10.iterator();
            while (true) {
                b bVar2 = (b) it2;
                if (!bVar2.d) {
                    return arrayList16.toArray(new Integer[0]);
                }
                int nextInt2 = bVar2.nextInt();
                arrayList16.add(Integer.valueOf(sArr3[nextInt2] % sArr4[nextInt2]));
            }
        } else if (z18 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzjs.zza(this, length6, iArr4.length);
            e a11 = t7.a(0, length6);
            ArrayList arrayList17 = new ArrayList(i.d(a11));
            Iterator it3 = a11.iterator();
            while (true) {
                b bVar3 = (b) it3;
                if (!bVar3.d) {
                    return arrayList17.toArray(new Integer[0]);
                }
                int nextInt3 = bVar3.nextInt();
                arrayList17.add(Integer.valueOf(iArr3[nextInt3] % iArr4[nextInt3]));
            }
        } else if (z19 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzjs.zza(this, length7, jArr4.length);
            e a12 = t7.a(0, length7);
            ArrayList arrayList18 = new ArrayList(i.d(a12));
            Iterator it4 = a12.iterator();
            while (true) {
                b bVar4 = (b) it4;
                if (!bVar4.d) {
                    return arrayList18.toArray(new Long[0]);
                }
                int nextInt4 = bVar4.nextInt();
                arrayList18.add(Long.valueOf(jArr3[nextInt4] % jArr4[nextInt4]));
            }
        } else if (z20 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzjs.zza(this, length8, fArr4.length);
            e a13 = t7.a(0, length8);
            ArrayList arrayList19 = new ArrayList(i.d(a13));
            Iterator it5 = a13.iterator();
            while (true) {
                b bVar5 = (b) it5;
                if (!bVar5.d) {
                    return arrayList19.toArray(new Float[0]);
                }
                int nextInt5 = bVar5.nextInt();
                arrayList19.add(Float.valueOf(fArr3[nextInt5] % fArr4[nextInt5]));
            }
        } else {
            if (!z21 || !(obj2 instanceof double[])) {
                throw new zzdm(4, 5, null);
            }
            double[] dArr3 = (double[]) obj;
            int length9 = dArr3.length;
            double[] dArr4 = (double[]) obj2;
            zzjs.zza(this, length9, dArr4.length);
            e a14 = t7.a(0, length9);
            ArrayList arrayList20 = new ArrayList(i.d(a14));
            Iterator it6 = a14.iterator();
            while (true) {
                b bVar6 = (b) it6;
                if (!bVar6.d) {
                    return arrayList20.toArray(new Double[0]);
                }
                int nextInt6 = bVar6.nextInt();
                arrayList20.add(Double.valueOf(dArr3[nextInt6] % dArr4[nextInt6]));
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (zza3 == null) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzdm(4, 5, null);
        }
        try {
            zzizVar.zzc().zze(i10, zzb(zza2, zza3));
        } catch (ArithmeticException e) {
            throw new zzdm(4, 6, e);
        }
    }
}
