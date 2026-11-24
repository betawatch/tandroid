package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zziu extends zzit {
    private final fs4 zza;
    private final String zzb;

    public zziu(fs4 fs4Var, String str, Object obj) {
        super(obj);
        this.zza = fs4Var;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!rr5.a(method.getName(), this.zzb)) {
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
            list = n34.a;
        }
        zzf.zze(list);
        zzyx zzyxVar = (zzyx) zzf.zzk();
        fs4 fs4Var = this.zza;
        byte[] zzd = zzyxVar.zzd();
        fs4Var.invoke(objArr, zzpp.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
