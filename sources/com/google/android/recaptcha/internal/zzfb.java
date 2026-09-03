package com.google.android.recaptcha.internal;

import dd.p;
import id.b;
import id.d;
import java.util.Iterator;
import java.util.List;
import k7.q7;
import ld.b0;
import ld.e0;
import ld.f1;
import uc.c;
import uc.h;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzfb extends i implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzfp zzfpVar, zzxn zzxnVar, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzxnVar;
        this.zzd = j10;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, cVar);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
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
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b children;
        zzhk zzhkVar;
        b0 b0Var = b0.b;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                q7.b(obj);
                zzhkVar = (zzhk) this.zze;
                zzfp zzfpVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                zzfp.zzv(zzxnVar.zzP());
                zzq zzb = zzfp.zzb(zzfpVar);
                long j10 = this.zzd;
                this.zze = zzhkVar;
                this.zza = 1;
                obj = zzb.zzc(j10, zzxnVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        q7.b(obj);
                        return sc.i.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    q7.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                q7.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e6) {
            zzfp zzfpVar2 = this.zzb;
            f1 f1Var = (f1) zzfp.zzf(zzfpVar2).zzd().c().get(b0Var);
            if (f1Var != null && (children = f1Var.getChildren()) != null) {
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    ((f1) it.next()).cancel(null);
                }
            }
            h c3 = zzfp.zzf(zzfpVar2).zzd().c();
            f1 f1Var2 = (f1) c3.get(b0Var);
            if (f1Var2 == null) {
                throw new IllegalStateException(("Current context doesn't contain Job in it: " + c3).toString());
            }
            List a2 = d.a(f1Var2.getChildren());
            this.zze = e6;
            this.zza = 3;
            if (e0.o(a2, this) != aVar) {
                throw e6;
            }
        }
    }
}
