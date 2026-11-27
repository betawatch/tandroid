package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzly extends zzg {
    public up2 zza;
    public zzik zzb;
    private zzxn zze;
    private final h26 zzi;
    private final h26 zzj;
    private final h26 zzk;
    private final h26 zzl;
    private final h26 zzm;
    private final h26 zzn;
    private final h26 zzo;
    private final Map zzc = zzlz.zza();
    private final Map zzd = new LinkedHashMap();
    private final zzdj zzf = new zzdj(zzmc.zza);
    private final zzmf zzg = zzmf.zzc();
    private final zzld zzh = new zzld(this);

    public zzly() {
        int i = zzby.zza;
        this.zzi = ure.b(zzlm.zza);
        this.zzj = ure.b(zzln.zza);
        this.zzk = ure.b(zzlo.zza);
        this.zzl = ure.b(zzlp.zza);
        this.zzm = ure.b(zzlq.zza);
        this.zzn = ure.b(zzlr.zza);
        this.zzo = ure.b(zzls.zza);
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

    public static final /* synthetic */ Object zzu(zzly zzlyVar, zw2 zw2Var) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(sl2.l(zzxnVar.zzQ()));
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
    public final Object zza(String str, zw2 zw2Var) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, zw2 zw2Var) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzc(zzcg zzcgVar, zw2 zw2Var) {
        ur5.a(zzcgVar.zza(), zzcd.zzb);
        return f9c.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, zw2 zw2Var) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zze(String str, long j, Exception exc, zw2 zw2Var) {
        exc.getMessage();
        up2 up2Var = (up2) this.zzd.remove(str);
        if (up2Var != null) {
            ((vp2) up2Var).P(exc);
        }
        return f9c.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, zw2 zw2Var) {
        return ((exc instanceof msb) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
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

    public final Object zzv(zw2 zw2Var) {
        return fud.c(zzD().zzb().c(), new zzma((zzmb) this.zzi.getValue(), zzC(), null), zw2Var);
    }

    public final Object zzw(zw2 zw2Var) {
        Object c = fud.c(zzD().zzb().c(), new zzlf(this, null), zw2Var);
        return c == vx2.a ? c : f9c.a;
    }

    public final up2 zzz() {
        up2 up2Var = this.zza;
        if (up2Var != null) {
            return up2Var;
        }
        return null;
    }
}
