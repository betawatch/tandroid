package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzjo implements zzjt {
    public static final zzjo zza = new zzjo();

    private zzjo() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, final zziz zzizVar, zzzt... zzztVarArr) {
        final int i2;
        int length = zzztVarArr.length;
        if (length != 4 && length != 5) {
            i2d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        final String str = (String) zza2;
        if (str == null) {
            i2d.d(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (zza3 == null) {
            zza3 = null;
        }
        if (zza3 == null) {
            i2d.d(4, 5, null);
            return;
        }
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str2 = (String) zza4;
        if (str2 == null) {
            i2d.d(4, 5, null);
            return;
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
                i2d.d(4, 5, null);
                return;
            }
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        try {
            if (zza3 instanceof String) {
                zza3 = zzizVar.zzh().zza((String) zza3);
            }
            Class zza8 = zziy.zza(zza3);
            zzizVar.zzc().zze(i, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zziu(new fs4() { // from class: com.google.android.recaptcha.internal.zzjn
                @Override // fs4
                public final Object invoke(Object obj, Object obj2) {
                    zziz zzizVar2 = zziz.this;
                    Object[] objArr = (Object[]) obj;
                    zzizVar2.zzi().zzb(str, (String) obj2);
                    int i3 = i2;
                    if (i3 != -1) {
                        zzizVar2.zzc().zze(i3, objArr);
                    }
                    return g7c.a;
                }
            }, zza5, zza6)));
        } catch (Exception e) {
            i2d.d(6, 20, e);
        }
    }
}
