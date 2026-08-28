package com.google.android.recaptcha.internal;

import g7.y5;
import hd.f0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzai zzaiVar = new zzai(this.zzb, this.zzc, cVar);
        zzaiVar.zzd = obj;
        return zzaiVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzai) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        y5.b(obj);
        if (i9 != 0) {
            return obj;
        }
        zzah zzahVar = new zzah(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object f10 = f0.f(zzahVar, this);
        return f10 == aVar ? aVar : f10;
    }
}
