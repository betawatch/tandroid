package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzlw(this.zzc, this.zzd, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (hd.f0.x(20000, r10, r9) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r10.zzw(r9) != r1) goto L16;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zzb;
        try {
            if (i9 == 0) {
                y5.b(obj);
                zzly zzlyVar = this.zzc;
                this.zzb = 1;
            } else {
                if (i9 != 1) {
                    if (i9 == 2) {
                        y5.b(obj);
                        return oc.i.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zza;
                    y5.b(obj);
                    throw zzcgVar;
                }
                y5.b(obj);
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
