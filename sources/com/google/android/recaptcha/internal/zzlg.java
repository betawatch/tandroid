package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzlg extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlg(zzly zzlyVar, zzhk zzhkVar, String str, c cVar) {
        super(2, cVar);
        this.zzc = zzlyVar;
        this.zzd = zzhkVar;
        this.zze = str;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzlg(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlg) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r6 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r6 != r0) goto L11;
     */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            b.b(obj);
            zzly zzlyVar = this.zzc;
            this.zzb = 1;
            obj = zzlyVar.zzv(this);
        } else if (i10 == 1) {
            b.b(obj);
        } else {
            if (i10 != 2) {
                b.b(obj);
                return ad.j.a;
            }
            zzhkVar = (zzhk) this.zza;
            b.b(obj);
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
