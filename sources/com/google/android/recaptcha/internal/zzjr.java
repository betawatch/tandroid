package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzjr implements zzjt {
    public static final zzjr zza = new zzjr();

    private zzjr() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
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
                for (int i10 : iArr) {
                    arrayList.add(Integer.valueOf(i10 / intValue));
                }
                array = arrayList.toArray(new Integer[0]);
            }
            zzizVar.zzc().zze(i7, array);
        } catch (ArithmeticException e10) {
            throw new zzdm(4, 6, e10);
        }
    }
}
