package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import id.h;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        return ((zzez) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 != 0) {
            return obj;
        }
        zzhk zzhkVar = (zzhk) this.zzc;
        zzfp zzfpVar = this.zzb;
        h c10 = zzfp.zzf(zzfpVar).zza().c();
        zzey zzeyVar = new zzey(zzfpVar, zzhkVar, null);
        this.zza = 1;
        Object y10 = b0.y(c10, zzeyVar, this);
        return y10 == aVar ? aVar : y10;
    }
}
