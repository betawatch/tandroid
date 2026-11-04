package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.b0;
import wd.x1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzfd extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(long j10, zzfp zzfpVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = j10;
        this.zzc = zzfpVar;
        this.zzd = zzxnVar;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, cVar);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        try {
            if (this.zza != 0) {
                ib.b(obj);
            } else {
                ib.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j10 = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j10, null);
                this.zza = 1;
                if (b0.z(j10, zzfcVar, this) == aVar) {
                    return aVar;
                }
            }
            return k.a;
        } catch (zzcg e10) {
            throw e10;
        } catch (x1 e11) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e12.getMessage(), null, 8, null);
        }
    }
}
