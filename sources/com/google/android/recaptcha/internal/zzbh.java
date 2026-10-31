package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzbh extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;
    final /* synthetic */ zzhk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbo zzboVar, zzhk zzhkVar, c cVar) {
        super(2, cVar);
        this.zzc = zzboVar;
        this.zzd = zzhkVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzbh(this.zzc, this.zzd, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r4).zza(r1, r3) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r4 != r0) goto L9;
     */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            b.b(obj);
            zzbo zzboVar = this.zzc;
            zzboVar.zzc = zzbp.zza;
            zzhkVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzboVar.zze(this);
        } else {
            if (i10 != 1) {
                b.b(obj);
                return ad.j.a;
            }
            zzhkVar = (zzhk) this.zza;
            b.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
