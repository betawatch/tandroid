package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzlt extends i implements p {
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzlt(this.zzc, this.zzd, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlt) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
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
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            p7.b(obj);
            zzhkVar = this.zzc;
            zzly zzlyVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhf(42, new zzlx(zzlyVar, null), null);
        } else {
            if (i10 != 1) {
                p7.b(obj);
                return sc.i.a;
            }
            zzhkVar = (zzhk) this.zza;
            p7.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
