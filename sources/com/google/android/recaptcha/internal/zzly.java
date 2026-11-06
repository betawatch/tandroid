package com.google.android.recaptcha.internal;

import a8.ab;
import android.app.Application;
import android.webkit.WebView;
import gd.c;
import gd.k;
import hd.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import zd.b0;
import zd.s;
import zd.t;
import zd.x1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        int i7 = zzby.zza;
        this.zzi = ab.b(zzlm.zza);
        this.zzj = ab.b(zzln.zza);
        this.zzk = ab.b(zzlo.zza);
        this.zzl = ab.b(zzlp.zza);
        this.zzm = ab.b(zzlq.zza);
        this.zzn = ab.b(zzlr.zza);
        this.zzo = ab.b(zzls.zza);
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

    public static final /* synthetic */ Object zzu(zzly zzlyVar, id.c cVar) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(f.m(zzxnVar.zzQ()));
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
        j.a(zzcgVar.zza(), zzcd.zzb);
        return k.a;
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
            ((t) sVar).Q(exc);
        }
        return k.a;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzf(Exception exc, id.c cVar) {
        return ((exc instanceof x1) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
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
        return b0.y(zzD().zzb().c(), new zzma((zzmb) this.zzi.getValue(), zzC(), null), cVar);
    }

    public final Object zzw(id.c cVar) {
        Object y10 = b0.y(zzD().zzb().c(), new zzlf(this, null), cVar);
        return y10 == jd.a.a ? y10 : k.a;
    }

    public final s zzz() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}
