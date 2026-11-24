package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzlg extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlg(zzly zzlyVar, zzhk zzhkVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzlyVar;
        this.zzd = zzhkVar;
        this.zze = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzlg(this.zzc, this.zzd, this.zze, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlg) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r0, (com.google.android.recaptcha.internal.zzhf) r6, r5) != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r6 != r4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r6 != r4) goto L11;
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
            zzly zzlyVar = this.zzc;
            this.zzb = 1;
            obj = zzlyVar.zzv(this);
        } else if (i == 1) {
            qse.b(obj);
        } else {
            if (i != 2) {
                qse.b(obj);
                return g5c.a;
            }
            zzhkVar = (zzhk) this.zza;
            qse.b(obj);
            this.zza = null;
            this.zzb = 3;
        }
        ((WebView) obj).clearCache(true);
        zzhkVar = this.zzd;
        zzly zzlyVar2 = this.zzc;
        String str = this.zze;
        this.zza = zzhkVar;
        this.zzb = 2;
        obj = new zzhf(26, new zzli(zzlyVar2, str, null), null);
    }
}
