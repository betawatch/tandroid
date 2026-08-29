package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.e0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzax zzaxVar = new zzax(this.zzb, cVar);
        zzaxVar.zzc = obj;
        return zzaxVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        c7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzaw zzawVar = new zzaw((zzhk) this.zzc, this.zzb, null);
        this.zza = 1;
        Object f9 = e0.f(zzawVar, this);
        return f9 == aVar ? aVar : f9;
    }
}
