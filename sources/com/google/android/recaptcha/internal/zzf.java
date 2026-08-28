package com.google.android.recaptcha.internal;

import g7.y5;
import hd.f0;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r1;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        try {
            if (i9 == 0) {
                y5.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j10 = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = f0.x(j10, zzeVar, this);
            } else {
                if (i9 != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    y5.b(obj);
                    throw zzcgVar;
                }
                y5.b(obj);
            }
            Object obj2 = ((f) obj).a;
            y5.b(obj2);
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
