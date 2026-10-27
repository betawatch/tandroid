package com.google.android.recaptcha.internal;

import a8.jd;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzay extends i implements p {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ zzxp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzba zzbaVar, zzxp zzxpVar, c cVar) {
        super(2, cVar);
        this.zzb = zzbaVar;
        this.zzc = zzxpVar;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzay zzayVar = new zzay(this.zzb, this.zzc, cVar);
        zzayVar.zzd = obj;
        return zzayVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r9).zza(r1, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r9 != r0) goto L13;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzda zzdaVar;
        String zzp;
        zzbo zzboVar;
        zzbo zzboVar2;
        a aVar = a.a;
        int i10 = this.zza;
        if (i10 == 0) {
            jd.b(obj);
            zzhkVar = (zzhk) this.zzd;
            zzba zzbaVar = this.zzb;
            zzdaVar = zzbaVar.zzb;
            if (zzdaVar.zzb(zzba.zzb(zzbaVar))) {
                zzxp zzxpVar = this.zzc;
                if (zzxpVar.zzf() != 0) {
                    zzp = zzba.zzp(zzxpVar.zzg());
                    zzbaVar.zzd = zzp;
                    zzboVar = zzbaVar.zza;
                    zzboVar.zzj(zzxpVar.zzf());
                    zzboVar2 = zzbaVar.zza;
                    this.zzd = zzhkVar;
                    this.zza = 1;
                    obj = zzboVar2.zze(this);
                }
            }
            zzbaVar.zzo(false);
            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
        }
        if (i10 != 1) {
            jd.b(obj);
            return jd.i.a;
        }
        zzhkVar = (zzhk) this.zzd;
        jd.b(obj);
        this.zzd = null;
        this.zza = 2;
    }
}
