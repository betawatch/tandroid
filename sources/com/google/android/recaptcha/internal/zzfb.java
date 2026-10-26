package com.google.android.recaptcha.internal;

import a8.jd;
import ce.b0;
import ce.f0;
import ce.g1;
import java.util.Iterator;
import java.util.List;
import ld.c;
import ld.h;
import md.a;
import nd.i;
import ud.p;
import zd.b;
import zd.d;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, cVar);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
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
    @Override // nd.a
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
                jd.b(obj);
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
                        jd.b(obj);
                        return jd.i.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    jd.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                jd.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e) {
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
            this.zze = e;
            this.zza = 3;
            if (f0.o(a2, this) != aVar) {
                throw e;
            }
        }
    }
}
