package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzlt extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzly zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlt(zzhk zzhkVar, zzly zzlyVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzhkVar;
        this.zzd = zzlyVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzlt(this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlt) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r0, (com.google.android.recaptcha.internal.zzhf) r6, r5) != r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r6 != r3) goto L9;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzhkVar = this.zzc;
            zzly zzlyVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhf(42, new zzlx(zzlyVar, null), null);
        } else {
            if (i != 1) {
                qse.b(obj);
                return g5c.a;
            }
            zzhkVar = (zzhk) this.zza;
            qse.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
