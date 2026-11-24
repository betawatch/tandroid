package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzlf extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlf(zzly zzlyVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzlyVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzlf(this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlf) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzle(r6.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        return g5c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 != r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r7 != r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r7 != r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        r0 = r6.zzc;
        ((android.webkit.WebView) r7).addJavascriptInterface(r0.zzr(), "RN");
        r6.zzb = 4;
        r7 = r0.zzv(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r7 == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0078, code lost:
    
        return r5;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzly zzlyVar = this.zzc;
            this.zzb = 1;
            obj = zzlyVar.zzv(this);
        } else if (i == 1) {
            qse.b(obj);
        } else if (i != 2) {
            qse.b(obj);
        } else {
            qse.b(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzly zzlyVar2 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzlyVar2.zzv(this);
        }
        ((WebView) obj).removeJavascriptInterface("RN");
        zzly zzlyVar3 = this.zzc;
        this.zza = zzlyVar3;
        this.zzb = 2;
        obj = zzlyVar3.zzv(this);
    }
}
