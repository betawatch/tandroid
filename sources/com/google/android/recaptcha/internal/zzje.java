package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzje implements zzjt {
    public static final zzje zza = new zzje();

    private zzje() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 3) {
            p3d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            p3d.d(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            p3d.d(4, 5, null);
            return;
        }
        int intValue = num.intValue();
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (zza4 == null) {
            zza4 = null;
        }
        if (zza4 == null) {
            p3d.d(4, 5, null);
            return;
        }
        try {
            Array.set(zza2, intValue, zza4);
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                p3d.d(4, 22, e);
            } else {
                p3d.d(4, 25, e);
            }
        }
    }
}
