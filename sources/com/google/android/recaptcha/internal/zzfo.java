package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfo extends ccb implements eq4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(long j, zzfp zzfpVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = j;
        this.zzc = zzfpVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, fw2Var);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        try {
            if (this.zza != 0) {
                qse.b(obj);
            } else {
                qse.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = mve.a(j, zzfnVar, this);
                bx2 bx2Var = bx2.a;
                if (obj == bx2Var) {
                    return bx2Var;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e) {
            if (!rp5.a(e.zzb(), zzce.zzc)) {
                throw e;
            }
            zzt3 = this.zzc.zzt(e, e);
            throw zzt3;
        } catch (mob e2) {
            zzt2 = this.zzc.zzt(e2, new zzcg(zzce.zzc, zzcd.zzb, e2.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e3) {
            zzt = this.zzc.zzt(e3, new zzcg(zzce.zzc, zzcd.zzaz, e3.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
