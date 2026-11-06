package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.x1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzet extends j implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzfp zzfpVar, String str, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = str;
        this.zzd = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, cVar);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r8 != r0) goto L19;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        try {
            if (i7 == 0) {
                b.c(obj);
                zzgrVar = (zzgr) this.zze;
                zzq zzb = zzfp.zzb(this.zzb);
                String str = this.zzc;
                long j3 = this.zzd;
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzb.zzb(str, j3, this);
            } else {
                if (i7 != 1) {
                    b.c(obj);
                    return (zzxx) obj;
                }
                zzgrVar = (zzgr) this.zze;
                b.c(obj);
            }
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == aVar) {
                return aVar;
            }
            return (zzxx) obj;
        } catch (zzcg e10) {
            throw e10;
        } catch (x1 e11) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e12.getMessage(), null, 8, null);
        }
    }
}
