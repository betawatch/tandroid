package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzlu extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlu(zzly zzlyVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzlyVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzlu zzluVar = new zzlu(this.zzb, zw2Var);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (r9.zzc(r0, r8) != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r8 = r8.zzb;
        r8.zza = xwd.a();
        r9 = r8.zzD();
        fud.b(r9.zza(), new com.google.android.recaptcha.internal.zzlt(r5, r8, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 != 1) goto L15;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        g9c g9cVar = g9c.a;
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            zzhk zzhkVar2 = (zzhk) this.zzc;
            zzdj zzn = this.zzb.zzn();
            zzmc[] zzmcVarArr = {zzmc.zzd, zzmc.zzc, zzmc.zzb};
            this.zzc = zzhkVar2;
            this.zza = 1;
            Object zzb = zzn.zzb(zzmcVarArr, this);
            if (zzb != vx2Var) {
                zzhkVar = zzhkVar2;
                obj = zzb;
            }
            return vx2Var;
        }
        zzhkVar = (zzhk) this.zzc;
        ixe.b(obj);
        if (((Boolean) obj).booleanValue()) {
            return g9cVar;
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar = zzmc.zzb;
        this.zzc = zzhkVar;
        this.zza = 2;
    }
}
