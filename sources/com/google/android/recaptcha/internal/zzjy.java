package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzjy implements zzjt {
    public static final zzjy zza = new zzjy();

    private zzjy() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length < 2) {
            fvc.c(4, 3, null);
            return;
        }
        Class<?> zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            fvc.c(4, 5, null);
            return;
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            fvc.c(4, 5, null);
            return;
        }
        String zza4 = zzizVar.zzh().zza(str);
        if (rp5.a(zza4, "forName")) {
            fvc.c(6, 48, null);
            return;
        }
        Class[] zzf = zzizVar.zzc().zzf(ss.h(zzztVarArr).subList(2, length));
        try {
            zzizVar.zzc().zze(i, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e) {
            fvc.c(6, 13, e);
        }
    }
}
