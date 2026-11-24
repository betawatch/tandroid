package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzjx implements zzjt {
    public static final zzjx zza = new zzjx();

    private zzjx() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            i2d.d(4, 3, null);
            return;
        }
        Class<?> zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            i2d.d(4, 5, null);
            return;
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            i2d.d(4, 5, null);
            return;
        }
        try {
            zzizVar.zzc().zze(i, cls.getField(zzizVar.zzh().zza(str)));
        } catch (Exception e) {
            i2d.d(6, 10, e);
        }
    }
}
