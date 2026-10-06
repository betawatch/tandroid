package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import id.h;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.e0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
final class zzez extends j implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzez zzezVar = new zzez(this.zzb, cVar);
        zzezVar.zzc = obj;
        return zzezVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzez) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        t7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzhk zzhkVar = (zzhk) this.zzc;
        zzfp zzfpVar = this.zzb;
        h c10 = zzfp.zzf(zzfpVar).zza().c();
        zzey zzeyVar = new zzey(zzfpVar, zzhkVar, null);
        this.zza = 1;
        Object w10 = e0.w(c10, zzeyVar, this);
        return w10 == aVar ? aVar : w10;
    }
}
