package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzew extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzgr zze;
    final /* synthetic */ zzye zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(long j, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, px2 px2Var) {
        super(2, px2Var);
        this.zzc = j;
        this.zzd = zzfpVar;
        this.zze = zzgrVar;
        this.zzf = zzyeVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e79 e79Var;
        e79 e79Var2;
        long j;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        if (this.zzb != 0) {
            e79Var2 = (e79) this.zza;
            try {
                tue.b(obj);
                zzc = obj;
            } catch (Exception e) {
                e = e;
                zzcgVar = (zzcg) e79Var2.a;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            tue.b(obj);
            e79 e79Var3 = new e79();
            try {
                j = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, e79Var3, null);
                e79Var = e79Var3;
            } catch (Exception e2) {
                e = e2;
                e79Var = e79Var3;
            }
            try {
                this.zza = e79Var;
                this.zzb = 1;
                zzc = zzcx.zzc(j, 20, 100L, 1000L, 2.0d, zzevVar, this);
                ly2 ly2Var = ly2.a;
                if (zzc == ly2Var) {
                    return ly2Var;
                }
                e79Var2 = e79Var;
            } catch (Exception e3) {
                e = e3;
                e79Var2 = e79Var;
                zzcgVar = (zzcg) e79Var2.a;
                if (zzcgVar != null) {
                }
            }
        }
        return (zzyg) zzc;
    }
}
