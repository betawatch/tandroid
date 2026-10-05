package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
    public zzcv(zzcx zzcxVar, id.c cVar) {
        super(cVar);
        this.zzg = zzcxVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= TLObject.FLAG_31;
        return this.zzg.zzb(null, 0L, 0L, 0.0d, null, this);
    }
}
