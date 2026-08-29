package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import bd.p;
import i7.c7;
import jd.t;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzli extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzli(zzly zzlyVar, String str, c cVar) {
        super(2, cVar);
        this.zzc = zzlyVar;
        this.zzd = str;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzli(this.zzc, this.zzd, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        String zza;
        tc.a aVar = tc.a.a;
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                c7.b(obj);
                zza = str;
            } else {
                c7.b(obj);
                zzly zzlyVar = this.zzc;
                zza = zzly.zzm(zzlyVar).zza();
                this.zza = zza;
                this.zzb = 1;
                obj = zzlyVar.zzv(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((WebView) obj).loadDataWithBaseURL(zza, this.zzd, "text/html", "utf-8", null);
            return qc.i.a;
        } catch (Exception e10) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e10.getMessage(), null, 8, null);
            ((t) this.zzc.zzz()).L(zzcgVar);
            throw zzcgVar;
        }
    }
}
