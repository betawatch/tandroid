package com.google.android.recaptcha.internal;

import b8.ib;
import dd.g;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r1;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        try {
            if (i3 == 0) {
                ib.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j10 = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = b0.z(j10, zzeVar, this);
            } else {
                if (i3 != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    ib.b(obj);
                    throw zzcgVar;
                }
                ib.b(obj);
            }
            Object obj2 = ((g) obj).a;
            ib.b(obj2);
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
