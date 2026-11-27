package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzbd extends yfb implements is4 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    final /* synthetic */ p89 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbo zzboVar, p89 p89Var, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzd = zzboVar;
        this.zze = p89Var;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzbd(this.zzd, this.zze, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (aie.a(r4, r7) != r3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r8 != r3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #0 {Exception -> 0x0042, blocks: (B:8:0x0022, B:10:0x002e, B:38:0x0016), top: B:37:0x0016 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:7:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0074 -> B:5:0x0011). Please report as a decompilation issue!!! */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z;
        boolean z2;
        int errorCode;
        int i = this.zzc;
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            j = 1000;
            z = true;
            if (!z) {
            }
        } else if (i != 1) {
            z2 = this.zzb;
            j = this.zza;
            ixe.b(obj);
            z = z2;
            j <<= 1;
            if (!z) {
                return f9c.a;
            }
            zzbo zzboVar = this.zzd;
            this.zza = j;
            this.zzc = 1;
            obj = zzboVar.zzl(this);
        } else {
            j = this.zza;
            try {
                ixe.b(obj);
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
            ((vp2) zzboVar2.zzf()).B((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            zzboVar2.zzc = zzbp.zzc;
            z = false;
            if (!z) {
            }
        }
    }
}
