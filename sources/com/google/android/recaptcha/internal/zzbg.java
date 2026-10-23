package com.google.android.recaptcha.internal;

import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
final class zzbg extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbo zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbg(zzbo zzboVar, kd.c cVar) {
        super(cVar);
        this.zzb = zzboVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        Object zzm;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzm = this.zzb.zzm(null, this);
        return zzm;
    }
}
