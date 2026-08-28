package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import g7.x5;
import g7.y5;
import hd.i0;
import hd.s;
import hd.t;
import oc.c;
import oc.g;
import org.telegram.tgnet.TLObject;
import qd.a;
import qd.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzbo {
    public s zza;
    private final c zzb;
    private zzbp zzc;
    private final c zzd;
    private long zze;
    private final a zzf;
    private boolean zzg;

    public zzbo() {
        this(28800000L);
    }

    public static final /* synthetic */ zzcr zzb(zzbo zzboVar) {
        return (zzcr) ((g) zzboVar.zzb).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(qc.c cVar) {
        zzbc zzbcVar;
        int i9;
        if (cVar instanceof zzbc) {
            zzbcVar = (zzbc) cVar;
            int i10 = zzbcVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzbcVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzbcVar.zza;
                rc.a aVar = rc.a.a;
                i9 = zzbcVar.zzc;
                if (i9 == 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                    return obj;
                }
                y5.b(obj);
                i0 zza = zzdf.zza(((StandardIntegrityManager) ((g) this.zzd).a()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
                zzbcVar.zzc = 1;
                Object await = zza.await(zzbcVar);
                return await == aVar ? aVar : await;
            }
        }
        zzbcVar = new zzbc(this, cVar);
        Object obj2 = zzbcVar.zza;
        rc.a aVar2 = rc.a.a;
        i9 = zzbcVar.zzc;
        if (i9 == 0) {
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(String str, qc.c cVar) {
        zzbg zzbgVar;
        int i9;
        if (cVar instanceof zzbg) {
            zzbgVar = (zzbg) cVar;
            int i10 = zzbgVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzbgVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzbgVar.zza;
                rc.a aVar = rc.a.a;
                i9 = zzbgVar.zzc;
                if (i9 != 0) {
                    y5.b(obj);
                    s zzf = zzf();
                    zzbgVar.zzd = str;
                    zzbgVar.zzc = 1;
                    obj = ((t) zzf).h(zzbgVar);
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.b(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzbgVar.zzd;
                    y5.b(obj);
                }
                i0 zza = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzbgVar.zzd = null;
                zzbgVar.zzc = 2;
                obj = zza.await(zzbgVar);
            }
        }
        zzbgVar = new zzbg(this, cVar);
        Object obj2 = zzbgVar.zza;
        rc.a aVar2 = rc.a.a;
        i9 = zzbgVar.zzc;
        if (i9 != 0) {
        }
        i0 zza2 = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzbgVar.zzd = null;
        zzbgVar.zzc = 2;
        obj2 = zza2.await(zzbgVar);
    }

    public final Object zze(qc.c cVar) {
        return new zzhg(new zzbn(this, null));
    }

    public final s zzf() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    public final void zzj(long j10) {
        this.zze = j10;
    }

    public zzbo(long j10) {
        int i9 = zzby.zza;
        this.zzb = x5.a(zzbk.zza);
        this.zzc = zzbp.zza;
        this.zzd = x5.a(zzbl.zza);
        this.zzf = e.a();
    }
}
