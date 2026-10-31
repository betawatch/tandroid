package com.google.android.recaptcha.internal;

import ad.c;
import ad.h;
import ad.j;
import android.app.Application;
import android.webkit.WebView;
import bd.i;
import ib.a;
import java.util.LinkedHashMap;
import java.util.Map;
import td.e0;
import td.e2;
import td.s;
import td.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzly extends zzg {
    public s zza;
    public zzik zzb;
    private zzxn zze;
    private final c zzi;
    private final c zzj;
    private final c zzk;
    private final c zzl;
    private final c zzm;
    private final c zzn;
    private final c zzo;
    private final Map zzc = zzlz.zza();
    private final Map zzd = new LinkedHashMap();
    private final zzdj zzf = new zzdj(zzmc.zza);
    private final zzmf zzg = zzmf.zzc();
    private final zzld zzh = new zzld(this);

    public zzly() {
        int i10 = zzby.zza;
        this.zzi = a.a(zzlm.zza);
        this.zzj = a.a(zzln.zza);
        this.zzk = a.a(zzlo.zza);
        this.zzl = a.a(zzlp.zza);
        this.zzm = a.a(zzlq.zza);
        this.zzn = a.a(zzlr.zza);
        this.zzo = a.a(zzls.zza);
    }

    private final Application zzC() {
        return (Application) ((h) this.zzm).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcr zzD() {
        return (zzcr) ((h) this.zzn).a();
    }

    public static final /* synthetic */ zzcy zzm(zzly zzlyVar) {
        return (zzcy) ((h) zzlyVar.zzj).a();
    }

    public static final /* synthetic */ zzgs zzo(zzly zzlyVar) {
        return (zzgs) ((h) zzlyVar.zzo).a();
    }

    public static final /* synthetic */ zzib zzp(zzly zzlyVar) {
        return (zzib) ((h) zzlyVar.zzl).a();
    }

    public static final /* synthetic */ zzig zzq(zzly zzlyVar) {
        return (zzig) ((h) zzlyVar.zzk).a();
    }

    public static final /* synthetic */ Object zzu(zzly zzlyVar, cd.c cVar) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(i.n(zzxnVar.zzQ()));
        zzjb zzjbVar = new zzjb(zzisVar, zzdoVar, new zzct());
        zzkv zzkvVar = new zzkv(zzkuVar, new zzks());
        zzjbVar.zze(3, zzC());
        zzjbVar.zze(5, zzlb.class.getMethod("cs", new Object[0].getClass()));
        zzjbVar.zze(6, new zzkw(zzC()));
        zzjbVar.zze(7, new zzky());
        zzjbVar.zze(8, new zzlc(zzC()));
        zzjbVar.zze(9, new zzkz(zzC()));
        zzjbVar.zze(10, new zzkx(zzC()));
        return new zzip(zzD().zzd(), zzjbVar, zzkvVar, zzij.zza());
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, cd.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, cd.c cVar) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzc(zzcg zzcgVar, cd.c cVar) {
        kotlin.jvm.internal.i.a(zzcgVar.zza(), zzcd.zzb);
        return j.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, cd.c cVar) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zze(String str, long j10, Exception exc, cd.c cVar) {
        exc.getMessage();
        s sVar = (s) this.zzd.remove(str);
        if (sVar != null) {
            ((t) sVar).L(exc);
        }
        return j.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, cd.c cVar) {
        return ((exc instanceof e2) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzj() {
        return 33;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzk() {
        return 32;
    }

    public final zzdj zzn() {
        return this.zzf;
    }

    public final zzld zzr() {
        return this.zzh;
    }

    public final Object zzv(cd.c cVar) {
        return e0.w(zzD().zzb().c(), new zzma((zzmb) ((h) this.zzi).a(), zzC(), null), cVar);
    }

    public final Object zzw(cd.c cVar) {
        Object w9 = e0.w(zzD().zzb().c(), new zzlf(this, null), cVar);
        return w9 == dd.a.a ? w9 : j.a;
    }

    public final s zzz() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}
