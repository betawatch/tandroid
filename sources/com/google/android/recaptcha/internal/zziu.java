package com.google.android.recaptcha.internal;

import dd.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import tc.o;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zziu extends zzit {
    private final p zza;
    private final String zzb;

    public zziu(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!j.a(method.getName(), this.zzb)) {
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
            list = o.a;
        }
        zzf.zze(list);
        zzyx zzyxVar = (zzyx) zzf.zzk();
        p pVar = this.zza;
        byte[] zzd = zzyxVar.zzd();
        pVar.invoke(objArr, zzpp.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
