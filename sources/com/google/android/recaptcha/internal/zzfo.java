package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfo extends eeb implements fs4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(long j, zzfp zzfpVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = j;
        this.zzc = zzfpVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, px2Var);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        try {
            if (this.zza != 0) {
                tue.b(obj);
            } else {
                tue.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = oxe.a(j, zzfnVar, this);
                ly2 ly2Var = ly2.a;
                if (obj == ly2Var) {
                    return ly2Var;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e) {
            if (!rr5.a(e.zzb(), zzce.zzc)) {
                throw e;
            }
            zzt3 = this.zzc.zzt(e, e);
            throw zzt3;
        } catch (nqb e2) {
            zzt2 = this.zzc.zzt(e2, new zzcg(zzce.zzc, zzcd.zzb, e2.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e3) {
            zzt = this.zzc.zzt(e3, new zzcg(zzce.zzc, zzcd.zzaz, e3.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
