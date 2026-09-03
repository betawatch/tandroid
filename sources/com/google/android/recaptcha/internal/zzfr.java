package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import wc.c;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
