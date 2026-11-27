package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzbo {
    public up2 zza;
    private final h26 zzb;
    private zzbp zzc;
    private final h26 zzd;
    private long zze;
    private final vj7 zzf;
    private boolean zzg;

    public zzbo(long j) {
        int i = zzby.zza;
        this.zzb = ure.b(zzbk.zza);
        this.zzc = zzbp.zza;
        this.zzd = ure.b(zzbl.zza);
        this.zzf = new xj7();
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
    public final Object zzl(zw2 zw2Var) {
        zzbc zzbcVar;
        int i;
        if (zw2Var instanceof zzbc) {
            zzbcVar = (zzbc) zw2Var;
            int i2 = zzbcVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzbcVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzbcVar.zza;
                i = zzbcVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                rd3 zza = zzdf.zza(((StandardIntegrityManager) this.zzd.getValue()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
                zzbcVar.zzc = 1;
                Object await = zza.await(zzbcVar);
                vx2 vx2Var = vx2.a;
                return await == vx2Var ? vx2Var : await;
            }
        }
        zzbcVar = new zzbc(this, zw2Var);
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
    public final Object zzm(String str, zw2 zw2Var) {
        zzbg zzbgVar;
        int i;
        if (zw2Var instanceof zzbg) {
            zzbgVar = (zzbg) zw2Var;
            int i2 = zzbgVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzbgVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzbgVar.zza;
                i = zzbgVar.zzc;
                vx2 vx2Var = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    up2 zzf = zzf();
                    zzbgVar.zzd = str;
                    zzbgVar.zzc = 1;
                    obj = ((vp2) zzf).h(zzbgVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ixe.b(obj);
                            return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                        }
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = zzbgVar.zzd;
                    ixe.b(obj);
                }
                rd3 zza = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzbgVar.zzd = null;
                zzbgVar.zzc = 2;
                obj = zza.await(zzbgVar);
            }
        }
        zzbgVar = new zzbg(this, zw2Var);
        Object obj2 = zzbgVar.zza;
        i = zzbgVar.zzc;
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
        rd3 zza2 = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzbgVar.zzd = null;
        zzbgVar.zzc = 2;
        obj2 = zza2.await(zzbgVar);
    }

    public final Object zze(zw2 zw2Var) {
        return new zzhg(new zzbn(this, null));
    }

    public final up2 zzf() {
        up2 up2Var = this.zza;
        if (up2Var != null) {
            return up2Var;
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
