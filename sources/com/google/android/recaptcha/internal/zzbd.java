package com.google.android.recaptcha.internal;

import bd.p;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import i7.c7;
import jd.c0;
import jd.t;
import kotlin.jvm.internal.q;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzbd extends i implements p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    final /* synthetic */ q zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbo zzboVar, q qVar, c cVar) {
        super(2, cVar);
        this.zzd = zzboVar;
        this.zze = qVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzbd(this.zzd, this.zze, cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (jd.e0.g(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[Catch: Exception -> 0x0019, TRY_ENTER, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0023, B:10:0x002f, B:38:0x0015), top: B:37:0x0015 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0041 -> B:7:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0074 -> B:5:0x0011). Please report as a decompilation issue!!! */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j10;
        boolean z10;
        boolean z11;
        int errorCode;
        tc.a aVar = tc.a.a;
        int i10 = this.zzc;
        if (i10 == 0) {
            c7.b(obj);
            j10 = 1000;
            z10 = true;
            if (!z10) {
            }
        } else if (i10 != 1) {
            z11 = this.zzb;
            j10 = this.zza;
            c7.b(obj);
            z10 = z11;
            j10 += j10;
            if (!z10) {
                return qc.i.a;
            }
            zzbo zzboVar = this.zzd;
            this.zza = j10;
            this.zzc = 1;
            obj = zzboVar.zzl(this);
        } else {
            j10 = this.zza;
            try {
                c7.b(obj);
            } catch (Exception e10) {
                this.zze.a = e10;
                z11 = (e10 instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e10).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z11) {
                    throw e10;
                }
                this.zza = j10;
                this.zzb = true;
                this.zzc = 2;
            }
            zzbo zzboVar2 = this.zzd;
            ((t) zzboVar2.zzf()).A((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            zzboVar2.zzc = zzbp.zzc;
            z10 = false;
            if (!z10) {
            }
        }
    }
}
