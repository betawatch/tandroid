package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        return ((zzeo) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
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
        Exception e7;
        zzcg e10;
        String str;
        long j3;
        RecaptchaAction recaptchaAction;
        zzdw zzdwVar;
        String zzb;
        a aVar = a.a;
        int i10 = this.zza;
        if (i10 != 0) {
            try {
                if (i10 != 1) {
                    t7.b(obj);
                    str = (String) obj;
                    if (str.length() == 0) {
                        return str;
                    }
                    throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
                }
                zzgrVar = (zzgr) this.zze;
                t7.b(obj);
                zzeoVar = this;
            } catch (zzcg e11) {
                throw e11;
            } catch (Exception e12) {
                exc = e12;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
        } else {
            t7.b(obj);
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
            } catch (zzcg e13) {
                e10 = e13;
                throw e10;
            } catch (Exception e14) {
                e7 = e14;
                exc = e7;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
            try {
                obj = zzdwVar.zza(zzb, recaptchaAction, j3, zzeoVar);
            } catch (zzcg e15) {
                e10 = e15;
                throw e10;
            } catch (Exception e16) {
                e7 = e16;
                exc = e7;
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
