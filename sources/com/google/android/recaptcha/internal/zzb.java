package com.google.android.recaptcha.internal;

import ad.g;
import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzb extends j implements p {
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, cVar);
        zzbVar.zze = obj;
        return zzbVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r12 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r12 != r0) goto L23;
     */
    @Override // ed.a
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
            b.b(obj);
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
                b.b(obj);
                return new g(obj);
            }
            b.b(obj);
            obj = (zzxx) obj;
            return new g(obj);
        }
        zzhkVar = (zzhk) this.zze;
        b.b(obj);
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
