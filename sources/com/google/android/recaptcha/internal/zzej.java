package com.google.android.recaptcha.internal;

import gd.g;
import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzej extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzeq zzeqVar, id.c cVar) {
        super(cVar);
        this.zzb = zzeqVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.execute-gIAlu-s(null, this);
        return obj2 == jd.a.a ? obj2 : new g(obj2);
    }
}
