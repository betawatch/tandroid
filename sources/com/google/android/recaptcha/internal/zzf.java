package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.e0;
import qc.f;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzf extends i implements p {
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r1;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                c7.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j10 = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = e0.x(j10, zzeVar, this);
            } else {
                if (i10 != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    c7.b(obj);
                    throw zzcgVar;
                }
                c7.b(obj);
            }
            Object obj2 = ((f) obj).a;
            c7.b(obj2);
            return (zzxx) obj2;
        } catch (Exception e10) {
            zzcg zza = zzh.zza(e10, new zzcg(zzce.zzb, zzcd.zzaa, e10.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j11 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j11, e10, this) != aVar) {
                throw zza;
            }
        }
    }
}
