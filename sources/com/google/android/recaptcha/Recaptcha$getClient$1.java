package com.google.android.recaptcha;

import ad.g;
import dd.a;
import ed.c;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, cd.c cVar) {
        super(cVar);
        this.zzb = recaptcha;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.getClient-BWLJW6A(null, null, 0L, this);
        return obj2 == a.a ? obj2 : new g(obj2);
    }
}
