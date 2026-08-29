package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.c0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzlw extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlw(zzly zzlyVar, zzgr zzgrVar, c cVar) {
        super(2, cVar);
        this.zzc = zzlyVar;
        this.zzd = zzgrVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzlw(this.zzc, this.zzd, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (jd.e0.x(20000, r10, r9) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r10.zzw(r9) != r1) goto L16;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                c7.b(obj);
                zzly zzlyVar = this.zzc;
                this.zzb = 1;
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        c7.b(obj);
                        return qc.i.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zza;
                    c7.b(obj);
                    throw zzcgVar;
                }
                c7.b(obj);
            }
            zzlv zzlvVar = new zzlv(this.zzc, this.zzd, null);
            this.zzb = 2;
        } catch (Exception e10) {
            e10.getMessage();
            zzcg zza = zzh.zza(e10, new zzcg(zzce.zzb, zzcd.zzV, e10.getMessage(), null, 8, null));
            zzdj zzn = this.zzc.zzn();
            zzmc zzmcVar = zzmc.zza;
            this.zza = zza;
            this.zzb = 3;
            if (zzn.zzc(zzmcVar, this) != aVar) {
                throw zza;
            }
        }
    }
}
