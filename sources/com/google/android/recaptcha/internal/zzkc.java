package com.google.android.recaptcha.internal;

import hd.e;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class zzkc implements zzjt {
    public static final zzkc zza = new zzkc();

    private zzkc() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length == 0) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            throw new zzdm(4, 5, null);
        }
        Object[] zzg = zzizVar.zzc().zzg(e.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i7, method.invoke(null, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e10) {
            throw new zzdm(6, 15, e10);
        }
    }
}
