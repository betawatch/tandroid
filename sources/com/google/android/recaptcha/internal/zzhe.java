package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
