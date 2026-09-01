package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import wc.c;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
final class zzfr extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgb zzb;
    int zzc;
    zzcs zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(zzgb zzgbVar, uc.c cVar) {
        super(cVar);
        this.zzb = zzgbVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        Object zzp;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzp = this.zzb.zzp(null, this);
        return zzp;
    }
}
