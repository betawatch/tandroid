package com.google.android.recaptcha.internal;

import hd.f;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class zzkb implements zzjt {
    public static final zzkb zza = new zzkb();

    private zzkb() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length < 2) {
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
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        Object[] zzg = zzizVar.zzc().zzg(f.h(zzztVarArr).subList(2, length));
        try {
            zzizVar.zzc().zze(i10, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            throw new zzdm(6, 15, e);
        }
    }
}
