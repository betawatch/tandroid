package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfb extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzfp zzfpVar, zzxn zzxnVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzfpVar;
        this.zzc = zzxnVar;
        this.zzd = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, fw2Var);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
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
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n4a children;
        zzhk zzhkVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
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
                        qse.b(obj);
                        return g5c.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    qse.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                qse.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e) {
            zzfp zzfpVar2 = this.zzb;
            bt5 bt5Var = (bt5) zzfp.zzf(zzfpVar2).zzd().c().get(pd5.c);
            if (bt5Var != null && (children = bt5Var.getChildren()) != null) {
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    ((bt5) it.next()).cancel(null);
                }
            }
            List a = s4a.a(nle.b(zzfp.zzf(zzfpVar2).zzd().c()).getChildren());
            this.zze = e;
            this.zza = 3;
            if (xmd.b(a, this) != bx2Var) {
                throw e;
            }
        }
    }
}
