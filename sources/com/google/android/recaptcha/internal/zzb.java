package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzb extends i implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zzg zzgVar, String str, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, cVar);
        zzbVar.zze = obj;
        return zzbVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r12 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r12 != r0) goto L24;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zza;
        try {
        } catch (Exception unused) {
            zzg zzgVar = this.zzb;
            String str = this.zzc;
            this.zze = null;
            this.zza = 3;
            obj = zzgVar.zza(str, this);
        }
        if (i10 == 0) {
            q7.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzg zzgVar2 = this.zzb;
            String str2 = this.zzc;
            long j10 = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            zzhf zzhfVar = new zzhf(zzgVar2.zzj(), new zzf(j10, zzgVar2, str2, null), null);
            if (zzhfVar != aVar) {
                obj = zzhfVar;
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                q7.b(obj);
                return new f(obj);
            }
            q7.b(obj);
            obj = (zzxx) obj;
            return new f(obj);
        }
        zzhkVar = (zzhk) this.zze;
        q7.b(obj);
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
