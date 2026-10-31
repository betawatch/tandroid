package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzlw(this.zzc, this.zzd, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (td.e0.x(20000, r10, r9) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r10.zzw(r9) != r1) goto L16;
     */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                b.b(obj);
                zzly zzlyVar = this.zzc;
                this.zzb = 1;
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        b.b(obj);
                        return ad.j.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zza;
                    b.b(obj);
                    throw zzcgVar;
                }
                b.b(obj);
            }
            zzlv zzlvVar = new zzlv(this.zzc, this.zzd, null);
            this.zzb = 2;
        } catch (Exception e) {
            e.getMessage();
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzV, e.getMessage(), null, 8, null));
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
