package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.c0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzc extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ zzxn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzgr zzgrVar, zzg zzgVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = zzxnVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzc(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        tc.a aVar = tc.a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            c7.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            zzxn zzxnVar = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzd(zzxnVar, this);
        } else {
            if (i10 != 1) {
                c7.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            c7.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == aVar ? aVar : zza;
    }
}
