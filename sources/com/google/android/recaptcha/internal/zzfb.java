package com.google.android.recaptcha.internal;

import ae.c0;
import ae.g0;
import ae.h1;
import hd.i;
import java.util.Iterator;
import java.util.List;
import jd.c;
import jd.h;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;
import xd.b;
import xd.d;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzfb extends j implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzfp zzfpVar, zzxn zzxnVar, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzxnVar;
        this.zzd = j3;
    }

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, cVar);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r10).zza(r2, r9) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r10 != r1) goto L17;
     */
    @Override // ld.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b children;
        zzhk zzhkVar;
        c0 c0Var = c0.b;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                a8.b(obj);
                zzhkVar = (zzhk) this.zze;
                zzfp zzfpVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                zzfp.zzv(zzxnVar.zzP());
                zzq zzb = zzfp.zzb(zzfpVar);
                long j3 = this.zzd;
                this.zze = zzhkVar;
                this.zza = 1;
                obj = zzb.zzc(j3, zzxnVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        a8.b(obj);
                        return i.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    a8.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                a8.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e7) {
            zzfp zzfpVar2 = this.zzb;
            h1 h1Var = (h1) zzfp.zzf(zzfpVar2).zzd().c().get(c0Var);
            if (h1Var != null && (children = h1Var.getChildren()) != null) {
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    ((h1) it.next()).cancel(null);
                }
            }
            h c10 = zzfp.zzf(zzfpVar2).zzd().c();
            h1 h1Var2 = (h1) c10.get(c0Var);
            if (h1Var2 == null) {
                throw new IllegalStateException(("Current context doesn't contain Job in it: " + c10).toString());
            }
            List a2 = d.a(h1Var2.getChildren());
            this.zze = e7;
            this.zza = 3;
            if (g0.o(a2, this) != aVar) {
                throw e7;
            }
        }
    }
}
