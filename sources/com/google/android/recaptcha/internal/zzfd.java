package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfd extends ccb implements eq4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(long j, zzfp zzfpVar, zzxn zzxnVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = j;
        this.zzc = zzfpVar;
        this.zzd = zzxnVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, fw2Var);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        try {
            if (this.zza != 0) {
                qse.b(obj);
            } else {
                qse.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j, null);
                this.zza = 1;
                Object a = mve.a(j, zzfcVar, this);
                bx2 bx2Var = bx2.a;
                if (a == bx2Var) {
                    return bx2Var;
                }
            }
            return g5c.a;
        } catch (zzcg e) {
            throw e;
        } catch (mob e2) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e3.getMessage(), null, 8, null);
        }
    }
}
