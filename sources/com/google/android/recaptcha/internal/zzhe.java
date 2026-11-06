package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzhe extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzhf zzb;
    int zzc;
    zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhe(zzhf zzhfVar, id.c cVar) {
        super(cVar);
        this.zzb = zzhfVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        return this.zzb.zza(null, this);
    }
}
