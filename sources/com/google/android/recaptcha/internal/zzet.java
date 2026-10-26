package com.google.android.recaptcha.internal;

import a8.jd;
import ce.e2;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, cVar);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r8 != r0) goto L19;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                jd.b(obj);
                zzgrVar = (zzgr) this.zze;
                zzq zzb = zzfp.zzb(this.zzb);
                String str = this.zzc;
                long j10 = this.zzd;
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzb.zzb(str, j10, this);
            } else {
                if (i10 != 1) {
                    jd.b(obj);
                    return (zzxx) obj;
                }
                zzgrVar = (zzgr) this.zze;
                jd.b(obj);
            }
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == aVar) {
                return aVar;
            }
            return (zzxx) obj;
        } catch (e2 e) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e.getMessage(), null, 8, null);
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e11.getMessage(), null, 8, null);
        }
    }
}
