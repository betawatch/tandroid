package com.google.android.recaptcha.internal;

import a8.jd;
import ce.e2;
import ce.f0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, cVar);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                jd.b(obj);
            } else {
                jd.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j10 = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j10, null);
                this.zza = 1;
                if (f0.x(j10, zzfcVar, this) == aVar) {
                    return aVar;
                }
            }
            return jd.i.a;
        } catch (e2 e) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e.getMessage(), null, 8, null);
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e11.getMessage(), null, 8, null);
        }
    }
}
