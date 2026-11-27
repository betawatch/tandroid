package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzfb extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzfp zzfpVar, zzxn zzxnVar, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzfpVar;
        this.zzc = zzxnVar;
        this.zzd = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, zw2Var);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
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
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f8a children;
        zzhk zzhkVar;
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        try {
            if (i == 0) {
                ixe.b(obj);
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
                        ixe.b(obj);
                        return f9c.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    ixe.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                ixe.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e) {
            zzfp zzfpVar2 = this.zzb;
            ev5 ev5Var = (ev5) zzfp.zzf(zzfpVar2).zzd().c().get(qf5.c);
            if (ev5Var != null && (children = ev5Var.getChildren()) != null) {
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    ((ev5) it.next()).cancel(null);
                }
            }
            List a = k8a.a(gqe.b(zzfp.zzf(zzfpVar2).zzd().c()).getChildren());
            this.zze = e;
            this.zza = 3;
            if (ord.b(a, this) != vx2Var) {
                throw e;
            }
        }
    }
}
