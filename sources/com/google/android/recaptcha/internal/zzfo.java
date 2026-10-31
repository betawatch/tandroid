package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import kotlin.jvm.internal.i;
import l9.b;
import ld.p;
import td.e0;
import td.e2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzfo extends j implements p {
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, cVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                b.b(obj);
            } else {
                b.b(obj);
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
        } catch (zzcg e) {
            if (!i.a(e.zzb(), zzce.zzc)) {
                throw e;
            }
            zzt3 = this.zzc.zzt(e, e);
            throw zzt3;
        } catch (e2 e7) {
            zzt2 = this.zzc.zzt(e7, new zzcg(zzce.zzc, zzcd.zzb, e7.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e10) {
            zzt = this.zzc.zzt(e10, new zzcg(zzce.zzc, zzcd.zzaz, e10.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
