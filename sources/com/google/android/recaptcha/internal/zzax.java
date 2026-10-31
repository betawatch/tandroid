package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzax extends j implements p {
    int zza;
    final /* synthetic */ zzba zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, c cVar) {
        super(2, cVar);
        this.zzb = zzbaVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzax zzaxVar = new zzax(this.zzb, cVar);
        zzaxVar.zzc = obj;
        return zzaxVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzaw zzawVar = new zzaw((zzhk) this.zzc, this.zzb, null);
        this.zza = 1;
        Object f7 = e0.f(zzawVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
