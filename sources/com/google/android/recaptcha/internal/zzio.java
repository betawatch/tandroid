package com.google.android.recaptcha.internal;

import a8.jd;
import ce.c0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class zzio extends i implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zziz zzd;
    final /* synthetic */ zzip zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzio(zziz zzizVar, zzip zzipVar, String str, c cVar) {
        super(2, cVar);
        this.zzd = zzizVar;
        this.zze = zzipVar;
        this.zzf = str;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzio(this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzio) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzkt zzktVar;
        Object zzg;
        zzzq zzzqVar;
        zzmf zzmfVar;
        a aVar = a.a;
        int i10 = this.zzc;
        try {
        } catch (Exception e) {
            zzip zzipVar = this.zze;
            zziz zzizVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzipVar.zzh(e, zzizVar, this);
        }
        if (i10 == 0) {
            jd.b(obj);
            zziz zzizVar2 = this.zzd;
            zzizVar2.zza = new zzcs();
            zzzq zzi = zzzq.zzi(zzpp.zzh().zzj(this.zzf));
            zzi.zzf();
            zzip zzipVar2 = this.zze;
            zzktVar = zzipVar2.zzc;
            zzzo zza = zzktVar.zza(zzi);
            zzmf zzb = zzmf.zzb();
            List zzi2 = zza.zzi();
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzipVar2.zzg(zzi2, zzizVar2, this);
            if (zzg != aVar) {
                zzzqVar = zzi;
                zzmfVar = zzb;
            }
            return aVar;
        }
        if (i10 != 1) {
            jd.b(obj);
            return jd.i.a;
        }
        zzmfVar = (zzmf) this.zzb;
        zzzqVar = (zzzq) this.zza;
        jd.b(obj);
        zzmfVar.zzf();
        new Long(zzmfVar.zza(TimeUnit.MICROSECONDS));
        zzzqVar.zzf();
        return jd.i.a;
    }
}
