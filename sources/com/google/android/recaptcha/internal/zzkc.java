package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzkc implements zzjt {
    public static final zzkc zza = new zzkc();

    private zzkc() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length == 0) {
            i2d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            i2d.d(4, 5, null);
            return;
        }
        Object[] zzg = zzizVar.zzc().zzg(tt.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i, method.invoke(null, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            i2d.d(6, 15, e);
        }
    }
}
