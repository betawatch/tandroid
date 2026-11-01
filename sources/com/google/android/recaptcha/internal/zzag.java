package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
final class zzag extends j implements p {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzaj zzajVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzajVar;
        this.zzc = str;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzag zzagVar = new zzag(this.zzb, this.zzc, cVar);
        zzagVar.zzd = obj;
        return zzagVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzag) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object f7 = e0.f(zzafVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
