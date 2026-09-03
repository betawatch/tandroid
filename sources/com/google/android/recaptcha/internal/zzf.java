package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import ld.e0;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r1;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                q7.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j10 = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = e0.x(j10, zzeVar, this);
            } else {
                if (i10 != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    q7.b(obj);
                    throw zzcgVar;
                }
                q7.b(obj);
            }
            Object obj2 = ((f) obj).a;
            q7.b(obj2);
            return (zzxx) obj2;
        } catch (Exception e6) {
            zzcg zza = zzh.zza(e6, new zzcg(zzce.zzb, zzcd.zzaa, e6.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j11 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j11, e6, this) != aVar) {
                throw zza;
            }
        }
    }
}
