package com.google.android.recaptcha.internal;

import a8.jd;
import ce.f0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzax extends i implements p {
    int zza;
    final /* synthetic */ zzba zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, c cVar) {
        super(2, cVar);
        this.zzb = zzbaVar;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzax zzaxVar = new zzax(this.zzb, cVar);
        zzaxVar.zzc = obj;
        return zzaxVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        jd.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzaw zzawVar = new zzaw((zzhk) this.zzc, this.zzb, null);
        this.zza = 1;
        Object f7 = f0.f(zzawVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
