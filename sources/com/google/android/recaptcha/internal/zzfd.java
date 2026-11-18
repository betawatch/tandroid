package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import zd.b0;
import zd.x1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, cVar);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                h.b(obj);
            } else {
                h.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j3 = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j3, null);
                this.zza = 1;
                if (b0.z(j3, zzfcVar, this) == aVar) {
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
