package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import id.e2;
import id.f0;
import kotlin.jvm.internal.j;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, cVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        sc.a aVar = sc.a.a;
        try {
            if (this.zza != 0) {
                k6.b(obj);
            } else {
                k6.b(obj);
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
        } catch (zzcg e9) {
            if (!j.a(e9.zzb(), zzce.zzc)) {
                throw e9;
            }
            zzt3 = this.zzc.zzt(e9, e9);
            throw zzt3;
        } catch (e2 e10) {
            zzt2 = this.zzc.zzt(e10, new zzcg(zzce.zzc, zzcd.zzb, e10.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e11) {
            zzt = this.zzc.zzt(e11, new zzcg(zzce.zzc, zzcd.zzaz, e11.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
