package com.google.android.recaptcha.internal;

import af.b;
import android.webkit.WebView;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzlf extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlf(zzly zzlyVar, c cVar) {
        super(2, cVar);
        this.zzc = zzlyVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzlf(this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlf) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzle(r6.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        return gd.k.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        r1 = r6.zzc;
        ((android.webkit.WebView) r7).addJavascriptInterface(r1.zzr(), "RN");
        r6.zzb = 4;
        r7 = r1.zzv(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0079, code lost:
    
        return r0;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zzb;
        if (i7 == 0) {
            b.c(obj);
            zzly zzlyVar = this.zzc;
            this.zzb = 1;
            obj = zzlyVar.zzv(this);
        } else if (i7 == 1) {
            b.c(obj);
        } else if (i7 != 2) {
            b.c(obj);
        } else {
            b.c(obj);
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
