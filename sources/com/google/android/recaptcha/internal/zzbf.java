package com.google.android.recaptcha.internal;

import g7.y5;
import hd.f0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzbf extends i implements p {
    int zza;
    final /* synthetic */ zzbo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbf(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zzb = zzboVar;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzbf(this.zzb, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbf) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        y5.b(obj);
        if (i9 == 0) {
            zzbe zzbeVar = new zzbe(this.zzb, null);
            this.zza = 1;
            if (f0.f(zzbeVar, this) == aVar) {
                return aVar;
            }
        }
        return oc.i.a;
    }
}
