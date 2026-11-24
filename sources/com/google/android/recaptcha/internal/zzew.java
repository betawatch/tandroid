package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzew extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzgr zze;
    final /* synthetic */ zzye zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(long j, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = j;
        this.zzd = zzfpVar;
        this.zze = zzgrVar;
        this.zzf = zzyeVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c59 c59Var;
        c59 c59Var2;
        long j;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        if (this.zzb != 0) {
            c59Var2 = (c59) this.zza;
            try {
                qse.b(obj);
                zzc = obj;
            } catch (Exception e) {
                e = e;
                zzcgVar = (zzcg) c59Var2.a;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            qse.b(obj);
            c59 c59Var3 = new c59();
            try {
                j = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, c59Var3, null);
                c59Var = c59Var3;
            } catch (Exception e2) {
                e = e2;
                c59Var = c59Var3;
            }
            try {
                this.zza = c59Var;
                this.zzb = 1;
                zzc = zzcx.zzc(j, 20, 100L, 1000L, 2.0d, zzevVar, this);
                bx2 bx2Var = bx2.a;
                if (zzc == bx2Var) {
                    return bx2Var;
                }
                c59Var2 = c59Var;
            } catch (Exception e3) {
                e = e3;
                c59Var2 = c59Var;
                zzcgVar = (zzcg) c59Var2.a;
                if (zzcgVar != null) {
                }
            }
        }
        return (zzyg) zzc;
    }
}
