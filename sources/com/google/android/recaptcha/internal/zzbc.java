package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import tc.c;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzbc extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbo zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbo zzboVar, rc.c cVar) {
        super(cVar);
        this.zzb = zzboVar;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzl = this.zzb.zzl(this);
        return zzl;
    }
}
