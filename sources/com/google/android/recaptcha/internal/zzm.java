package com.google.android.recaptcha.internal;

import af.b;
import gd.g;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzm extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzxn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzgr zzgrVar, zzg zzgVar, long j3, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = j3;
        this.zzf = zzxnVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        zzgr zzgrVar;
        jd.a aVar = jd.a.a;
        int i7 = this.zzb;
        try {
        } catch (zzcg e10) {
            b10 = b.b(e10);
        }
        if (i7 == 0) {
            b.c(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            long j3 = this.zze;
            zzxn zzxnVar = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j3, zzxnVar, null), null);
            if (zzhfVar != aVar) {
                obj = zzhfVar;
            }
            return aVar;
        }
        if (i7 != 1) {
            b.c(obj);
            b10 = k.a;
            return new g(b10);
        }
        zzgrVar = (zzgr) this.zza;
        b.c(obj);
        this.zza = null;
        this.zzb = 2;
        if (((zzhf) obj).zza(zzgrVar.zza(), this) == aVar) {
            return aVar;
        }
        b10 = k.a;
        return new g(b10);
    }
}
