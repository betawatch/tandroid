package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzaw extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzba zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(zzhk zzhkVar, zzba zzbaVar, c cVar) {
        super(2, cVar);
        this.zzc = zzhkVar;
        this.zzd = zzbaVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzaw(this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaw) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        String str;
        a aVar = a.a;
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                t7.b(obj);
                zzhkVar = this.zzc;
                zzba zzbaVar = this.zzd;
                zzboVar = zzbaVar.zza;
                str = zzbaVar.zzd;
                this.zza = zzhkVar;
                this.zzb = 1;
                obj = new zzhg(new zzbb(zzboVar, str, null));
            } else {
                if (i10 != 1) {
                    t7.b(obj);
                    zzba zzbaVar2 = this.zzd;
                    zzyu zzf = zzyx.zzf();
                    zzyv zzf2 = zzyw.zzf();
                    zzf2.zzw((String) obj);
                    zzf.zzf((zzyw) zzf2.zzk());
                    return zzas.zzb(zzbaVar2, (zzyx) zzf.zzk());
                }
                zzhkVar = (zzhk) this.zza;
                t7.b(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == aVar) {
                return aVar;
            }
            zzba zzbaVar22 = this.zzd;
            zzyu zzf3 = zzyx.zzf();
            zzyv zzf22 = zzyw.zzf();
            zzf22.zzw((String) obj);
            zzf3.zzf((zzyw) zzf22.zzk());
            return zzas.zzb(zzbaVar22, (zzyx) zzf3.zzk());
        } catch (Exception e7) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e7.getMessage(), e7);
        }
    }
}
