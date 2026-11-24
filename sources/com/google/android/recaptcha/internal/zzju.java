package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzju implements zzjt {
    public static final zzju zza = new zzju();

    private zzju() {
    }

    private static final List zzc(Object obj) {
        boolean z = obj instanceof byte[];
        n34 n34Var = n34.a;
        int i = 0;
        if (z) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                return n34Var;
            }
            if (length == 1) {
                return lm2.a(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                return n34Var;
            }
            if (length3 == 1) {
                return lm2.a(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i < length4) {
                arrayList2.add(Short.valueOf(sArr[i]));
                i++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length5 = iArr.length;
            if (length5 == 0) {
                return n34Var;
            }
            if (length5 == 1) {
                return lm2.a(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            int length6 = iArr.length;
            while (i < length6) {
                i = td4.g(iArr[i], i, 1, arrayList3);
            }
            return arrayList3;
        }
        if (obj instanceof long[]) {
            return tt.g((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length7 = fArr.length;
            if (length7 == 0) {
                return n34Var;
            }
            if (length7 == 1) {
                return lm2.a(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList4 = new ArrayList(fArr.length);
            int length8 = fArr.length;
            while (i < length8) {
                arrayList4.add(Float.valueOf(fArr[i]));
                i++;
            }
            return arrayList4;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        int length9 = dArr.length;
        if (length9 == 0) {
            return n34Var;
        }
        if (length9 == 1) {
            return lm2.a(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList5 = new ArrayList(dArr.length);
        int length10 = dArr.length;
        while (i < length10) {
            arrayList5.add(Double.valueOf(dArr[i]));
            i++;
        }
        return arrayList5;
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            i2d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            i2d.d(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (zza3 == null) {
            zza3 = null;
        }
        if (zza3 != null) {
            zzizVar.zzc().zze(i, zzb(zza2, zza3));
        } else {
            i2d.d(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                List list = zzc2;
                ArrayList arrayList = new ArrayList(mm2.c(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null) {
            if (obj2 instanceof Number) {
                List list2 = zzc;
                ArrayList arrayList2 = new ArrayList(mm2.c(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
                }
                return arrayList2.toArray(new Double[0]);
            }
            if (zzc2 != null) {
                zzjs.zza(this, zzc.size(), zzc2.size());
                int size = zzc.size();
                Double[] dArr = new Double[size];
                for (int i = 0; i < size; i++) {
                    dArr[i] = Double.valueOf(Math.pow(((Number) zzc.get(i)).doubleValue(), ((Number) zzc2.get(i)).doubleValue()));
                }
                return dArr;
            }
        }
        i2d.d(4, 5, null);
        return null;
    }
}
