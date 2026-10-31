package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzlt extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzly zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlt(zzhk zzhkVar, zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzc = zzhkVar;
        this.zzd = zzlyVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzlt(this.zzc, this.zzd, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlt) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r6 != r0) goto L9;
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
            zzly zzlyVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhf(42, new zzlx(zzlyVar, null), null);
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
