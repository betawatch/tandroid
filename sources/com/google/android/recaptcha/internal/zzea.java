package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
final class zzea extends c {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzeh zzf;
    int zzg;
    zzdq zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzeh zzehVar, id.c cVar) {
        super(cVar);
        this.zzf = zzehVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= TLObject.FLAG_31;
        return this.zzf.zzc(null, 0L, null, null, this);
    }
}
