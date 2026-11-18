package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        return ((zzap) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
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
        int i7 = this.zza;
        if (i7 == 0) {
            h.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            zzxp zzxpVar = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zzf(zzxpVar, this);
        } else {
            if (i7 != 1) {
                h.b(obj);
                return k.a;
            }
            zzgrVar = (zzgr) this.zzd;
            h.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
    }
}
