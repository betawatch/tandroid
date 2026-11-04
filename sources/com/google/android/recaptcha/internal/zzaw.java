package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzaw(this.zzc, this.zzd, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaw) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        String str;
        gd.a aVar = gd.a.a;
        int i3 = this.zzb;
        try {
            if (i3 == 0) {
                ib.b(obj);
                zzhkVar = this.zzc;
                zzba zzbaVar = this.zzd;
                zzboVar = zzbaVar.zza;
                str = zzbaVar.zzd;
                this.zza = zzhkVar;
                this.zzb = 1;
                obj = new zzhg(new zzbb(zzboVar, str, null));
            } else {
                if (i3 != 1) {
                    ib.b(obj);
                    zzba zzbaVar2 = this.zzd;
                    zzyu zzf = zzyx.zzf();
                    zzyv zzf2 = zzyw.zzf();
                    zzf2.zzw((String) obj);
                    zzf.zzf((zzyw) zzf2.zzk());
                    return zzas.zzb(zzbaVar2, (zzyx) zzf.zzk());
                }
                zzhkVar = (zzhk) this.zza;
                ib.b(obj);
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
        } catch (Exception e10) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e10.getMessage(), e10);
        }
    }
}
