package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

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
        List emptyList;
        if (!Intrinsics.areEqual(method.getName(), this.zzb)) {
            return false;
        }
        zziv zzivVar = this.zza;
        if (objArr == null || (emptyList = ArraysKt.asList(objArr)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        zzivVar.zzb(emptyList);
        return true;
    }
}
