package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzkb implements zzjt {
    public static final zzkb zza = new zzkb();

    private zzkb() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length < 2) {
            p3d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            p3d.d(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        Object[] zzg = zzizVar.zzc().zzg(ts.h(zzztVarArr).subList(2, length));
        try {
            zzizVar.zzc().zze(i, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            p3d.d(6, 15, e);
        }
    }
}
