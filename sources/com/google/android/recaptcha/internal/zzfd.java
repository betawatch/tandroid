package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfd extends eeb implements fs4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(long j, zzfp zzfpVar, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = j;
        this.zzc = zzfpVar;
        this.zzd = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, px2Var);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        try {
            if (this.zza != 0) {
                tue.b(obj);
            } else {
                tue.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j, null);
                this.zza = 1;
                Object a = oxe.a(j, zzfcVar, this);
                ly2 ly2Var = ly2.a;
                if (a == ly2Var) {
                    return ly2Var;
                }
            }
            return g7c.a;
        } catch (zzcg e) {
            throw e;
        } catch (nqb e2) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e3.getMessage(), null, 8, null);
        }
    }
}
