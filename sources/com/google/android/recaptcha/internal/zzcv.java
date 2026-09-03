package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import wc.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzcv extends c {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzcx zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzcx zzcxVar, uc.c cVar) {
        super(cVar);
        this.zzg = zzcxVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= TLObject.FLAG_31;
        return this.zzg.zzb(null, 0L, 0L, 0.0d, null, this);
    }
}
