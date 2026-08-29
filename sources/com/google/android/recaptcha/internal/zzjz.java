package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class zzjz implements zzjt {
    public static final zzjz zza = new zzjz();

    private zzjz() {
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
            zzizVar.zzc().zze(i10, field.get(zzizVar.zzc().zza(zzztVarArr[1])));
        } catch (Exception e10) {
            throw new zzdm(6, 16, e10);
        }
    }
}
