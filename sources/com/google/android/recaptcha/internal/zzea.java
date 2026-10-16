package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public zzea(zzeh zzehVar, kd.c cVar) {
        super(cVar);
        this.zzf = zzehVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= TLObject.FLAG_31;
        return this.zzf.zzc(null, 0L, null, null, this);
    }
}
