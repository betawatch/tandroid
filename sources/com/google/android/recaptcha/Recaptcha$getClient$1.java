package com.google.android.recaptcha;

import jd.f;
import md.a;
import nd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, ld.c cVar) {
        super(cVar);
        this.zzb = recaptcha;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.getClient-BWLJW6A(null, null, 0L, this);
        return obj2 == a.a ? obj2 : new f(obj2);
    }
}
