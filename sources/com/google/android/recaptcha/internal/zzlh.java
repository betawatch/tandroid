package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzlh extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlh(zzly zzlyVar, zzxn zzxnVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzlyVar;
        this.zzd = zzxnVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, fw2Var);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r7 != r3) goto L17;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        try {
        } catch (zzcg e) {
            ((cp2) this.zzc.zzz()).P(e);
        }
        if (i == 0) {
            qse.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzib zzp = zzly.zzp(this.zzc);
            zzxn zzxnVar = this.zzd;
            this.zze = zzhkVar;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzp.zzc(zzxnVar, this);
            if (obj != bx2Var) {
                zzhkVar2 = zzhkVar;
            }
            return bx2Var;
        }
        if (i != 1) {
            zzhkVar = (zzhk) this.zze;
            qse.b(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            ppd.b(zzD.zzb(), new zzlg(zzlyVar, zzhkVar, (String) obj, null));
            return g5c.a;
        }
        zzhk zzhkVar3 = (zzhk) this.zza;
        zzhk zzhkVar4 = (zzhk) this.zze;
        qse.b(obj);
        zzhkVar2 = zzhkVar3;
        zzhkVar = zzhkVar4;
        this.zze = zzhkVar;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar2, this);
    }
}
