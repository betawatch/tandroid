package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class zzje implements zzjt {
    public static final zzje zza = new zzje();

    private zzje() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 3) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            throw new zzdm(4, 5, null);
        }
        int intValue = num.intValue();
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != (zza4 instanceof Object)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzdm(4, 5, null);
        }
        try {
            Array.set(zza2, intValue, zza4);
        } catch (Exception e) {
            if (!(e instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzdm(4, 25, e);
            }
            throw new zzdm(4, 22, e);
        }
    }
}
