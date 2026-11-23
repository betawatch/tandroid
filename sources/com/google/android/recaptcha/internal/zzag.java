package com.google.android.recaptcha.internal;

import c8.z;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzag zzagVar = new zzag(this.zzb, this.zzc, cVar);
        zzagVar.zzd = obj;
        return zzagVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzag) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        z.b(obj);
        if (i7 != 0) {
            return obj;
        }
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object e10 = b0.e(zzafVar, this);
        return e10 == aVar ? aVar : e10;
    }
}
