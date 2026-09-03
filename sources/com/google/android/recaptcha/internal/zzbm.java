package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzbm extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzbo zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbm(zzhk zzhkVar, zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zzc = zzhkVar;
        this.zzd = zzboVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzbm(this.zzc, this.zzd, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbm) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
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
            q7.b(obj);
            zzhkVar = this.zzc;
            zzbo zzboVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzhj.zzd(38, 2, new zzbf(zzboVar, null), this);
        } else {
            if (i10 != 1) {
                q7.b(obj);
                return sc.i.a;
            }
            zzhkVar = (zzhk) this.zza;
            q7.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
