package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzjz implements zzjt {
    public static final zzjz zza = new zzjz();

    private zzjz() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
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
            zzizVar.zzc().zze(i7, field.get(zzizVar.zzc().zza(zzztVarArr[1])));
        } catch (Exception e10) {
            throw new zzdm(6, 16, e10);
        }
    }
}
