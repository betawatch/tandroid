package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.d2;
import jd.e0;
import kotlin.jvm.internal.j;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, cVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        tc.a aVar = tc.a.a;
        try {
            if (this.zza != 0) {
                c7.b(obj);
            } else {
                c7.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j10 = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = e0.x(j10, zzfnVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e10) {
            if (!j.a(e10.zzb(), zzce.zzc)) {
                throw e10;
            }
            zzt3 = this.zzc.zzt(e10, e10);
            throw zzt3;
        } catch (d2 e11) {
            zzt2 = this.zzc.zzt(e11, new zzcg(zzce.zzc, zzcd.zzb, e11.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e12) {
            zzt = this.zzc.zzt(e12, new zzcg(zzce.zzc, zzcd.zzaz, e12.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
