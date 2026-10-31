package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzai extends j implements p {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzaj zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzxn zzxnVar, zzaj zzajVar, c cVar) {
        super(2, cVar);
        this.zzb = zzxnVar;
        this.zzc = zzajVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzai zzaiVar = new zzai(this.zzb, this.zzc, cVar);
        zzaiVar.zzd = obj;
        return zzaiVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzai) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzah zzahVar = new zzah(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object f7 = e0.f(zzahVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
