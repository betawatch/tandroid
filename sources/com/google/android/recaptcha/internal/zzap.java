package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzap extends j implements p {
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzap zzapVar = new zzap(this.zzb, this.zzc, cVar);
        zzapVar.zzd = obj;
        return zzapVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzap) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
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
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zza;
        if (i10 == 0) {
            t7.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            zzxp zzxpVar = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zzf(zzxpVar, this);
        } else {
            if (i10 != 1) {
                t7.b(obj);
                return i.a;
            }
            zzgrVar = (zzgr) this.zzd;
            t7.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
    }
}
