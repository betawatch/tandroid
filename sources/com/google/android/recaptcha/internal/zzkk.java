package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzkk implements zzjt {
    public static final zzkk zza = new zzkk();

    private zzkk() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzdm(4, 5, null);
        }
        try {
            field.set(null, zzizVar.zzc().zza(zzztVarArr[1]));
        } catch (Exception e) {
            throw new zzdm(6, 11, e);
        }
    }
}
