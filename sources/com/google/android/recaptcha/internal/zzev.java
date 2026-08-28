package com.google.android.recaptcha.internal;

import g7.y5;
import kotlin.jvm.internal.p;
import qc.c;
import rc.a;
import sc.i;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzev extends i implements l {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzye zze;
    final /* synthetic */ p zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, p pVar, c cVar) {
        super(1, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
        this.zze = zzyeVar;
        this.zzf = pVar;
    }

    @Override // sc.a
    public final c create(c cVar) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // zc.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((c) obj)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i9 = this.zzb;
        try {
            if (i9 == 0) {
                y5.b(obj);
                zzgrVar = this.zzc;
                zzfp zzfpVar = this.zzd;
                zzye zzyeVar = this.zze;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            } else {
                if (i9 != 1) {
                    y5.b(obj);
                    return (zzyg) obj;
                }
                zzgrVar = (zzgr) this.zza;
                y5.b(obj);
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
