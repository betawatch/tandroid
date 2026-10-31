package com.google.android.recaptcha.internal;

import cd.c;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;
import td.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzbd extends j implements p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    final /* synthetic */ kotlin.jvm.internal.p zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbo zzboVar, kotlin.jvm.internal.p pVar, c cVar) {
        super(2, cVar);
        this.zzd = zzboVar;
        this.zze = pVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzbd(this.zzd, this.zze, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (td.e0.g(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:8:0x0024, B:10:0x0030, B:38:0x0016), top: B:37:0x0016 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0042 -> B:7:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0075 -> B:5:0x0011). Please report as a decompilation issue!!! */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j10;
        boolean z10;
        boolean z11;
        int errorCode;
        a aVar = a.a;
        int i10 = this.zzc;
        if (i10 == 0) {
            b.b(obj);
            j10 = 1000;
            z10 = true;
            if (!z10) {
            }
        } else if (i10 != 1) {
            z11 = this.zzb;
            j10 = this.zza;
            b.b(obj);
            z10 = z11;
            j10 += j10;
            if (!z10) {
                return ad.j.a;
            }
            zzbo zzboVar = this.zzd;
            this.zza = j10;
            this.zzc = 1;
            obj = zzboVar.zzl(this);
        } else {
            j10 = this.zza;
            try {
                b.b(obj);
            } catch (Exception e) {
                this.zze.a = e;
                z11 = (e instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z11) {
                    throw e;
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
