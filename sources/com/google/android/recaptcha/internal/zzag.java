package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import id.f0;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzag extends i implements p {
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

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzag zzagVar = new zzag(this.zzb, this.zzc, cVar);
        zzagVar.zzd = obj;
        return zzagVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzag) create((zzhk) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        int i10 = this.zza;
        k6.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object f10 = f0.f(zzafVar, this);
        return f10 == aVar ? aVar : f10;
    }
}
