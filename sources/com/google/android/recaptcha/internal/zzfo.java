package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.b0;
import zd.x1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
final class zzfo extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(long j3, zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zzb = j3;
        this.zzc = zzfpVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, cVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        jd.a aVar = jd.a.a;
        try {
            if (this.zza != 0) {
                b.c(obj);
            } else {
                b.c(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j3 = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = b0.z(j3, zzfnVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e10) {
            if (!kotlin.jvm.internal.j.a(e10.zzb(), zzce.zzc)) {
                throw e10;
            }
            zzt3 = this.zzc.zzt(e10, e10);
            throw zzt3;
        } catch (x1 e11) {
            zzt2 = this.zzc.zzt(e11, new zzcg(zzce.zzc, zzcd.zzb, e11.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e12) {
            zzt = this.zzc.zzt(e12, new zzcg(zzce.zzc, zzcd.zzaz, e12.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
