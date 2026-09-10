package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import gd.c;
import gd.g;
import java.util.LinkedHashMap;
import java.util.Map;
import jd.a;
import kotlin.jvm.internal.i;
import v7.t7;
import zd.d2;
import zd.e0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        this.zzi = t7.a(zzlm.zza);
        this.zzj = t7.a(zzln.zza);
        this.zzk = t7.a(zzlo.zza);
        this.zzl = t7.a(zzlp.zza);
        this.zzm = t7.a(zzlq.zza);
        this.zzn = t7.a(zzlr.zza);
        this.zzo = t7.a(zzls.zza);
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

    public static final /* synthetic */ Object zzu(zzly zzlyVar, id.c cVar) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(hd.g.n(zzxnVar.zzQ()));
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
    public final Object zza(String str, id.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, id.c cVar) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzc(zzcg zzcgVar, id.c cVar) {
        i.a(zzcgVar.zza(), zzcd.zzb);
        return gd.i.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, id.c cVar) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zze(String str, long j3, Exception exc, id.c cVar) {
        exc.getMessage();
        s sVar = (s) this.zzd.remove(str);
        if (sVar != null) {
            ((t) sVar).L(exc);
        }
        return gd.i.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, id.c cVar) {
        return ((exc instanceof d2) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
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

    public final Object zzv(id.c cVar) {
        return e0.w(zzD().zzb().c(), new zzma((zzmb) ((g) this.zzi).a(), zzC(), null), cVar);
    }

    public final Object zzw(id.c cVar) {
        Object w10 = e0.w(zzD().zzb().c(), new zzlf(this, null), cVar);
        return w10 == a.a ? w10 : gd.i.a;
    }

    public final s zzz() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}
