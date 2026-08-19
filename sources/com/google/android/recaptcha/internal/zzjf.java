package com.google.android.recaptcha.internal;

import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzjf implements zzjt {
    public static final zzjf zza = new zzjf();

    private zzjf() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 3) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzdm(4, 5, null);
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            throw new zzdm(4, 6, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(zza3)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(zza4)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzdm(4, 5, null);
        }
        if (Intrinsics.areEqual(zza3, zza4)) {
            zzizVar.zzg(zzizVar.zza() + intValue);
        }
    }
}
