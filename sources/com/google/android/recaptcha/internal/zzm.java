package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import ld.c0;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        Object a2;
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        try {
        } catch (zzcg e) {
            a2 = p7.a(e);
        }
        if (i10 == 0) {
            p7.b(obj);
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
        if (i10 != 1) {
            p7.b(obj);
            a2 = sc.i.a;
            return new f(a2);
        }
        zzgrVar = (zzgr) this.zza;
        p7.b(obj);
        this.zza = null;
        this.zzb = 2;
        if (((zzhf) obj).zza(zzgrVar.zza(), this) == aVar) {
            return aVar;
        }
        a2 = sc.i.a;
        return new f(a2);
    }
}
