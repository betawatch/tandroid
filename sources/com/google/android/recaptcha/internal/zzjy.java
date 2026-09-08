package com.google.android.recaptcha.internal;

import hd.f;
import java.util.Arrays;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzjy implements zzjt {
    public static final zzjy zza = new zzjy();

    private zzjy() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length < 2) {
            throw new zzdm(4, 3, null);
        }
        Class<?> zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzdm(4, 5, null);
        }
        String zza4 = zzizVar.zzh().zza(str);
        if (i.a(zza4, "forName")) {
            throw new zzdm(6, 48, null);
        }
        Class[] zzf = zzizVar.zzc().zzf(f.h(zzztVarArr).subList(2, length));
        try {
            zzizVar.zzc().zze(i10, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e7) {
            throw new zzdm(6, 13, e7);
        }
    }
}
