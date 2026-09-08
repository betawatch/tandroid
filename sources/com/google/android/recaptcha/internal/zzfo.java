package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.d2;
import zd.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                t7.b(obj);
            } else {
                t7.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j3 = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = e0.x(j3, zzfnVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e7) {
            if (!kotlin.jvm.internal.i.a(e7.zzb(), zzce.zzc)) {
                throw e7;
            }
            zzt3 = this.zzc.zzt(e7, e7);
            throw zzt3;
        } catch (d2 e10) {
            zzt2 = this.zzc.zzt(e10, new zzcg(zzce.zzc, zzcd.zzb, e10.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e11) {
            zzt = this.zzc.zzt(e11, new zzcg(zzce.zzc, zzcd.zzaz, e11.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
