package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import tc.f;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class zzkc implements zzjt {
    public static final zzkc zza = new zzkc();

    private zzkc() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
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
        Object[] zzg = zzizVar.zzc().zzg(f.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i10, method.invoke(null, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e6) {
            throw new zzdm(6, 15, e6);
        }
    }
}
