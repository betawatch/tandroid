package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzet extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzfp zzfpVar, String str, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzfpVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, px2Var);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r8 != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r8 != r2) goto L13;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzgrVar = (zzgr) this.zze;
                zzq zzb = zzfp.zzb(this.zzb);
                String str = this.zzc;
                long j = this.zzd;
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzb.zzb(str, j, this);
            } else {
                if (i != 1) {
                    tue.b(obj);
                    return (zzxx) obj;
                }
                zzgrVar = (zzgr) this.zze;
                tue.b(obj);
            }
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
        } catch (zzcg e) {
            throw e;
        } catch (nqb e2) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e3.getMessage(), null, 8, null);
        }
    }
}
