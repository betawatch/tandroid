package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzlw extends j implements p {
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzlw(this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (zd.b0.z(20000, r10, r9) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r10.zzw(r9) != r1) goto L16;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zzb;
        try {
            if (i7 == 0) {
                b.c(obj);
                zzly zzlyVar = this.zzc;
                this.zzb = 1;
            } else {
                if (i7 != 1) {
                    if (i7 == 2) {
                        b.c(obj);
                        return k.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zza;
                    b.c(obj);
                    throw zzcgVar;
                }
                b.c(obj);
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
