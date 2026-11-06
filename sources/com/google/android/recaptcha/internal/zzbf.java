package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzbf extends j implements p {
    int zza;
    final /* synthetic */ zzbo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbf(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zzb = zzboVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzbf(this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbf) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 == 0) {
            zzbe zzbeVar = new zzbe(this.zzb, null);
            this.zza = 1;
            if (b0.e(zzbeVar, this) == aVar) {
                return aVar;
            }
        }
        return k.a;
    }
}
