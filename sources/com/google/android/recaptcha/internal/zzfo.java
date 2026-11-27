package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzfo extends yfb implements is4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(long j, zzfp zzfpVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = j;
        this.zzc = zzfpVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, zw2Var);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzcg zzt;
        zzcg zzt2;
        zzcg zzt3;
        try {
            if (this.zza != 0) {
                ixe.b(obj);
            } else {
                ixe.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = e0f.a(j, zzfnVar, this);
                vx2 vx2Var = vx2.a;
                if (obj == vx2Var) {
                    return vx2Var;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e) {
            if (!ur5.a(e.zzb(), zzce.zzc)) {
                throw e;
            }
            zzt3 = this.zzc.zzt(e, e);
            throw zzt3;
        } catch (msb e2) {
            zzt2 = this.zzc.zzt(e2, new zzcg(zzce.zzc, zzcd.zzb, e2.getMessage(), null, 8, null));
            throw zzt2;
        } catch (Exception e3) {
            zzt = this.zzc.zzt(e3, new zzcg(zzce.zzc, zzcd.zzaz, e3.getMessage(), null, 8, null));
            throw zzt;
        }
    }
}
