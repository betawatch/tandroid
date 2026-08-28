package com.google.android.recaptcha.internal;

import g7.y5;
import hd.e2;
import hd.f0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzfo extends i implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(long j10, zzfp zzfpVar, c cVar) {
        super(2, cVar);
        this.zzb = j10;
        this.zzc = zzfpVar;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, cVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                y5.b(obj);
            } else {
                y5.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j10 = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = f0.x(j10, zzfnVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e10) {
            if (!kotlin.jvm.internal.i.a(e10.zzb(), zzce.zzc)) {
                throw e10;
            }
            zzt3 = this.zzc.zzt(e10, e10);
            throw zzt3;
        } catch (e2 e11) {
            zzt2 = this.zzc.zzt(e11, new zzcg(zzce.zzc, zzcd.zzb, e11.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e12) {
            zzt = this.zzc.zzt(e12, new zzcg(zzce.zzc, zzcd.zzaz, e12.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
