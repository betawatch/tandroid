package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
final class zzdi extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdj zzc;
    int zzd;
    zzmc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdj zzdjVar, id.c cVar) {
        super(cVar);
        this.zzc = zzdjVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= TLObject.FLAG_31;
        return this.zzc.zzc(null, this);
    }
}
