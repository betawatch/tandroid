package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import java.util.Iterator;
import java.util.List;
import od.p;
import td.b;
import td.d;
import wd.a1;
import wd.b0;
import wd.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzfb extends j implements p {
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, cVar);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r9).zza(r1, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r9 != r0) goto L17;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b children;
        zzhk zzhkVar;
        gd.a aVar = gd.a.a;
        int i3 = this.zza;
        try {
            if (i3 == 0) {
                ib.b(obj);
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
                if (i3 != 1) {
                    if (i3 == 2) {
                        ib.b(obj);
                        return k.a;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    ib.b(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                ib.b(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e10) {
            zzfp zzfpVar2 = this.zzb;
            a1 a1Var = (a1) zzfp.zzf(zzfpVar2).zzd().c().get(y.b);
            if (a1Var != null && (children = a1Var.getChildren()) != null) {
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    ((a1) it.next()).cancel(null);
                }
            }
            List a10 = d.a(b0.k(zzfp.zzf(zzfpVar2).zzd().c()).getChildren());
            this.zze = e10;
            this.zza = 3;
            if (b0.o(a10, this) != aVar) {
                throw e10;
            }
        }
    }
}
