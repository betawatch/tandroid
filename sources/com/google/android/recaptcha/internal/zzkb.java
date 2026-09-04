package com.google.android.recaptcha.internal;

import hd.f;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        } catch (Exception e7) {
            throw new zzdm(6, 15, e7);
        }
    }
}
