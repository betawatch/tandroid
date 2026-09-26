package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class zzkj implements zzjt {
    public static final zzkj zza = new zzkj();

    private zzkj() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 3) {
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
            field.set(zzizVar.zzc().zza(zzztVarArr[1]), zzizVar.zzc().zza(zzztVarArr[2]));
        } catch (Exception e) {
            throw new zzdm(6, 11, e);
        }
    }
}
