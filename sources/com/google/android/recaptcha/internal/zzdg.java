package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import uc.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzdg extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdj zzc;
    int zzd;
    zzmc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdj zzdjVar, sc.c cVar) {
        super(cVar);
        this.zzc = zzdjVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= TLObject.FLAG_31;
        return this.zzc.zza(null, this);
    }
}
