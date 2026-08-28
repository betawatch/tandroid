package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzbh extends i implements p {
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzbh(this.zzc, this.zzd, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
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
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i9 = this.zzb;
        if (i9 == 0) {
            y5.b(obj);
            zzbo zzboVar = this.zzc;
            zzboVar.zzc = zzbp.zza;
            zzhkVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzboVar.zze(this);
        } else {
            if (i9 != 1) {
                y5.b(obj);
                return oc.i.a;
            }
            zzhkVar = (zzhk) this.zza;
            y5.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
