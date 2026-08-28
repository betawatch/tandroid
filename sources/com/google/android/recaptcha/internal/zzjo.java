package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import oc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzjo implements zzjt {
    public static final zzjo zza = new zzjo();

    private zzjo() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i9, final zziz zzizVar, zzzt... zzztVarArr) {
        final int i10;
        int length = zzztVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        final String str = (String) zza2;
        if (str == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (zza3 == null) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str2 = (String) zza4;
        if (str2 == null) {
            throw new zzdm(4, 5, null);
        }
        String zza5 = zzizVar.zzh().zza(str2);
        Object zza6 = zzizVar.zzc().zza(zzztVarArr[3]);
        if (length == 5) {
            Object zza7 = zzizVar.zzc().zza(zzztVarArr[4]);
            if (true != (zza7 instanceof Integer)) {
                zza7 = null;
            }
            Integer num = (Integer) zza7;
            if (num == null) {
                throw new zzdm(4, 5, null);
            }
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        try {
            if (zza3 instanceof String) {
                zza3 = zzizVar.zzh().zza((String) zza3);
            }
            Class zza8 = zziy.zza(zza3);
            zzizVar.zzc().zze(i9, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zziu(new p() { // from class: com.google.android.recaptcha.internal.zzjn
                @Override // zc.p
                public final Object invoke(Object obj, Object obj2) {
                    zziz zzizVar2 = zziz.this;
                    Object[] objArr = (Object[]) obj;
                    zzizVar2.zzi().zzb(str, (String) obj2);
                    int i11 = i10;
                    if (i11 != -1) {
                        zzizVar2.zzc().zze(i11, objArr);
                    }
                    return i.a;
                }
            }, zza5, zza6)));
        } catch (Exception e10) {
            throw new zzdm(6, 20, e10);
        }
    }
}
