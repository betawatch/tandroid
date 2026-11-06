package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzee extends j implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzhh zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzeh zzehVar, long j3, zzdw zzdwVar, String str, zzhh zzhhVar, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = j3;
        this.zzd = zzdwVar;
        this.zze = str;
        this.zzf = zzhhVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzee zzeeVar = new zzee(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, cVar);
        zzeeVar.zzg = obj;
        return zzeeVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzee) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r8 != r0) goto L17;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        try {
            if (i7 == 0) {
                b.c(obj);
                zzhkVar = (zzhk) this.zzg;
                zzeh zzehVar = this.zzb;
                long j3 = this.zzc;
                zzeh.zzf(zzehVar, j3);
                zzdw zzdwVar = this.zzd;
                this.zzg = zzhkVar;
                this.zza = 1;
                obj = zzdwVar.zzb(j3, this);
            } else {
                if (i7 != 1) {
                    b.c(obj);
                    zzeq zzeqVar = new zzeq(this.zzd, this.zze, this.zzf);
                    this.zzb.zzc = zzeqVar;
                    return zzeqVar;
                }
                zzhkVar = (zzhk) this.zzg;
                b.c(obj);
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
