package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzbn extends eeb implements fs4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(zzbo zzboVar, px2 px2Var) {
        super(2, px2Var);
        this.zzd = zzboVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzbn zzbnVar = new zzbn(this.zzd, px2Var);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r6 != r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3 A[RETURN] */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        oj7 oj7Var;
        Object obj2;
        zzbp zzbpVar;
        zzhk zzhkVar2;
        int i = this.zzc;
        g7c g7cVar = g7c.a;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzhkVar = (zzhk) this.zze;
                zzboVar = this.zzd;
                oj7Var = zzboVar.zzf;
                this.zze = zzhkVar;
                this.zza = oj7Var;
                this.zzb = zzboVar;
                this.zzc = 1;
                qj7 qj7Var = (qj7) oj7Var;
                Object d = qj7Var.d(this);
                obj2 = qj7Var;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        tue.b(obj);
                        return g7cVar;
                    }
                    zzhkVar2 = (zzhk) this.zze;
                    tue.b(obj);
                    this.zze = null;
                    this.zzc = 3;
                    return ((zzhg) obj).zza(zzhkVar2, this) == ly2Var ? g7cVar : ly2Var;
                }
                zzboVar = (zzbo) this.zzb;
                Object obj3 = (oj7) this.zza;
                zzhk zzhkVar3 = (zzhk) this.zze;
                tue.b(obj);
                zzhkVar = zzhkVar3;
                obj2 = obj3;
            }
            zzbpVar = zzboVar.zzc;
            if (!rr5.a(zzbpVar, zzbp.zza)) {
                return g7cVar;
            }
            zzboVar.zzc = zzbp.zzb;
            ((qj7) obj2).f(null);
            zzbo zzboVar2 = this.zzd;
            zzboVar2.zza = kud.a();
            srd.b(zzbo.zzb(zzboVar2).zzc(), new zzbm(zzhkVar, zzboVar2, null));
            this.zze = zzhkVar;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzhg zzhgVar = new zzhg(new zzbj(zzboVar2, null));
            if (zzhgVar != ly2Var) {
                zzhkVar2 = zzhkVar;
                obj = zzhgVar;
                this.zze = null;
                this.zzc = 3;
                if (((zzhg) obj).zza(zzhkVar2, this) == ly2Var) {
                }
            }
        } finally {
            ((qj7) obj2).f(null);
        }
    }
}
