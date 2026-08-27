package com.google.android.recaptcha.internal;

import ad.p;
import android.webkit.WebView;
import h7.k6;
import id.t;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        return new zzli(this.zzc, this.zzd, cVar);
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        String zza;
        sc.a aVar = sc.a.a;
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                k6.b(obj);
                zza = str;
            } else {
                k6.b(obj);
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
            return pc.i.a;
        } catch (Exception e9) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e9.getMessage(), null, 8, null);
            ((t) this.zzc.zzz()).L(zzcgVar);
            throw zzcgVar;
        }
    }
}
