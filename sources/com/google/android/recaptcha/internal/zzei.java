package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import sc.f;
import vc.a;
import wc.c;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzei extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzeq zzeqVar, uc.c cVar) {
        super(cVar);
        this.zzb = zzeqVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.execute-0E7RQCE(null, 0L, this);
        return obj2 == a.a ? obj2 : new f(obj2);
    }
}
