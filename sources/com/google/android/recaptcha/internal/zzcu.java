package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;
import wc.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzcu extends c {
    long zza;
    double zzb;
    Object zzc;
    int zzd;
    int zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzcx zzg;
    int zzh;
    p zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcx zzcxVar, uc.c cVar) {
        super(cVar);
        this.zzg = zzcxVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= TLObject.FLAG_31;
        return this.zzg.zza(0, 0L, 0L, 0.0d, null, this);
    }
}
