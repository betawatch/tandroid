package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
final class zzhe extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzhf zzb;
    int zzc;
    zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhe(zzhf zzhfVar, kd.c cVar) {
        super(cVar);
        this.zzb = zzhfVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        return this.zzb.zza(null, this);
    }
}
