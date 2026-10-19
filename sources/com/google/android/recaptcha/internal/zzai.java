package com.google.android.recaptcha.internal;

import be.f0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
final class zzai extends i implements p {
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

    @Override // md.a
    public final c create(Object obj, c cVar) {
        zzai zzaiVar = new zzai(this.zzb, this.zzc, cVar);
        zzaiVar.zzd = obj;
        return zzaiVar;
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzai) create((zzhk) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        i8.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzah zzahVar = new zzah(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object f7 = f0.f(zzahVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
