package com.google.android.recaptcha.internal;

import af.b;
import gd.g;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
final class zzf extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(long j3, zzg zzgVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = j3;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r1;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        try {
            if (i7 == 0) {
                b.c(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j3 = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = b0.z(j3, zzeVar, this);
            } else {
                if (i7 != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    b.c(obj);
                    throw zzcgVar;
                }
                b.c(obj);
            }
            Object obj2 = ((g) obj).a;
            b.c(obj2);
            return (zzxx) obj2;
        } catch (Exception e10) {
            zzcg zza = zzh.zza(e10, new zzcg(zzce.zzb, zzcd.zzaa, e10.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j10 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j10, e10, this) != aVar) {
                throw zza;
            }
        }
    }
}
