package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzlh extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlh(zzly zzlyVar, zzxn zzxnVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = zzlyVar;
        this.zzd = zzxnVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, zw2Var);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r7 != r3) goto L17;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        int i = this.zzb;
        vx2 vx2Var = vx2.a;
        try {
        } catch (zzcg e) {
            ((vp2) this.zzc.zzz()).P(e);
        }
        if (i == 0) {
            ixe.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzib zzp = zzly.zzp(this.zzc);
            zzxn zzxnVar = this.zzd;
            this.zze = zzhkVar;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzp.zzc(zzxnVar, this);
            if (obj != vx2Var) {
                zzhkVar2 = zzhkVar;
            }
            return vx2Var;
        }
        if (i != 1) {
            zzhkVar = (zzhk) this.zze;
            ixe.b(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            fud.b(zzD.zzb(), new zzlg(zzlyVar, zzhkVar, (String) obj, null));
            return f9c.a;
        }
        zzhk zzhkVar3 = (zzhk) this.zza;
        zzhk zzhkVar4 = (zzhk) this.zze;
        ixe.b(obj);
        zzhkVar2 = zzhkVar3;
        zzhkVar = zzhkVar4;
        this.zze = zzhkVar;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar2, this);
    }
}
