package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzo extends j implements p {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzq zzqVar, long j10, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = zzqVar;
        this.zzc = j10;
        this.zzd = zzxnVar;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzo zzoVar = new zzo(this.zzb, this.zzc, this.zzd, cVar);
        zzoVar.zze = obj;
        return zzoVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzo) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        ib.b(obj);
        if (i3 == 0) {
            zzn zznVar = new zzn(this.zzb, (zzgr) this.zze, this.zzc, this.zzd, null);
            this.zza = 1;
            if (b0.e(zznVar, this) == aVar) {
                return aVar;
            }
        }
        return k.a;
    }
}
