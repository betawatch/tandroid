package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.d2;
import jd.e0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzfd extends i implements p {
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, cVar);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        try {
            if (this.zza != 0) {
                c7.b(obj);
            } else {
                c7.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j10 = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j10, null);
                this.zza = 1;
                if (e0.x(j10, zzfcVar, this) == aVar) {
                    return aVar;
                }
            }
            return qc.i.a;
        } catch (zzcg e10) {
            throw e10;
        } catch (d2 e11) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e12.getMessage(), null, 8, null);
        }
    }
}
