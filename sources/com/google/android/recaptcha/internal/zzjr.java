package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzjr implements zzjt {
    public static final zzjr zza = new zzjr();

    private zzjr() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        Object array;
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
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            p3d.d(4, 5, null);
            return;
        }
        int intValue = num.intValue();
        try {
            if (zza2 instanceof Integer) {
                array = Integer.valueOf(((Number) zza2).intValue() / intValue);
            } else {
                if (!(zza2 instanceof int[])) {
                    throw new zzdm(4, 5, null);
                }
                int[] iArr = (int[]) zza2;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    arrayList.add(Integer.valueOf(i2 / intValue));
                }
                array = arrayList.toArray(new Integer[0]);
            }
            zzizVar.zzc().zze(i, array);
        } catch (ArithmeticException e) {
            p3d.d(4, 6, e);
        }
    }
}
