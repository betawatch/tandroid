package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zziu extends zzit {
    private final is4 zza;
    private final String zzb;

    public zziu(is4 is4Var, String str, Object obj) {
        super(obj);
        this.zza = is4Var;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!ur5.a(method.getName(), this.zzb)) {
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
            list = x24.a;
        }
        zzf.zze(list);
        zzyx zzyxVar = (zzyx) zzf.zzk();
        is4 is4Var = this.zza;
        byte[] zzd = zzyxVar.zzd();
        is4Var.invoke(objArr, zzpp.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
