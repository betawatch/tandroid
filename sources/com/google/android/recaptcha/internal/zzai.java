package com.google.android.recaptcha.internal;

import a8.jd;
import ce.f0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzai zzaiVar = new zzai(this.zzb, this.zzc, cVar);
        zzaiVar.zzd = obj;
        return zzaiVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzai) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        jd.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzah zzahVar = new zzah(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object f7 = f0.f(zzahVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
