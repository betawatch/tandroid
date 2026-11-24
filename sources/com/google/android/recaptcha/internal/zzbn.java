package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzbn extends ccb implements eq4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(zzbo zzboVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzd = zzboVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzbn zzbnVar = new zzbn(this.zzd, fw2Var);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r6 != r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3 A[RETURN] */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        lh7 lh7Var;
        Object obj2;
        zzbp zzbpVar;
        zzhk zzhkVar2;
        int i = this.zzc;
        g5c g5cVar = g5c.a;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzhkVar = (zzhk) this.zze;
                zzboVar = this.zzd;
                lh7Var = zzboVar.zzf;
                this.zze = zzhkVar;
                this.zza = lh7Var;
                this.zzb = zzboVar;
                this.zzc = 1;
                nh7 nh7Var = (nh7) lh7Var;
                Object d = nh7Var.d(this);
                obj2 = nh7Var;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        qse.b(obj);
                        return g5cVar;
                    }
                    zzhkVar2 = (zzhk) this.zze;
                    qse.b(obj);
                    this.zze = null;
                    this.zzc = 3;
                    return ((zzhg) obj).zza(zzhkVar2, this) == bx2Var ? g5cVar : bx2Var;
                }
                zzboVar = (zzbo) this.zzb;
                Object obj3 = (lh7) this.zza;
                zzhk zzhkVar3 = (zzhk) this.zze;
                qse.b(obj);
                zzhkVar = zzhkVar3;
                obj2 = obj3;
            }
            zzbpVar = zzboVar.zzc;
            if (!rp5.a(zzbpVar, zzbp.zza)) {
                return g5cVar;
            }
            zzboVar.zzc = zzbp.zzb;
            ((nh7) obj2).f(null);
            zzbo zzboVar2 = this.zzd;
            zzboVar2.zza = hsd.a();
            ppd.b(zzbo.zzb(zzboVar2).zzc(), new zzbm(zzhkVar, zzboVar2, null));
            this.zze = zzhkVar;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzhg zzhgVar = new zzhg(new zzbj(zzboVar2, null));
            if (zzhgVar != bx2Var) {
                zzhkVar2 = zzhkVar;
                obj = zzhgVar;
                this.zze = null;
                this.zzc = 3;
                if (((zzhg) obj).zza(zzhkVar2, this) == bx2Var) {
                }
            }
        } finally {
            ((nh7) obj2).f(null);
        }
    }
}
