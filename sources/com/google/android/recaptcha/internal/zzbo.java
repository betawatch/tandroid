package com.google.android.recaptcha.internal;

import a8.ab;
import af.b;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import gd.c;
import ie.d;
import org.telegram.tgnet.TLObject;
import zd.e0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class zzbo {
    public s zza;
    private final c zzb;
    private zzbp zzc;
    private final c zzd;
    private long zze;
    private final ie.a zzf;
    private boolean zzg;

    public zzbo() {
        this(28800000L);
    }

    public static final /* synthetic */ zzcr zzb(zzbo zzboVar) {
        return (zzcr) zzboVar.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(id.c cVar) {
        zzbc zzbcVar;
        int i7;
        if (cVar instanceof zzbc) {
            zzbcVar = (zzbc) cVar;
            int i10 = zzbcVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzbcVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzbcVar.zza;
                jd.a aVar = jd.a.a;
                i7 = zzbcVar.zzc;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.c(obj);
                    return obj;
                }
                b.c(obj);
                e0 zza = zzdf.zza(((StandardIntegrityManager) this.zzd.getValue()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
                zzbcVar.zzc = 1;
                Object await = zza.await(zzbcVar);
                return await == aVar ? aVar : await;
            }
        }
        zzbcVar = new zzbc(this, cVar);
        Object obj2 = zzbcVar.zza;
        jd.a aVar2 = jd.a.a;
        i7 = zzbcVar.zzc;
        if (i7 == 0) {
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
    public final Object zzm(String str, id.c cVar) {
        zzbg zzbgVar;
        int i7;
        if (cVar instanceof zzbg) {
            zzbgVar = (zzbg) cVar;
            int i10 = zzbgVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzbgVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzbgVar.zza;
                jd.a aVar = jd.a.a;
                i7 = zzbgVar.zzc;
                if (i7 != 0) {
                    b.c(obj);
                    s zzf = zzf();
                    zzbgVar.zzd = str;
                    zzbgVar.zzc = 1;
                    obj = ((t) zzf).i(zzbgVar);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.c(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzbgVar.zzd;
                    b.c(obj);
                }
                e0 zza = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzbgVar.zzd = null;
                zzbgVar.zzc = 2;
                obj = zza.await(zzbgVar);
            }
        }
        zzbgVar = new zzbg(this, cVar);
        Object obj2 = zzbgVar.zza;
        jd.a aVar2 = jd.a.a;
        i7 = zzbgVar.zzc;
        if (i7 != 0) {
        }
        e0 zza2 = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzbgVar.zzd = null;
        zzbgVar.zzc = 2;
        obj2 = zza2.await(zzbgVar);
    }

    public final Object zze(id.c cVar) {
        return new zzhg(new zzbn(this, null));
    }

    public final s zzf() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    public final void zzj(long j3) {
        this.zze = j3;
    }

    public zzbo(long j3) {
        int i7 = zzby.zza;
        this.zzb = ab.b(zzbk.zza);
        this.zzc = zzbp.zza;
        this.zzd = ab.b(zzbl.zza);
        this.zzf = new d();
    }
}
