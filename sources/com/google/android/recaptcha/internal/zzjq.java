package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzjq implements zzjt {
    public static final zzjq zza = new zzjq();

    private zzjq() {
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
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            i2d.d(4, 5, null);
            return;
        }
        int intValue = num.intValue();
        try {
            if (zza2 instanceof String) {
                zza2 = zzizVar.zzh().zza((String) zza2);
            }
            zzizVar.zzc().zze(i, Array.newInstance((Class<?>) zziy.zza(zza2), intValue));
        } catch (Exception e) {
            i2d.d(6, 21, e);
        }
    }
}
