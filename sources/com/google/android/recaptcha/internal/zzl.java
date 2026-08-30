package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import ld.e0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzl extends i implements p {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(zzq zzqVar, String str, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzl zzlVar = new zzl(this.zzb, this.zzc, this.zzd, cVar);
        zzlVar.zze = obj;
        return zzlVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzl) create((zzgr) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzk zzkVar = new zzk(this.zzb, this.zzc, (zzgr) this.zze, this.zzd, null);
        this.zza = 1;
        Object f10 = e0.f(zzkVar, this);
        return f10 == aVar ? aVar : f10;
    }
}
