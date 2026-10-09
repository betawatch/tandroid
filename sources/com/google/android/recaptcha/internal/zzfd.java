package com.google.android.recaptcha.internal;

import ae.f2;
import ae.g0;
import hd.i;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzfd extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(long j3, zzfp zzfpVar, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = j3;
        this.zzc = zzfpVar;
        this.zzd = zzxnVar;
    }

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, cVar);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                a8.b(obj);
            } else {
                a8.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j3 = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j3, null);
                this.zza = 1;
                if (g0.x(j3, zzfcVar, this) == aVar) {
                    return aVar;
                }
            }
            return i.a;
        } catch (f2 e7) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e7.getMessage(), null, 8, null);
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e11.getMessage(), null, 8, null);
        }
    }
}
