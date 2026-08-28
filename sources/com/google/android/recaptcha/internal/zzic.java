package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import sc.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzic extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzif zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzic(zzif zzifVar, qc.c cVar) {
        super(cVar);
        this.zzb = zzifVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        return zzif.zzc(this.zzb, null, null, this);
    }
}
