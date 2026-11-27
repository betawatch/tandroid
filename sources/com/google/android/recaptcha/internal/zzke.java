package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzke implements zzjt {
    public static final zzke zza = new zzke();

    private zzke() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        Object array;
        if (zzztVarArr.length != 2) {
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
        if (zza2 instanceof Integer) {
            array = Integer.valueOf(((Number) zza2).intValue() * intValue);
        } else {
            if (!(zza2 instanceof int[])) {
                p3d.d(4, 5, null);
                return;
            }
            int[] iArr = (int[]) zza2;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(Integer.valueOf(i2 * intValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzizVar.zzc().zze(i, array);
    }
}
