package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import g7.x5;
import hd.e2;
import hd.f0;
import hd.s;
import hd.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import oc.c;
import oc.g;
import rc.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = zzby.zza;
        this.zzi = x5.a(zzlm.zza);
        this.zzj = x5.a(zzln.zza);
        this.zzk = x5.a(zzlo.zza);
        this.zzl = x5.a(zzlp.zza);
        this.zzm = x5.a(zzlq.zza);
        this.zzn = x5.a(zzlr.zza);
        this.zzo = x5.a(zzls.zza);
    }

    private final Application zzC() {
        return (Application) ((g) this.zzm).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcr zzD() {
        return (zzcr) ((g) this.zzn).a();
    }

    public static final /* synthetic */ zzcy zzm(zzly zzlyVar) {
        return (zzcy) ((g) zzlyVar.zzj).a();
    }

    public static final /* synthetic */ zzgs zzo(zzly zzlyVar) {
        return (zzgs) ((g) zzlyVar.zzo).a();
    }

    public static final /* synthetic */ zzib zzp(zzly zzlyVar) {
        return (zzib) ((g) zzlyVar.zzl).a();
    }

    public static final /* synthetic */ zzig zzq(zzly zzlyVar) {
        return (zzig) ((g) zzlyVar.zzk).a();
    }

    public static final /* synthetic */ Object zzu(zzly zzlyVar, qc.c cVar) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(pc.g.n(zzxnVar.zzQ()));
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
    public final Object zza(String str, qc.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, qc.c cVar) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzc(zzcg zzcgVar, qc.c cVar) {
        i.a(zzcgVar.zza(), zzcd.zzb);
        return oc.i.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, qc.c cVar) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zze(String str, long j10, Exception exc, qc.c cVar) {
        exc.getMessage();
        s sVar = (s) this.zzd.remove(str);
        if (sVar != null) {
            ((t) sVar).L(exc);
        }
        return oc.i.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, qc.c cVar) {
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

    public final Object zzv(qc.c cVar) {
        return f0.w(zzD().zzb().c(), new zzma((zzmb) ((g) this.zzi).a(), zzC(), null), cVar);
    }

    public final Object zzw(qc.c cVar) {
        Object w8 = f0.w(zzD().zzb().c(), new zzlf(this, null), cVar);
        return w8 == a.a ? w8 : oc.i.a;
    }

    public final s zzz() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}
