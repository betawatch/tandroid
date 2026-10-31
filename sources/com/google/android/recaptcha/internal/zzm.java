package com.google.android.recaptcha.internal;

import ad.g;
import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzm extends j implements p {
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        Object a2;
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        try {
        } catch (zzcg e) {
            a2 = b.a(e);
        }
        if (i10 == 0) {
            b.b(obj);
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
            b.b(obj);
            a2 = ad.j.a;
            return new g(a2);
        }
        zzgrVar = (zzgr) this.zza;
        b.b(obj);
        this.zza = null;
        this.zzb = 2;
        if (((zzhf) obj).zza(zzgrVar.zza(), this) == aVar) {
            return aVar;
        }
        a2 = ad.j.a;
        return new g(a2);
    }
}
