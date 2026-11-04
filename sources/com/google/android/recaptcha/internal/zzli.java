package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzli extends j implements p {
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzli(this.zzc, this.zzd, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        String zza;
        gd.a aVar = gd.a.a;
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                ib.b(obj);
                zza = str;
            } else {
                ib.b(obj);
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
            return k.a;
        } catch (Exception e10) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e10.getMessage(), null, 8, null);
            ((t) this.zzc.zzz()).Q(zzcgVar);
            throw zzcgVar;
        }
    }
}
