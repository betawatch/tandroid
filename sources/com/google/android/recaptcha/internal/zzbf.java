package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.e0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        return ((zzbf) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        t7.b(obj);
        if (i10 == 0) {
            zzbe zzbeVar = new zzbe(this.zzb, null);
            this.zza = 1;
            if (e0.f(zzbeVar, this) == aVar) {
                return aVar;
            }
        }
        return i.a;
    }
}
