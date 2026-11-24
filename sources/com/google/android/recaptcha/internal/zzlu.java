package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzlu extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlu(zzly zzlyVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzlyVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzlu zzluVar = new zzlu(this.zzb, fw2Var);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (r9.zzc(r0, r8) != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r8 = r8.zzb;
        r8.zza = hsd.a();
        r9 = r8.zzD();
        ppd.b(r9.zza(), new com.google.android.recaptcha.internal.zzlt(r5, r8, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 != 1) goto L15;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        g5c g5cVar = g5c.a;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzhk zzhkVar2 = (zzhk) this.zzc;
            zzdj zzn = this.zzb.zzn();
            zzmc[] zzmcVarArr = {zzmc.zzd, zzmc.zzc, zzmc.zzb};
            this.zzc = zzhkVar2;
            this.zza = 1;
            Object zzb = zzn.zzb(zzmcVarArr, this);
            if (zzb != bx2Var) {
                zzhkVar = zzhkVar2;
                obj = zzb;
            }
            return bx2Var;
        }
        zzhkVar = (zzhk) this.zzc;
        qse.b(obj);
        if (((Boolean) obj).booleanValue()) {
            return g5cVar;
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar = zzmc.zzb;
        this.zzc = zzhkVar;
        this.zza = 2;
    }
}
