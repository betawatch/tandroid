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

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, cVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                a8.b(obj);
            } else {
                a8.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j3 = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = g0.x(j3, zzfnVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzxn) obj;
        } catch (f2 e7) {
            zzt3 = this.zzc.zzt(e7, new zzcg(zzce.zzc, zzcd.zzb, e7.getMessage(), null, 8, null));
            throw zzt3;
        } catch (zzcg e10) {
            if (!kotlin.jvm.internal.i.a(e10.zzb(), zzce.zzc)) {
                throw e10;
            }
            zzt2 = this.zzc.zzt(e10, e10);
            throw zzt2;
        } catch (Exception e11) {
            zzt = this.zzc.zzt(e11, new zzcg(zzce.zzc, zzcd.zzaz, e11.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
