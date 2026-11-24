package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        if (!rr5.a(method.getName(), this.zzb)) {
            return false;
        }
        zziv zzivVar = this.zza;
        if (objArr != null) {
            list = Arrays.asList(objArr);
            list.getClass();
        } else {
            list = n34.a;
        }
        zzivVar.zzb(list);
        return true;
    }
}
