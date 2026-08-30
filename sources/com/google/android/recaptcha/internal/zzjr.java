package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzjr implements zzjt {
    public static final zzjr zza = new zzjr();

    private zzjr() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        Object array;
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
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            throw new zzdm(4, 5, null);
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
                for (int i11 : iArr) {
                    arrayList.add(Integer.valueOf(i11 / intValue));
                }
                array = arrayList.toArray(new Integer[0]);
            }
            zzizVar.zzc().zze(i10, array);
        } catch (ArithmeticException e) {
            throw new zzdm(4, 6, e);
        }
    }
}
