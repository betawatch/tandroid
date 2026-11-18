package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
final class zzdg extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdj zzc;
    int zzd;
    zzmc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdj zzdjVar, id.c cVar) {
        super(cVar);
        this.zzc = zzdjVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= TLObject.FLAG_31;
        return this.zzc.zza(null, this);
    }
}
