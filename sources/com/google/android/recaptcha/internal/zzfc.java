package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzfc extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfc(zzhk zzhkVar, zzfp zzfpVar, zzxn zzxnVar, long j10, c cVar) {
        super(2, cVar);
        this.zzc = zzhkVar;
        this.zzd = zzfpVar;
        this.zze = zzxnVar;
        this.zzf = j10;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzfc(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfc) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r1, r9) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r10 != r0) goto L9;
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
            zzhkVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            zzxn zzxnVar = this.zze;
            long j10 = this.zzf;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhg(new zzfb(zzfpVar, zzxnVar, j10, null));
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
