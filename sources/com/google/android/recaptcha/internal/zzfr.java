package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
final class zzfr extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgb zzb;
    int zzc;
    zzcs zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(zzgb zzgbVar, kd.c cVar) {
        super(cVar);
        this.zzb = zzgbVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        Object zzp;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzp = this.zzb.zzp(null, this);
        return zzp;
    }
}
