package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzkb implements zzjt {
    public static final zzkb zza = new zzkb();

    private zzkb() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length < 2) {
            fvc.c(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            fvc.c(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        Object[] zzg = zzizVar.zzc().zzg(ss.h(zzztVarArr).subList(2, length));
        try {
            zzizVar.zzc().zze(i, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            fvc.c(6, 15, e);
        }
    }
}
