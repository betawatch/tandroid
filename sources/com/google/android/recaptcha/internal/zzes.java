package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzes extends j implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzfp zzfpVar, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzes(this.zzb, this.zzc, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((zzgr) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzer zzerVar = new zzer(this.zzb, this.zzc, null);
        this.zza = 1;
        Object f7 = e0.f(zzerVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
