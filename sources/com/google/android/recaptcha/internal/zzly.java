package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzly extends zzg {
    public mq2 zza;
    public zzik zzb;
    private zzxn zze;
    private final d26 zzi;
    private final d26 zzj;
    private final d26 zzk;
    private final d26 zzl;
    private final d26 zzm;
    private final d26 zzn;
    private final d26 zzo;
    private final Map zzc = zzlz.zza();
    private final Map zzd = new LinkedHashMap();
    private final zzdj zzf = new zzdj(zzmc.zza);
    private final zzmf zzg = zzmf.zzc();
    private final zzld zzh = new zzld(this);

    public zzly() {
        int i = zzby.zza;
        this.zzi = fpe.b(zzlm.zza);
        this.zzj = fpe.b(zzln.zza);
        this.zzk = fpe.b(zzlo.zza);
        this.zzl = fpe.b(zzlp.zza);
        this.zzm = fpe.b(zzlq.zza);
        this.zzn = fpe.b(zzlr.zza);
        this.zzo = fpe.b(zzls.zza);
    }

    private final Application zzC() {
        return (Application) this.zzm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcr zzD() {
        return (zzcr) this.zzn.getValue();
    }

    public static final /* synthetic */ zzcy zzm(zzly zzlyVar) {
        return (zzcy) zzlyVar.zzj.getValue();
    }

    public static final /* synthetic */ zzgs zzo(zzly zzlyVar) {
        return (zzgs) zzlyVar.zzo.getValue();
    }

    public static final /* synthetic */ zzib zzp(zzly zzlyVar) {
        return (zzib) zzlyVar.zzl.getValue();
    }

    public static final /* synthetic */ zzig zzq(zzly zzlyVar) {
        return (zzig) zzlyVar.zzk.getValue();
    }

    public static final /* synthetic */ Object zzu(zzly zzlyVar, px2 px2Var) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(km2.l(zzxnVar.zzQ()));
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
    public final Object zza(String str, px2 px2Var) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, px2 px2Var) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzc(zzcg zzcgVar, px2 px2Var) {
        rr5.a(zzcgVar.zza(), zzcd.zzb);
        return g7c.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, px2 px2Var) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zze(String str, long j, Exception exc, px2 px2Var) {
        exc.getMessage();
        mq2 mq2Var = (mq2) this.zzd.remove(str);
        if (mq2Var != null) {
            ((nq2) mq2Var).P(exc);
        }
        return g7c.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, px2 px2Var) {
        return ((exc instanceof nqb) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
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

    public final Object zzv(px2 px2Var) {
        return srd.c(zzD().zzb().c(), new zzma((zzmb) this.zzi.getValue(), zzC(), null), px2Var);
    }

    public final Object zzw(px2 px2Var) {
        Object c = srd.c(zzD().zzb().c(), new zzlf(this, null), px2Var);
        return c == ly2.a ? c : g7c.a;
    }

    public final mq2 zzz() {
        mq2 mq2Var = this.zza;
        if (mq2Var != null) {
            return mq2Var;
        }
        return null;
    }
}
