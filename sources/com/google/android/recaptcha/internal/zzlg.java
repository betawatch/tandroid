package com.google.android.recaptcha.internal;

import a8.jd;
import android.webkit.WebView;
import ce.c0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzlg extends i implements p {
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzlg(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlg) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
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
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zzb;
        if (i10 == 0) {
            jd.b(obj);
            zzly zzlyVar = this.zzc;
            this.zzb = 1;
            obj = zzlyVar.zzv(this);
        } else if (i10 == 1) {
            jd.b(obj);
        } else {
            if (i10 != 2) {
                jd.b(obj);
                return jd.i.a;
            }
            zzhkVar = (zzhk) this.zza;
            jd.b(obj);
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
