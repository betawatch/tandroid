package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzlh extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlh(zzly zzlyVar, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzlyVar;
        this.zzd = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, px2Var);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r7 != r3) goto L17;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        try {
        } catch (zzcg e) {
            ((nq2) this.zzc.zzz()).P(e);
        }
        if (i == 0) {
            tue.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzib zzp = zzly.zzp(this.zzc);
            zzxn zzxnVar = this.zzd;
            this.zze = zzhkVar;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzp.zzc(zzxnVar, this);
            if (obj != ly2Var) {
                zzhkVar2 = zzhkVar;
            }
            return ly2Var;
        }
        if (i != 1) {
            zzhkVar = (zzhk) this.zze;
            tue.b(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            srd.b(zzD.zzb(), new zzlg(zzlyVar, zzhkVar, (String) obj, null));
            return g7c.a;
        }
        zzhk zzhkVar3 = (zzhk) this.zza;
        zzhk zzhkVar4 = (zzhk) this.zze;
        tue.b(obj);
        zzhkVar2 = zzhkVar3;
        zzhkVar = zzhkVar4;
        this.zze = zzhkVar;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar2, this);
    }
}
