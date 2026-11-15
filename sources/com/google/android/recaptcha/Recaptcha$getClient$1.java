package com.google.android.recaptcha;

import gd.g;
import jd.a;
import kd.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, id.c cVar) {
        super(cVar);
        this.zzb = recaptcha;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.getClient-BWLJW6A(null, null, 0L, this);
        return obj2 == a.a ? obj2 : new g(obj2);
    }
}
