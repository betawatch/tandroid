package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzjp implements zzjt {
    public static final zzjp zza = new zzjp();

    private zzjp() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length != 4 && length != 5) {
            p3d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            p3d.d(4, 5, null);
            return;
        }
        int intValue = num.intValue();
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num2 = (Integer) zza3;
        if (num2 == null) {
            p3d.d(4, 5, null);
            return;
        }
        int intValue2 = num2.intValue();
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str = (String) zza4;
        if (str == null) {
            p3d.d(4, 5, null);
            return;
        }
        String zza5 = zzizVar.zzh().zza(str);
        Object zza6 = zzizVar.zzc().zza(zzztVarArr[3]);
        if (true != (zza6 instanceof String)) {
            zza6 = null;
        }
        String str2 = (String) zza6;
        if (str2 == null) {
            p3d.d(4, 5, null);
            return;
        }
        String zza7 = zzizVar.zzh().zza(str2);
        Object zza8 = length == 5 ? zzizVar.zzc().zza(zzztVarArr[4]) : null;
        zziv zzivVar = new zziv(intValue2);
        try {
            Class zza9 = zziy.zza(zza5);
            zzizVar.zzc().zze(intValue, Proxy.newProxyInstance(zza9.getClassLoader(), new Class[]{zza9}, new zziw(zzivVar, zza7, zza8)));
            zzizVar.zzc().zze(i, zzivVar);
        } catch (Exception e) {
            p3d.d(6, 20, e);
        }
    }
}
