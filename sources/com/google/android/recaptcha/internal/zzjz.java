package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzjz implements zzjt {
    public static final zzjz zza = new zzjz();

    private zzjz() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            fvc.c(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            fvc.c(4, 5, null);
            return;
        }
        try {
            zzizVar.zzc().zze(i, field.get(zzizVar.zzc().zza(zzztVarArr[1])));
        } catch (Exception e) {
            fvc.c(6, 16, e);
        }
    }
}
