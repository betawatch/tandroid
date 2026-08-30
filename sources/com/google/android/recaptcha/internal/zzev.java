package com.google.android.recaptcha.internal;

import dd.l;
import k7.p7;
import kotlin.jvm.internal.q;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzev extends i implements l {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzye zze;
    final /* synthetic */ q zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, q qVar, c cVar) {
        super(1, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
        this.zze = zzyeVar;
        this.zzf = qVar;
    }

    @Override // wc.a
    public final c create(c cVar) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // dd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((c) obj)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                p7.b(obj);
                zzgrVar = this.zzc;
                zzfp zzfpVar = this.zzd;
                zzye zzyeVar = this.zze;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            } else {
                if (i10 != 1) {
                    p7.b(obj);
                    return (zzyg) obj;
                }
                zzgrVar = (zzgr) this.zza;
                p7.b(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == aVar) {
                return aVar;
            }
            return (zzyg) obj;
        } catch (zzcg e) {
            this.zzf.a = e;
            throw e;
        }
    }
}
