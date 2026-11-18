package com.google.android.recaptcha.internal;

import b7.h;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import kotlin.jvm.internal.r;
import rd.p;
import zd.t;
import zd.z;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
final class zzbd extends j implements p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    final /* synthetic */ r zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbo zzboVar, r rVar, c cVar) {
        super(2, cVar);
        this.zzd = zzboVar;
        this.zze = rVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzbd(this.zzd, this.zze, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (zd.b0.f(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:8:0x0024, B:10:0x0030, B:38:0x0016), top: B:37:0x0016 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0042 -> B:7:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0075 -> B:5:0x0011). Please report as a decompilation issue!!! */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j3;
        boolean z10;
        boolean z11;
        int errorCode;
        a aVar = a.a;
        int i7 = this.zzc;
        if (i7 == 0) {
            h.b(obj);
            j3 = 1000;
            z10 = true;
            if (!z10) {
            }
        } else if (i7 != 1) {
            z11 = this.zzb;
            j3 = this.zza;
            h.b(obj);
            z10 = z11;
            j3 += j3;
            if (!z10) {
                return k.a;
            }
            zzbo zzboVar = this.zzd;
            this.zza = j3;
            this.zzc = 1;
            obj = zzboVar.zzl(this);
        } else {
            j3 = this.zza;
            try {
                h.b(obj);
            } catch (Exception e10) {
                this.zze.a = e10;
                z11 = (e10 instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e10).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z11) {
                    throw e10;
                }
                this.zza = j3;
                this.zzb = true;
                this.zzc = 2;
            }
            zzbo zzboVar2 = this.zzd;
            ((t) zzboVar2.zzf()).C((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            zzboVar2.zzc = zzbp.zzc;
            z10 = false;
            if (!z10) {
            }
        }
    }
}
