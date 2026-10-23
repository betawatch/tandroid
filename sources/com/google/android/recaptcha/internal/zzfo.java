package com.google.android.recaptcha.internal;

import be.e2;
import be.f0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

    @Override // md.a
    public final c create(Object obj, c cVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, cVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                i8.b(obj);
            } else {
                i8.b(obj);
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
        } catch (e2 e) {
            zzt3 = this.zzc.zzt(e, new zzcg(zzce.zzc, zzcd.zzb, e.getMessage(), null, 8, null));
            throw zzt3;
        } catch (zzcg e7) {
            if (!kotlin.jvm.internal.i.a(e7.zzb(), zzce.zzc)) {
                throw e7;
            }
            zzt2 = this.zzc.zzt(e7, e7);
            throw zzt2;
        } catch (Exception e10) {
            zzt = this.zzc.zzt(e10, new zzcg(zzce.zzc, zzcd.zzaz, e10.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
