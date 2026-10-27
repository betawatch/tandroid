package com.google.android.recaptcha.internal;

import a8.jd;
import ce.c0;
import ce.s;
import ce.t;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzfs extends i implements p {
    int zza;
    final /* synthetic */ zzgb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgb zzgbVar, c cVar) {
        super(2, cVar);
        this.zzb = zzgbVar;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzfs(this.zzb, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        a aVar = a.a;
        int i10 = this.zza;
        jd.b(obj);
        if (i10 == 0) {
            sVar = this.zzb.zzb;
            this.zza = 1;
            if (((t) sVar).h(this) == aVar) {
                return aVar;
            }
        }
        return jd.i.a;
    }
}
