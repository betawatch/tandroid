package com.google.android.recaptcha.internal;

import ed.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzbc extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbo zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbo zzboVar, cd.c cVar) {
        super(cVar);
        this.zzb = zzboVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzl = this.zzb.zzl(this);
        return zzl;
    }
}
