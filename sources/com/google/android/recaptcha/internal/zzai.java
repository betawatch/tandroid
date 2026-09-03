package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import ld.e0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzai zzaiVar = new zzai(this.zzb, this.zzc, cVar);
        zzaiVar.zzd = obj;
        return zzaiVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzai) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzah zzahVar = new zzah(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object f10 = e0.f(zzahVar, this);
        return f10 == aVar ? aVar : f10;
    }
}
