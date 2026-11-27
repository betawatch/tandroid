package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzfc extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfc(zzhk zzhkVar, zzfp zzfpVar, zzxn zzxnVar, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = zzhkVar;
        this.zzd = zzfpVar;
        this.zze = zzxnVar;
        this.zzf = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzfc(this.zzc, this.zzd, this.zze, this.zzf, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfc) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r0, r9) != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r10 != r2) goto L9;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zzb;
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            zzhkVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            zzxn zzxnVar = this.zze;
            long j = this.zzf;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhg(new zzfb(zzfpVar, zzxnVar, j, null));
        } else {
            if (i != 1) {
                ixe.b(obj);
                return g9c.a;
            }
            zzhkVar = (zzhk) this.zza;
            ixe.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
