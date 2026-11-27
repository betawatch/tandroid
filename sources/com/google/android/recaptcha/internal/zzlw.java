package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzlw extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlw(zzly zzlyVar, zzgr zzgrVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = zzlyVar;
        this.zzd = zzgrVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzlw(this.zzc, this.zzd, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (e0f.a(20000, r12, r11) != r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r12.zzw(r11) != r3) goto L14;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zzb;
        vx2 vx2Var = vx2.a;
        try {
            if (i == 0) {
                ixe.b(obj);
                zzly zzlyVar = this.zzc;
                this.zzb = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ixe.b(obj);
                        return f9c.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zza;
                    ixe.b(obj);
                    throw zzcgVar;
                }
                ixe.b(obj);
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
            if (zzn.zzc(zzmcVar, this) != vx2Var) {
                throw zza;
            }
        }
    }
}
