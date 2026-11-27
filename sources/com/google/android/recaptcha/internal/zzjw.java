package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzjw implements zzjt {
    public static final zzjw zza = new zzjw();

    private zzjw() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length == 0) {
            p3d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Class)) {
            zza2 = null;
        }
        Class cls = (Class) zza2;
        if (cls == null) {
            p3d.d(4, 5, null);
            return;
        }
        Class[] zzf = zzizVar.zzc().zzf(ts.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e) {
            p3d.d(6, 9, e);
        }
    }
}
