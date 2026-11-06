package com.google.android.recaptcha.internal;

import c8.d0;
import hd.e;
import hd.h;
import hd.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class zzju implements zzjt {
    public static final zzju zza = new zzju();

    private zzju() {
    }

    private static final List zzc(Object obj) {
        boolean z9 = obj instanceof byte[];
        n nVar = n.a;
        int i7 = 0;
        if (z9) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                return nVar;
            }
            if (length == 1) {
                return d0.a(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i7 < length2) {
                arrayList.add(Byte.valueOf(bArr[i7]));
                i7++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                return nVar;
            }
            if (length3 == 1) {
                return d0.a(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i7 < length4) {
                arrayList2.add(Short.valueOf(sArr[i7]));
                i7++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length5 = iArr.length;
            if (length5 == 0) {
                return nVar;
            }
            if (length5 == 1) {
                return d0.a(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            int length6 = iArr.length;
            while (i7 < length6) {
                i7 = a.f(iArr[i7], i7, 1, arrayList3);
            }
            return arrayList3;
        }
        if (obj instanceof long[]) {
            return e.g((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length7 = fArr.length;
            if (length7 == 0) {
                return nVar;
            }
            if (length7 == 1) {
                return d0.a(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList4 = new ArrayList(fArr.length);
            int length8 = fArr.length;
            while (i7 < length8) {
                arrayList4.add(Float.valueOf(fArr[i7]));
                i7++;
            }
            return arrayList4;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        int length9 = dArr.length;
        if (length9 == 0) {
            return nVar;
        }
        if (length9 == 1) {
            return d0.a(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList5 = new ArrayList(dArr.length);
        int length10 = dArr.length;
        while (i7 < length10) {
            arrayList5.add(Double.valueOf(dArr[i7]));
            i7++;
        }
        return arrayList5;
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
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
        zzizVar.zzc().zze(i7, zzb(zza2, zza3));
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
                ArrayList arrayList = new ArrayList(h.d(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            List list2 = zzc;
            ArrayList arrayList2 = new ArrayList(h.d(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzdm(4, 5, null);
        }
        zzjs.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = Double.valueOf(Math.pow(((Number) zzc.get(i7)).doubleValue(), ((Number) zzc2.get(i7)).doubleValue()));
        }
        return dArr;
    }
}
