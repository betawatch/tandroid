package com.google.android.recaptcha.internal;

import ad.g;
import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzf extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(long j10, zzg zzgVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = j10;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r1;
     */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                b.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j10 = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = e0.x(j10, zzeVar, this);
            } else {
                if (i10 != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    b.b(obj);
                    throw zzcgVar;
                }
                b.b(obj);
            }
            Object obj2 = ((g) obj).a;
            b.b(obj2);
            return (zzxx) obj2;
        } catch (Exception e) {
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j11 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j11, e, this) != aVar) {
                throw zza;
            }
        }
    }
}
