package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzfn extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzgr zzgrVar, zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzfn(this.zzc, this.zzd, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfn) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r5 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r5 != r0) goto L9;
     */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            b.b(obj);
            zzgrVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzez(zzfpVar, null));
        } else {
            if (i10 != 1) {
                b.b(obj);
                return (zzxn) obj;
            }
            zzgrVar = (zzgr) this.zza;
            b.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
    }
}
