package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzew extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzgr zze;
    final /* synthetic */ zzye zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(long j, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = j;
        this.zzd = zzfpVar;
        this.zze = zzgrVar;
        this.zzf = zzyeVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p89 p89Var;
        p89 p89Var2;
        long j;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        if (this.zzb != 0) {
            p89Var2 = (p89) this.zza;
            try {
                ixe.b(obj);
                zzc = obj;
            } catch (Exception e) {
                e = e;
                zzcgVar = (zzcg) p89Var2.a;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            ixe.b(obj);
            p89 p89Var3 = new p89();
            try {
                j = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, p89Var3, null);
                p89Var = p89Var3;
            } catch (Exception e2) {
                e = e2;
                p89Var = p89Var3;
            }
            try {
                this.zza = p89Var;
                this.zzb = 1;
                zzc = zzcx.zzc(j, 20, 100L, 1000L, 2.0d, zzevVar, this);
                vx2 vx2Var = vx2.a;
                if (zzc == vx2Var) {
                    return vx2Var;
                }
                p89Var2 = p89Var;
            } catch (Exception e3) {
                e = e3;
                p89Var2 = p89Var;
                zzcgVar = (zzcg) p89Var2.a;
                if (zzcgVar != null) {
                }
            }
        }
        return (zzyg) zzc;
    }
}
