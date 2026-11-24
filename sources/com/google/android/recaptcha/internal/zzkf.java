package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzkf implements zzjt {
    public static final zzkf zza = new zzkf();

    private zzkf() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length == 0) {
            i2d.d(4, 3, null);
            return;
        }
        Constructor<?> zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            i2d.d(4, 5, null);
            return;
        }
        Constructor<?> constructor = zza2 instanceof Constructor ? zza2 : zza2.getClass().getConstructor(null);
        Object[] zzg = zzizVar.zzc().zzg(tt.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            i2d.d(6, 14, e);
        }
    }
}
