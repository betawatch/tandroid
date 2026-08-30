package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import wc.c;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public zzea(zzeh zzehVar, uc.c cVar) {
        super(cVar);
        this.zzf = zzehVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= TLObject.FLAG_31;
        return this.zzf.zzc(null, 0L, null, null, this);
    }
}
