package com.google.android.recaptcha.internal;

import id.f;
import ld.a;
import md.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
final class zzej extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzeq zzeqVar, kd.c cVar) {
        super(cVar);
        this.zzb = zzeqVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.execute-gIAlu-s(null, this);
        return obj2 == a.a ? obj2 : new f(obj2);
    }
}
