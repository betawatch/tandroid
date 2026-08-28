package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzm extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzxn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzgr zzgrVar, zzg zzgVar, long j10, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = j10;
        this.zzf = zzxnVar;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        Object a2;
        zzgr zzgrVar;
        a aVar = a.a;
        int i9 = this.zzb;
        try {
        } catch (zzcg e10) {
            a2 = y5.a(e10);
        }
        if (i9 == 0) {
            y5.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            long j10 = this.zze;
            zzxn zzxnVar = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j10, zzxnVar, null), null);
            if (zzhfVar != aVar) {
                obj = zzhfVar;
            }
            return aVar;
        }
        if (i9 != 1) {
            y5.b(obj);
            a2 = oc.i.a;
            return new f(a2);
        }
        zzgrVar = (zzgr) this.zza;
        y5.b(obj);
        this.zza = null;
        this.zzb = 2;
        if (((zzhf) obj).zza(zzgrVar.zza(), this) == aVar) {
            return aVar;
        }
        a2 = oc.i.a;
        return new f(a2);
    }
}
