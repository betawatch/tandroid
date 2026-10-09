package com.google.android.recaptcha.internal;

import hd.i;
import jd.c;
import kd.a;
import kotlin.jvm.internal.p;
import ld.j;
import sd.l;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzev extends j implements l {
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

    @Override // ld.a
    public final c create(c cVar) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // sd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((c) obj)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // ld.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                a8.b(obj);
                zzgrVar = this.zzc;
                zzfp zzfpVar = this.zzd;
                zzye zzyeVar = this.zze;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            } else {
                if (i10 != 1) {
                    a8.b(obj);
                    return (zzyg) obj;
                }
                zzgrVar = (zzgr) this.zza;
                a8.b(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == aVar) {
                return aVar;
            }
            return (zzyg) obj;
        } catch (zzcg e7) {
            this.zzf.a = e7;
            throw e7;
        }
    }
}
