package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zziw extends zzit {
    private final zziv zza;
    private final String zzb;

    public zziw(zziv zzivVar, String str, Object obj) {
        super(obj);
        this.zza = zzivVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!ur5.a(method.getName(), this.zzb)) {
            return false;
        }
        zziv zzivVar = this.zza;
        if (objArr != null) {
            list = Arrays.asList(objArr);
            list.getClass();
        } else {
            list = x24.a;
        }
        zzivVar.zzb(list);
        return true;
    }
}
