package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzke implements zzjt {
    public static final zzke zza = new zzke();

    private zzke() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        Object array;
        if (zzztVarArr.length != 2) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Object)) {
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
        if (zza2 instanceof Integer) {
            array = Integer.valueOf(((Number) zza2).intValue() * intValue);
        } else {
            if (!(zza2 instanceof int[])) {
                throw new zzdm(4, 5, null);
            }
            int[] iArr = (int[]) zza2;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(Integer.valueOf(i2 * intValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzizVar.zzc().zze(i, array);
    }
}
