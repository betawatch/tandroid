package com.google.android.recaptcha.internal;

import android.webkit.WebView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzlg extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlg(zzly zzlyVar, zzhk zzhkVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzlyVar;
        this.zzd = zzhkVar;
        this.zze = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzlg(this.zzc, this.zzd, this.zze, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlg) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
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
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzly zzlyVar = this.zzc;
            this.zzb = 1;
            obj = zzlyVar.zzv(this);
        } else if (i == 1) {
            tue.b(obj);
        } else {
            if (i != 2) {
                tue.b(obj);
                return g7c.a;
            }
            zzhkVar = (zzhk) this.zza;
            tue.b(obj);
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
