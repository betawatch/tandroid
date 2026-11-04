package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import kotlin.jvm.internal.r;
import od.l;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzev extends j implements l {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzye zze;
    final /* synthetic */ r zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, r rVar, c cVar) {
        super(1, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
        this.zze = zzyeVar;
        this.zzf = rVar;
    }

    @Override // hd.a
    public final c create(c cVar) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // od.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((c) obj)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        gd.a aVar = gd.a.a;
        int i3 = this.zzb;
        try {
            if (i3 == 0) {
                ib.b(obj);
                zzgrVar = this.zzc;
                zzfp zzfpVar = this.zzd;
                zzye zzyeVar = this.zze;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            } else {
                if (i3 != 1) {
                    ib.b(obj);
                    return (zzyg) obj;
                }
                zzgrVar = (zzgr) this.zza;
                ib.b(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == aVar) {
                return aVar;
            }
            return (zzyg) obj;
        } catch (zzcg e10) {
            this.zzf.a = e10;
            throw e10;
        }
    }
}
