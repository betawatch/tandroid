package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import java.util.List;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzae extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzar zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ List zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzhk zzhkVar, zzar zzarVar, String str, List list, c cVar) {
        super(2, cVar);
        this.zzc = zzhkVar;
        this.zzd = zzarVar;
        this.zze = str;
        this.zzf = list;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzae(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r0) goto L9;
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
            zzhkVar = this.zzc;
            zzar zzarVar = this.zzd;
            String str = this.zze;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzarVar.zzc(str, this);
        } else {
            if (i10 != 1) {
                b.b(obj);
                this.zzf.add((zzat) obj);
                return ad.j.a;
            }
            zzhkVar = (zzhk) this.zza;
            b.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar, this);
    }
}
