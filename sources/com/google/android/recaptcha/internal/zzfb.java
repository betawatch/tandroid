package com.google.android.recaptcha.internal;

import ad.p;
import fd.b;
import fd.d;
import h7.k6;
import id.b0;
import id.f0;
import id.g1;
import java.util.Iterator;
import java.util.List;
import rc.c;
import rc.h;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, cVar);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (c) obj2)).invokeSuspend(pc.i.a);
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
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b children;
        zzhk zzhkVar;
        b0 b0Var = b0.b;
        sc.a aVar = sc.a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                k6.b(obj);
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
                        k6.b(obj);
                        return pc.i.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    k6.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                k6.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e9) {
            zzfp zzfpVar2 = this.zzb;
            g1 g1Var = (g1) zzfp.zzf(zzfpVar2).zzd().c().get(b0Var);
            if (g1Var != null && (children = g1Var.getChildren()) != null) {
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    ((g1) it.next()).cancel(null);
                }
            }
            h c10 = zzfp.zzf(zzfpVar2).zzd().c();
            g1 g1Var2 = (g1) c10.get(b0Var);
            if (g1Var2 == null) {
                throw new IllegalStateException(("Current context doesn't contain Job in it: " + c10).toString());
            }
            List a2 = d.a(g1Var2.getChildren());
            this.zze = e9;
            this.zza = 3;
            if (f0.o(a2, this) != aVar) {
                throw e9;
            }
        }
    }
}
