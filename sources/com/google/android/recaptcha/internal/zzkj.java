package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzkj implements zzjt {
    public static final zzkj zza = new zzkj();

    private zzkj() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 3) {
            p3d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            p3d.d(4, 5, null);
            return;
        }
        try {
            field.set(zzizVar.zzc().zza(zzztVarArr[1]), zzizVar.zzc().zza(zzztVarArr[2]));
        } catch (Exception e) {
            p3d.d(6, 11, e);
        }
    }
}
