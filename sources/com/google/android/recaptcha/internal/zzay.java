package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzay extends j implements p {
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzay zzayVar = new zzay(this.zzb, this.zzc, cVar);
        zzayVar.zzd = obj;
        return zzayVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r1, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r10 != r0) goto L13;
     */
    @Override // kd.a
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
            t7.b(obj);
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
            t7.b(obj);
            return i.a;
        }
        zzhkVar = (zzhk) this.zzd;
        t7.b(obj);
        this.zzd = null;
        this.zza = 2;
    }
}
