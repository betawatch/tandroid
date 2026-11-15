package com.google.android.recaptcha.internal;

import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
final class zzbc extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbo zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbo zzboVar, id.c cVar) {
        super(cVar);
        this.zzb = zzboVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzl = this.zzb.zzl(this);
        return zzl;
    }
}
