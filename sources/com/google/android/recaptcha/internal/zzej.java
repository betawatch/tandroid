package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;
import qc.f;
import uc.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzej extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzeq zzeqVar, sc.c cVar) {
        super(cVar);
        this.zzb = zzeqVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.execute-gIAlu-s(null, this);
        return obj2 == tc.a.a ? obj2 : new f(obj2);
    }
}
