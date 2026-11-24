package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzlu extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlu(zzly zzlyVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzlyVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzlu zzluVar = new zzlu(this.zzb, px2Var);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (r9.zzc(r0, r8) != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r8 = r8.zzb;
        r8.zza = kud.a();
        r9 = r8.zzD();
        srd.b(r9.zza(), new com.google.android.recaptcha.internal.zzlt(r5, r8, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 != 1) goto L15;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        g7c g7cVar = g7c.a;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzhk zzhkVar2 = (zzhk) this.zzc;
            zzdj zzn = this.zzb.zzn();
            zzmc[] zzmcVarArr = {zzmc.zzd, zzmc.zzc, zzmc.zzb};
            this.zzc = zzhkVar2;
            this.zza = 1;
            Object zzb = zzn.zzb(zzmcVarArr, this);
            if (zzb != ly2Var) {
                zzhkVar = zzhkVar2;
                obj = zzb;
            }
            return ly2Var;
        }
        zzhkVar = (zzhk) this.zzc;
        tue.b(obj);
        if (((Boolean) obj).booleanValue()) {
            return g7cVar;
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar = zzmc.zzb;
        this.zzc = zzhkVar;
        this.zza = 2;
    }
}
