package com.google.android.recaptcha.internal;

import ed.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
final class zzbg extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbo zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbg(zzbo zzboVar, cd.c cVar) {
        super(cVar);
        this.zzb = zzboVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        Object zzm;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzm = this.zzb.zzm(null, this);
        return zzm;
    }
}
