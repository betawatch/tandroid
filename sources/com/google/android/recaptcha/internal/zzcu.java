package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.o;
import org.telegram.tgnet.TLObject;
import sc.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    o zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcx zzcxVar, qc.c cVar) {
        super(cVar);
        this.zzg = zzcxVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= TLObject.FLAG_31;
        return this.zzg.zza(0, 0L, 0L, 0.0d, null, this);
    }
}
