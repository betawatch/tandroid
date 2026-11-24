package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfb extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzfp zzfpVar, zzxn zzxnVar, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzfpVar;
        this.zzc = zzxnVar;
        this.zzd = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, px2Var);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r9).zza(r0, r8) != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r9 != r4) goto L15;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p6a children;
        zzhk zzhkVar;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzhkVar = (zzhk) this.zze;
                zzfp zzfpVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                zzfp.zzv(zzxnVar.zzP());
                zzq zzb = zzfp.zzb(zzfpVar);
                long j = this.zzd;
                this.zze = zzhkVar;
                this.zza = 1;
                obj = zzb.zzc(j, zzxnVar, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        tue.b(obj);
                        return g7c.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    tue.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                tue.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e) {
            zzfp zzfpVar2 = this.zzb;
            av5 av5Var = (av5) zzfp.zzf(zzfpVar2).zzd().c().get(nf5.c);
            if (av5Var != null && (children = av5Var.getChildren()) != null) {
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    ((av5) it.next()).cancel(null);
                }
            }
            List a = u6a.a(pne.b(zzfp.zzf(zzfpVar2).zzd().c()).getChildren());
            this.zze = e;
            this.zza = 3;
            if (apd.b(a, this) != ly2Var) {
                throw e;
            }
        }
    }
}
