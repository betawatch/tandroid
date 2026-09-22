package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
final class zzdh extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdj zzc;
    int zzd;
    zzmc[] zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdj zzdjVar, id.c cVar) {
        super(cVar);
        this.zzc = zzdjVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= TLObject.FLAG_31;
        return this.zzc.zzb(null, this);
    }
}
