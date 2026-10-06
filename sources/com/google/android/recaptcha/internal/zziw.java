package com.google.android.recaptcha.internal;

import hd.o;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        if (!i.a(method.getName(), this.zzb)) {
            return false;
        }
        zziv zzivVar = this.zza;
        if (objArr != null) {
            list = Arrays.asList(objArr);
            i.d(list, "asList(...)");
        } else {
            list = o.a;
        }
        zzivVar.zzb(list);
        return true;
    }
}
