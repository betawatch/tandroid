package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import sc.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzdh extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdj zzc;
    int zzd;
    zzmc[] zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdj zzdjVar, qc.c cVar) {
        super(cVar);
        this.zzc = zzdjVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= TLObject.FLAG_31;
        return this.zzc.zzb(null, this);
    }
}
