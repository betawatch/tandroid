package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzbd extends ccb implements eq4 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    final /* synthetic */ c59 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbo zzboVar, c59 c59Var, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzd = zzboVar;
        this.zze = c59Var;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzbd(this.zzd, this.zze, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (jde.a(r4, r7) != r3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r8 != r3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #0 {Exception -> 0x0042, blocks: (B:8:0x0022, B:10:0x002e, B:38:0x0016), top: B:37:0x0016 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:7:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0074 -> B:5:0x0011). Please report as a decompilation issue!!! */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z;
        boolean z2;
        int errorCode;
        int i = this.zzc;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            j = 1000;
            z = true;
            if (!z) {
            }
        } else if (i != 1) {
            z2 = this.zzb;
            j = this.zza;
            qse.b(obj);
            z = z2;
            j <<= 1;
            if (!z) {
                return g5c.a;
            }
            zzbo zzboVar = this.zzd;
            this.zza = j;
            this.zzc = 1;
            obj = zzboVar.zzl(this);
        } else {
            j = this.zza;
            try {
                qse.b(obj);
            } catch (Exception e) {
                this.zze.a = e;
                z2 = (e instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z2) {
                    throw e;
                }
                this.zza = j;
                this.zzb = true;
                this.zzc = 2;
            }
            zzbo zzboVar2 = this.zzd;
            ((cp2) zzboVar2.zzf()).B((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            zzboVar2.zzc = zzbp.zzc;
            z = false;
            if (!z) {
            }
        }
    }
}
