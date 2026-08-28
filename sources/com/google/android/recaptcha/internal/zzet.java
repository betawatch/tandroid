package com.google.android.recaptcha.internal;

import g7.y5;
import hd.e2;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzet extends i implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzfp zzfpVar, String str, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, cVar);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r8 != r0) goto L19;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i9 = this.zza;
        try {
            if (i9 == 0) {
                y5.b(obj);
                zzgrVar = (zzgr) this.zze;
                zzq zzb = zzfp.zzb(this.zzb);
                String str = this.zzc;
                long j10 = this.zzd;
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzb.zzb(str, j10, this);
            } else {
                if (i9 != 1) {
                    y5.b(obj);
                    return (zzxx) obj;
                }
                zzgrVar = (zzgr) this.zze;
                y5.b(obj);
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
        } catch (e2 e11) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e12.getMessage(), null, 8, null);
        }
    }
}
