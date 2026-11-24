package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzlw extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlw(zzly zzlyVar, zzgr zzgrVar, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzlyVar;
        this.zzd = zzgrVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzlw(this.zzc, this.zzd, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (oxe.a(20000, r12, r11) != r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r12.zzw(r11) != r3) goto L14;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzly zzlyVar = this.zzc;
                this.zzb = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        tue.b(obj);
                        return g7c.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zza;
                    tue.b(obj);
                    throw zzcgVar;
                }
                tue.b(obj);
            }
            zzlv zzlvVar = new zzlv(this.zzc, this.zzd, null);
            this.zzb = 2;
        } catch (Exception e) {
            e.getMessage();
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzV, e.getMessage(), null, 8, null));
            zzdj zzn = this.zzc.zzn();
            zzmc zzmcVar = zzmc.zza;
            this.zza = zza;
            this.zzb = 3;
            if (zzn.zzc(zzmcVar, this) != ly2Var) {
                throw zza;
            }
        }
    }
}
