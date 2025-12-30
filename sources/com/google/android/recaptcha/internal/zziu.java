package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zziu extends zzit {
    private final Function2 zza;
    private final String zzb;

    public zziu(Function2 function2, String str, Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection emptyList;
        if (!Intrinsics.areEqual(method.getName(), this.zzb)) {
            return false;
        }
        zzyu zzf = zzyx.zzf();
        if (objArr != null) {
            emptyList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzyv zzf2 = zzyw.zzf();
                zzf2.zzw(obj2.toString());
                emptyList.add((zzyw) zzf2.zzk());
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        zzf.zze(emptyList);
        zzyx zzyxVar = (zzyx) zzf.zzk();
        Function2 function2 = this.zza;
        byte[] zzd = zzyxVar.zzd();
        function2.invoke(objArr, zzpp.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
