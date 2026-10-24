package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
    public zzcv(zzcx zzcxVar, kd.c cVar) {
        super(cVar);
        this.zzg = zzcxVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= TLObject.FLAG_31;
        return this.zzg.zzb(null, 0L, 0L, 0.0d, null, this);
    }
}
