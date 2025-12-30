package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class zzly extends zzg {
    public CompletableDeferred zza;
    public zzik zzb;
    private zzxn zze;
    private final Lazy zzi;
    private final Lazy zzj;
    private final Lazy zzk;
    private final Lazy zzl;
    private final Lazy zzm;
    private final Lazy zzn;
    private final Lazy zzo;
    private final Map zzc = zzlz.zza();
    private final Map zzd = new LinkedHashMap();
    private final zzdj zzf = new zzdj(zzmc.zza);
    private final zzmf zzg = zzmf.zzc();
    private final zzld zzh = new zzld(this);

    public zzly() {
        int i = zzby.zza;
        this.zzi = LazyKt.lazy(zzlm.zza);
        this.zzj = LazyKt.lazy(zzln.zza);
        this.zzk = LazyKt.lazy(zzlo.zza);
        this.zzl = LazyKt.lazy(zzlp.zza);
        this.zzm = LazyKt.lazy(zzlq.zza);
        this.zzn = LazyKt.lazy(zzlr.zza);
        this.zzo = LazyKt.lazy(zzls.zza);
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

    public static final /* synthetic */ Object zzu(zzly zzlyVar, Continuation continuation) {
        return new zzhg(new zzlu(zzlyVar, null));
    }

    public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
        zzis zzisVar = new zzis(webView, zzD().zzb());
        zzku zzkuVar = new zzku();
        zzkuVar.zzb(CollectionsKt.toLongArray(zzxnVar.zzQ()));
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
    protected final Object zza(String str, Continuation continuation) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zzb(String str, Continuation continuation) {
        return new zzhg(new zzlk(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zzc(zzcg zzcgVar, Continuation continuation) {
        Intrinsics.areEqual(zzcgVar.zza(), zzcd.zzb);
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zzd(zzxn zzxnVar, Continuation continuation) {
        return new zzhg(new zzll(zzxnVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zze(String str, long j, Exception exc, Continuation continuation) {
        exc.getMessage();
        CompletableDeferred completableDeferred = (CompletableDeferred) this.zzd.remove(str);
        if (completableDeferred != null) {
            Boxing.boxBoolean(completableDeferred.completeExceptionally(exc));
        }
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final Object zzf(Exception exc, Continuation continuation) {
        return ((exc instanceof TimeoutCancellationException) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final int zzj() {
        return 33;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    protected final int zzk() {
        return 32;
    }

    public final zzdj zzn() {
        return this.zzf;
    }

    public final zzld zzr() {
        return this.zzh;
    }

    public final Object zzv(Continuation continuation) {
        return BuildersKt.withContext(zzD().zzb().getCoroutineContext(), new zzma((zzmb) this.zzi.getValue(), zzC(), null), continuation);
    }

    public final Object zzw(Continuation continuation) {
        Object withContext = BuildersKt.withContext(zzD().zzb().getCoroutineContext(), new zzlf(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final CompletableDeferred zzz() {
        CompletableDeferred completableDeferred = this.zza;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }
}
