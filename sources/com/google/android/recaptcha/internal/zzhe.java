package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
