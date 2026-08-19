package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzbo {
    public CompletableDeferred zza;
    private final Lazy zzb;
    private zzbp zzc;
    private final Lazy zzd;
    private long zze;
    private final Mutex zzf;
    private boolean zzg;

    public zzbo() {
        this(28800000L);
    }

    public static final /* synthetic */ zzcr zzb(zzbo zzboVar) {
        return (zzcr) zzboVar.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Continuation continuation) {
        zzbc zzbcVar;
        int i;
        if (continuation instanceof zzbc) {
            zzbcVar = (zzbc) continuation;
            int i2 = zzbcVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzbcVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzbcVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzbcVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                Deferred zza = zzdf.zza(((StandardIntegrityManager) this.zzd.getValue()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
                zzbcVar.zzc = 1;
                Object await = zza.await(zzbcVar);
                return await == coroutine_suspended ? coroutine_suspended : await;
            }
        }
        zzbcVar = new zzbc(this, continuation);
        Object obj2 = zzbcVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzbcVar.zzc;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(String str, Continuation continuation) {
        zzbg zzbgVar;
        int i;
        if (continuation instanceof zzbg) {
            zzbgVar = (zzbg) continuation;
            int i2 = zzbgVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzbgVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzbgVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzbgVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred zzf = zzf();
                    zzbgVar.zzd = str;
                    zzbgVar.zzc = 1;
                    obj = zzf.await(zzbgVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzbgVar.zzd;
                    ResultKt.throwOnFailure(obj);
                }
                Deferred zza = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzbgVar.zzd = null;
                zzbgVar.zzc = 2;
                obj = zza.await(zzbgVar);
            }
        }
        zzbgVar = new zzbg(this, continuation);
        Object obj2 = zzbgVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzbgVar.zzc;
        if (i != 0) {
        }
        Deferred zza2 = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzbgVar.zzd = null;
        zzbgVar.zzc = 2;
        obj2 = zza2.await(zzbgVar);
    }

    public final Object zze(Continuation continuation) {
        return new zzhg(new zzbn(this, null));
    }

    public final CompletableDeferred zzf() {
        CompletableDeferred completableDeferred = this.zza;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }

    public final void zzj(long j) {
        this.zze = j;
    }

    public zzbo(long j) {
        int i = zzby.zza;
        this.zzb = LazyKt.lazy(zzbk.zza);
        this.zzc = zzbp.zza;
        this.zzd = LazyKt.lazy(zzbl.zza);
        this.zzf = MutexKt.Mutex$default(false, 1, null);
    }
}
