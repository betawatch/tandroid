package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzje implements zzjt {
    public static final zzje zza = new zzje();

    private zzje() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 3) {
            fvc.c(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            fvc.c(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            fvc.c(4, 5, null);
            return;
        }
        int intValue = num.intValue();
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (zza4 == null) {
            zza4 = null;
        }
        if (zza4 == null) {
            fvc.c(4, 5, null);
            return;
        }
        try {
            Array.set(zza2, intValue, zza4);
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                fvc.c(4, 22, e);
            } else {
                fvc.c(4, 25, e);
            }
        }
    }
}
