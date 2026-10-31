package com.google.android.recaptcha.internal;

import ed.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public zzcv(zzcx zzcxVar, cd.c cVar) {
        super(cVar);
        this.zzg = zzcxVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= TLObject.FLAG_31;
        return this.zzg.zzb(null, 0L, 0L, 0.0d, null, this);
    }
}
