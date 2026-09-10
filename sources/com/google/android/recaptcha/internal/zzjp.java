package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class zzjp implements zzjt {
    public static final zzjp zza = new zzjp();

    private zzjp() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzdm(4, 5, null);
        }
        int intValue = num.intValue();
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num2 = (Integer) zza3;
        if (num2 == null) {
            throw new zzdm(4, 5, null);
        }
        int intValue2 = num2.intValue();
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str = (String) zza4;
        if (str == null) {
            throw new zzdm(4, 5, null);
        }
        String zza5 = zzizVar.zzh().zza(str);
        Object zza6 = zzizVar.zzc().zza(zzztVarArr[3]);
        if (true != (zza6 instanceof String)) {
            zza6 = null;
        }
        String str2 = (String) zza6;
        if (str2 == null) {
            throw new zzdm(4, 5, null);
        }
        String zza7 = zzizVar.zzh().zza(str2);
        Object zza8 = length == 5 ? zzizVar.zzc().zza(zzztVarArr[4]) : null;
        zziv zzivVar = new zziv(intValue2);
        try {
            Class zza9 = zziy.zza(zza5);
            zzizVar.zzc().zze(intValue, Proxy.newProxyInstance(zza9.getClassLoader(), new Class[]{zza9}, new zziw(zzivVar, zza7, zza8)));
            zzizVar.zzc().zze(i10, zzivVar);
        } catch (Exception e) {
            throw new zzdm(6, 20, e);
        }
    }
}
