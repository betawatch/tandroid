package com.google.android.recaptcha.internal;

import be.f0;
import kd.c;
import kd.h;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
final class zzez extends i implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        zzez zzezVar = new zzez(this.zzb, cVar);
        zzezVar.zzc = obj;
        return zzezVar;
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzez) create((zzhk) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        i8.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzhk zzhkVar = (zzhk) this.zzc;
        zzfp zzfpVar = this.zzb;
        h c10 = zzfp.zzf(zzfpVar).zza().c();
        zzey zzeyVar = new zzey(zzfpVar, zzhkVar, null);
        this.zza = 1;
        Object w9 = f0.w(c10, zzeyVar, this);
        return w9 == aVar ? aVar : w9;
    }
}
