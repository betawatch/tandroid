package com.google.android.recaptcha.internal;

import hd.e;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class zzkf implements zzjt {
    public static final zzkf zza = new zzkf();

    private zzkf() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
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
        Object[] zzg = zzizVar.zzc().zzg(e.h(zzztVarArr).subList(1, length));
        try {
            zzizVar.zzc().zze(i7, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e10) {
            throw new zzdm(6, 14, e10);
        }
    }
}
