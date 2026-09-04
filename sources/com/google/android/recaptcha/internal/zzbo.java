package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import gd.c;
import gd.g;
import ie.a;
import ie.e;
import org.telegram.tgnet.TLObject;
import v7.s7;
import v7.t7;
import zd.h0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    public final Object zzl(id.c cVar) {
        zzbc zzbcVar;
        int i10;
        if (cVar instanceof zzbc) {
            zzbcVar = (zzbc) cVar;
            int i11 = zzbcVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzbcVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzbcVar.zza;
                jd.a aVar = jd.a.a;
                i10 = zzbcVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                    return obj;
                }
                t7.b(obj);
                h0 zza = zzdf.zza(((StandardIntegrityManager) ((g) this.zzd).a()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
                zzbcVar.zzc = 1;
                Object await = zza.await(zzbcVar);
                return await == aVar ? aVar : await;
            }
        }
        zzbcVar = new zzbc(this, cVar);
        Object obj2 = zzbcVar.zza;
        jd.a aVar2 = jd.a.a;
        i10 = zzbcVar.zzc;
        if (i10 == 0) {
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
        int i10;
        if (cVar instanceof zzbg) {
            zzbgVar = (zzbg) cVar;
            int i11 = zzbgVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzbgVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzbgVar.zza;
                jd.a aVar = jd.a.a;
                i10 = zzbgVar.zzc;
                if (i10 != 0) {
                    t7.b(obj);
                    s zzf = zzf();
                    zzbgVar.zzd = str;
                    zzbgVar.zzc = 1;
                    obj = ((t) zzf).h(zzbgVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t7.b(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzbgVar.zzd;
                    t7.b(obj);
                }
                h0 zza = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzbgVar.zzd = null;
                zzbgVar.zzc = 2;
                obj = zza.await(zzbgVar);
            }
        }
        zzbgVar = new zzbg(this, cVar);
        Object obj2 = zzbgVar.zza;
        jd.a aVar2 = jd.a.a;
        i10 = zzbgVar.zzc;
        if (i10 != 0) {
        }
        h0 zza2 = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
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
        int i10 = zzby.zza;
        this.zzb = s7.a(zzbk.zza);
        this.zzc = zzbp.zza;
        this.zzd = s7.a(zzbl.zza);
        this.zzf = e.a();
    }
}
