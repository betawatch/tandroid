package com.google.android.recaptcha.internal;

import af.b;
import com.google.android.recaptcha.RecaptchaAction;
import gd.k;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzeo extends j implements p {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzeq zzeqVar, long j3, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzb = zzeqVar;
        this.zzc = j3;
        this.zzd = recaptchaAction;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzeo zzeoVar = new zzeo(this.zzb, this.zzc, this.zzd, cVar);
        zzeoVar.zze = obj;
        return zzeoVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeo) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r10 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[Catch: Exception -> 0x0074, zzcg -> 0x0077, TryCatch #4 {zzcg -> 0x0077, Exception -> 0x0074, blocks: (B:13:0x005c, B:17:0x0065, B:18:0x0073, B:10:0x0049, B:8:0x0043), top: B:7:0x0043 }] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        zzgr zzgrVar;
        zzeo zzeoVar;
        Exception e10;
        zzcg e11;
        String str;
        long j3;
        RecaptchaAction recaptchaAction;
        zzdw zzdwVar;
        String zzb;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        if (i7 != 0) {
            try {
                if (i7 != 1) {
                    b.c(obj);
                    str = (String) obj;
                    if (str.length() == 0) {
                        return str;
                    }
                    throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
                }
                zzgrVar = (zzgr) this.zze;
                b.c(obj);
                zzeoVar = this;
            } catch (zzcg e12) {
                throw e12;
            } catch (Exception e13) {
                exc = e13;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
        } else {
            b.c(obj);
            zzgrVar = (zzgr) this.zze;
            try {
                zzeq zzeqVar = this.zzb;
                j3 = this.zzc;
                recaptchaAction = this.zzd;
                zzeq.zzd(zzeqVar, j3, recaptchaAction);
                zzdwVar = zzeqVar.zzb;
                zzb = zzgrVar.zza().zzb();
                this.zze = zzgrVar;
                this.zza = 1;
                zzeoVar = this;
            } catch (zzcg e14) {
                e11 = e14;
                throw e11;
            } catch (Exception e15) {
                e10 = e15;
                exc = e10;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
            try {
                obj = zzdwVar.zza(zzb, recaptchaAction, j3, zzeoVar);
            } catch (zzcg e16) {
                e11 = e16;
                throw e11;
            } catch (Exception e17) {
                e10 = e17;
                exc = e10;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
        }
        zzeoVar.zze = null;
        zzeoVar.zza = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
        if (obj == aVar) {
            return aVar;
        }
        str = (String) obj;
        if (str.length() == 0) {
        }
    }
}
