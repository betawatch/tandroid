package com.google.android.recaptcha.internal;

import hd.f;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class zzkf implements zzjt {
    public static final zzkf zza = new zzkf();

    private zzkf() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length == 0) {
            throw new zzdm(4, 3, null);
        }
        Constructor<?> zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        Constructor<?> constructor = zza2 instanceof Constructor ? zza2 : zza2.getClass().getConstructor(null);
        Object[] zzg = zzizVar.zzc().zzg(f.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i10, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e7) {
            throw new zzdm(6, 14, e7);
        }
    }
}
