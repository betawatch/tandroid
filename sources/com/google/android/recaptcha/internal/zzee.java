package com.google.android.recaptcha.internal;

import g7.y5;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzee extends i implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzhh zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzeh zzehVar, long j10, zzdw zzdwVar, String str, zzhh zzhhVar, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = j10;
        this.zzd = zzdwVar;
        this.zze = str;
        this.zzf = zzhhVar;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzee zzeeVar = new zzee(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, cVar);
        zzeeVar.zzg = obj;
        return zzeeVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzee) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r8 != r0) goto L17;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i9 = this.zza;
        try {
            if (i9 == 0) {
                y5.b(obj);
                zzhkVar = (zzhk) this.zzg;
                zzeh zzehVar = this.zzb;
                long j10 = this.zzc;
                zzeh.zzf(zzehVar, j10);
                zzdw zzdwVar = this.zzd;
                this.zzg = zzhkVar;
                this.zza = 1;
                obj = zzdwVar.zzb(j10, this);
            } else {
                if (i9 != 1) {
                    y5.b(obj);
                    zzeq zzeqVar = new zzeq(this.zzd, this.zze, this.zzf);
                    this.zzb.zzc = zzeqVar;
                    return zzeqVar;
                }
                zzhkVar = (zzhk) this.zzg;
                y5.b(obj);
            }
            this.zzg = null;
            this.zza = 2;
            if (((zzhg) obj).zza(zzhkVar, this) == aVar) {
                return aVar;
            }
            zzeq zzeqVar2 = new zzeq(this.zzd, this.zze, this.zzf);
            this.zzb.zzc = zzeqVar2;
            return zzeqVar2;
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zza, e11.getMessage(), null, 8, null);
        }
    }
}
