package com.google.android.recaptcha.internal;

import hd.e;
import java.util.Arrays;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzjy implements zzjt {
    public static final zzjy zza = new zzjy();

    private zzjy() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
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
        if (j.a(zza4, "forName")) {
            throw new zzdm(6, 48, null);
        }
        Class[] zzf = zzizVar.zzc().zzf(e.h(zzztVarArr).subList(2, length));
        try {
            zzizVar.zzc().zze(i7, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e10) {
            throw new zzdm(6, 13, e10);
        }
    }
}
