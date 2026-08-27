package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import h7.j6;
import id.e2;
import id.f0;
import id.s;
import id.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import pc.c;
import pc.g;
import pc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        this.zzi = j6.a(zzlm.zza);
        this.zzj = j6.a(zzln.zza);
        this.zzk = j6.a(zzlo.zza);
        this.zzl = j6.a(zzlp.zza);
        this.zzm = j6.a(zzlq.zza);
        this.zzn = j6.a(zzlr.zza);
        this.zzo = j6.a(zzls.zza);
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

    public static final /* synthetic */ Object zzu(zzly zzlyVar, rc.c cVar) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(qc.g.n(zzxnVar.zzQ()));
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
    public final Object zza(String str, rc.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, rc.c cVar) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzc(zzcg zzcgVar, rc.c cVar) {
        j.a(zzcgVar.zza(), zzcd.zzb);
        return i.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, rc.c cVar) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zze(String str, long j10, Exception exc, rc.c cVar) {
        exc.getMessage();
        s sVar = (s) this.zzd.remove(str);
        if (sVar != null) {
            ((t) sVar).L(exc);
        }
        return i.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, rc.c cVar) {
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

    public final Object zzv(rc.c cVar) {
        return f0.w(zzD().zzb().c(), new zzma((zzmb) ((g) this.zzi).a(), zzC(), null), cVar);
    }

    public final Object zzw(rc.c cVar) {
        Object w10 = f0.w(zzD().zzb().c(), new zzlf(this, null), cVar);
        return w10 == sc.a.a ? w10 : i.a;
    }

    public final s zzz() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}
