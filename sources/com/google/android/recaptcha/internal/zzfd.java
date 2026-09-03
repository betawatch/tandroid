package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import ld.d2;
import ld.e0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, cVar);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                q7.b(obj);
            } else {
                q7.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j10 = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j10, null);
                this.zza = 1;
                if (e0.x(j10, zzfcVar, this) == aVar) {
                    return aVar;
                }
            }
            return sc.i.a;
        } catch (zzcg e6) {
            throw e6;
        } catch (d2 e10) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e10.getMessage(), null, 8, null);
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e11.getMessage(), null, 8, null);
        }
    }
}
