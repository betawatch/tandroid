package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzkc implements zzjt {
    public static final zzkc zza = new zzkc();

    private zzkc() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length == 0) {
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
        Object[] zzg = zzizVar.zzc().zzg(ts.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i, method.invoke(null, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            p3d.d(6, 15, e);
        }
    }
}
