package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import id.e2;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, cVar);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r8 != r0) goto L19;
     */
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        sc.a aVar = sc.a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                k6.b(obj);
                zzgrVar = (zzgr) this.zze;
                zzq zzb = zzfp.zzb(this.zzb);
                String str = this.zzc;
                long j10 = this.zzd;
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzb.zzb(str, j10, this);
            } else {
                if (i10 != 1) {
                    k6.b(obj);
                    return (zzxx) obj;
                }
                zzgrVar = (zzgr) this.zze;
                k6.b(obj);
            }
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == aVar) {
                return aVar;
            }
            return (zzxx) obj;
        } catch (zzcg e9) {
            throw e9;
        } catch (e2 e10) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e10.getMessage(), null, 8, null);
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e11.getMessage(), null, 8, null);
        }
    }
}
