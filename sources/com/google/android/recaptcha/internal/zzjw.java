package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.collections.ArraysKt;

/* loaded from: classes.dex */
public final class zzjw implements zzjt {
    public static final zzjw zza = new zzjw();

    private zzjw() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length == 0) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Class)) {
            zza2 = null;
        }
        Class cls = (Class) zza2;
        if (cls == null) {
            throw new zzdm(4, 5, null);
        }
        Class[] zzf = zzizVar.zzc().zzf(ArraysKt.toList(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e) {
            throw new zzdm(6, 9, e);
        }
    }
}
