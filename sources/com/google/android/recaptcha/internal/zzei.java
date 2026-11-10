package com.google.android.recaptcha.internal;

import gd.g;
import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzei extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzeq zzeqVar, id.c cVar) {
        super(cVar);
        this.zzb = zzeqVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.execute-0E7RQCE(null, 0L, this);
        return obj2 == jd.a.a ? obj2 : new g(obj2);
    }
}
