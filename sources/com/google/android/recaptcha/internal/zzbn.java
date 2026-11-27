package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzbn extends yfb implements is4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(zzbo zzboVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzd = zzboVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzbn zzbnVar = new zzbn(this.zzd, zw2Var);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r6 != r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3 A[RETURN] */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        vj7 vj7Var;
        Object obj2;
        zzbp zzbpVar;
        zzhk zzhkVar2;
        int i = this.zzc;
        g9c g9cVar = g9c.a;
        vx2 vx2Var = vx2.a;
        try {
            if (i == 0) {
                ixe.b(obj);
                zzhkVar = (zzhk) this.zze;
                zzboVar = this.zzd;
                vj7Var = zzboVar.zzf;
                this.zze = zzhkVar;
                this.zza = vj7Var;
                this.zzb = zzboVar;
                this.zzc = 1;
                xj7 xj7Var = (xj7) vj7Var;
                Object d = xj7Var.d(this);
                obj2 = xj7Var;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ixe.b(obj);
                        return g9cVar;
                    }
                    zzhkVar2 = (zzhk) this.zze;
                    ixe.b(obj);
                    this.zze = null;
                    this.zzc = 3;
                    return ((zzhg) obj).zza(zzhkVar2, this) == vx2Var ? g9cVar : vx2Var;
                }
                zzboVar = (zzbo) this.zzb;
                Object obj3 = (vj7) this.zza;
                zzhk zzhkVar3 = (zzhk) this.zze;
                ixe.b(obj);
                zzhkVar = zzhkVar3;
                obj2 = obj3;
            }
            zzbpVar = zzboVar.zzc;
            if (!ur5.a(zzbpVar, zzbp.zza)) {
                return g9cVar;
            }
            zzboVar.zzc = zzbp.zzb;
            ((xj7) obj2).f(null);
            zzbo zzboVar2 = this.zzd;
            zzboVar2.zza = xwd.a();
            fud.b(zzbo.zzb(zzboVar2).zzc(), new zzbm(zzhkVar, zzboVar2, null));
            this.zze = zzhkVar;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzhg zzhgVar = new zzhg(new zzbj(zzboVar2, null));
            if (zzhgVar != vx2Var) {
                zzhkVar2 = zzhkVar;
                obj = zzhgVar;
                this.zze = null;
                this.zzc = 3;
                if (((zzhg) obj).zza(zzhkVar2, this) == vx2Var) {
                }
            }
        } finally {
            ((xj7) obj2).f(null);
        }
    }
}
