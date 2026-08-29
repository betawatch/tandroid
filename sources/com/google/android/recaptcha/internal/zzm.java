package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.c0;
import qc.f;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        Object a2;
        zzgr zzgrVar;
        tc.a aVar = tc.a.a;
        int i10 = this.zzb;
        try {
        } catch (zzcg e10) {
            a2 = c7.a(e10);
        }
        if (i10 == 0) {
            c7.b(obj);
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
            c7.b(obj);
            a2 = qc.i.a;
            return new f(a2);
        }
        zzgrVar = (zzgr) this.zza;
        c7.b(obj);
        this.zza = null;
        this.zzb = 2;
        if (((zzhf) obj).zza(zzgrVar.zza(), this) == aVar) {
            return aVar;
        }
        a2 = qc.i.a;
        return new f(a2);
    }
}
