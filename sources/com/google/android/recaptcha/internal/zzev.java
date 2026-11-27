package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzev extends yfb implements ur4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzye zze;
    final /* synthetic */ p89 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, p89 p89Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
        this.zze = zzyeVar;
        this.zzf = p89Var;
    }

    @Override // qf0
    public final zw2 create(zw2 zw2Var) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, zw2Var);
    }

    @Override // ur4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((zw2) obj)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r6 != r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r6 != r3) goto L13;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        vx2 vx2Var = vx2.a;
        try {
            if (i == 0) {
                ixe.b(obj);
                zzgrVar = this.zzc;
                zzfp zzfpVar = this.zzd;
                zzye zzyeVar = this.zze;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            } else {
                if (i != 1) {
                    ixe.b(obj);
                    return (zzyg) obj;
                }
                zzgrVar = (zzgr) this.zza;
                ixe.b(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
        } catch (zzcg e) {
            this.zzf.a = e;
            throw e;
        }
    }
}
