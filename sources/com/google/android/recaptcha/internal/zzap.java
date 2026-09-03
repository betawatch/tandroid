package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzap extends i implements p {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ zzxp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzar zzarVar, zzxp zzxpVar, c cVar) {
        super(2, cVar);
        this.zzb = zzarVar;
        this.zzc = zzxpVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzap zzapVar = new zzap(this.zzb, this.zzc, cVar);
        zzapVar.zzd = obj;
        return zzapVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzap) create((zzgr) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r5).zza(r1.zza(), r4) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r5 != r0) goto L9;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zza;
        if (i10 == 0) {
            q7.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            zzxp zzxpVar = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zzf(zzxpVar, this);
        } else {
            if (i10 != 1) {
                q7.b(obj);
                return sc.i.a;
            }
            zzgrVar = (zzgr) this.zzd;
            q7.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
    }
}
