package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
final class zzdg extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdj zzc;
    int zzd;
    zzmc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdj zzdjVar, kd.c cVar) {
        super(cVar);
        this.zzc = zzdjVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= TLObject.FLAG_31;
        return this.zzc.zza(null, this);
    }
}
