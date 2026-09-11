package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public zzea(zzeh zzehVar, id.c cVar) {
        super(cVar);
        this.zzf = zzehVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= TLObject.FLAG_31;
        return this.zzf.zzc(null, 0L, null, null, this);
    }
}
