package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zziu extends zzit {
    private final eq4 zza;
    private final String zzb;

    public zziu(eq4 eq4Var, String str, Object obj) {
        super(obj);
        this.zza = eq4Var;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!rp5.a(method.getName(), this.zzb)) {
            return false;
        }
        zzyu zzf = zzyx.zzf();
        if (objArr != null) {
            list = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzyv zzf2 = zzyw.zzf();
                zzf2.zzw(obj2.toString());
                list.add((zzyw) zzf2.zzk());
            }
        } else {
            list = c24.a;
        }
        zzf.zze(list);
        zzyx zzyxVar = (zzyx) zzf.zzk();
        eq4 eq4Var = this.zza;
        byte[] zzd = zzyxVar.zzd();
        eq4Var.invoke(objArr, zzpp.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
