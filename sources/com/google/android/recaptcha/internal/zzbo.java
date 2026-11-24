package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzbo {
    public mq2 zza;
    private final d26 zzb;
    private zzbp zzc;
    private final d26 zzd;
    private long zze;
    private final oj7 zzf;
    private boolean zzg;

    public zzbo(long j) {
        int i = zzby.zza;
        this.zzb = fpe.b(zzbk.zza);
        this.zzc = zzbp.zza;
        this.zzd = fpe.b(zzbl.zza);
        this.zzf = new qj7();
    }

    public static final /* synthetic */ zzcr zzb(zzbo zzboVar) {
        return (zzcr) zzboVar.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(px2 px2Var) {
        zzbc zzbcVar;
        int i;
        if (px2Var instanceof zzbc) {
            zzbcVar = (zzbc) px2Var;
            int i2 = zzbcVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzbcVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzbcVar.zza;
                i = zzbcVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                le3 zza = zzdf.zza(((StandardIntegrityManager) this.zzd.getValue()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
                zzbcVar.zzc = 1;
                Object await = zza.await(zzbcVar);
                ly2 ly2Var = ly2.a;
                return await == ly2Var ? ly2Var : await;
            }
        }
        zzbcVar = new zzbc(this, px2Var);
        Object obj2 = zzbcVar.zza;
        i = zzbcVar.zzc;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r8 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r8 != r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(String str, px2 px2Var) {
        zzbg zzbgVar;
        int i;
        if (px2Var instanceof zzbg) {
            zzbgVar = (zzbg) px2Var;
            int i2 = zzbgVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzbgVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzbgVar.zza;
                i = zzbgVar.zzc;
                ly2 ly2Var = ly2.a;
                if (i != 0) {
                    tue.b(obj);
                    mq2 zzf = zzf();
                    zzbgVar.zzd = str;
                    zzbgVar.zzc = 1;
                    obj = ((nq2) zzf).h(zzbgVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            tue.b(obj);
                            return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                        }
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = zzbgVar.zzd;
                    tue.b(obj);
                }
                le3 zza = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzbgVar.zzd = null;
                zzbgVar.zzc = 2;
                obj = zza.await(zzbgVar);
            }
        }
        zzbgVar = new zzbg(this, px2Var);
        Object obj2 = zzbgVar.zza;
        i = zzbgVar.zzc;
        ly2 ly2Var2 = ly2.a;
        if (i != 0) {
        }
        le3 zza2 = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzbgVar.zzd = null;
        zzbgVar.zzc = 2;
        obj2 = zza2.await(zzbgVar);
    }

    public final Object zze(px2 px2Var) {
        return new zzhg(new zzbn(this, null));
    }

    public final mq2 zzf() {
        mq2 mq2Var = this.zza;
        if (mq2Var != null) {
            return mq2Var;
        }
        return null;
    }

    public final void zzj(long j) {
        this.zze = j;
    }

    public zzbo() {
        this(28800000L);
    }
}
