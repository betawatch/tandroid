package com.google.android.recaptcha.internal;

import gd.f;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
final class zzf extends j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(long j3, zzg zzgVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = j3;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r1;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                t7.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j3 = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = e0.x(j3, zzeVar, this);
            } else {
                if (i10 != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    t7.b(obj);
                    throw zzcgVar;
                }
                t7.b(obj);
            }
            Object obj2 = ((f) obj).a;
            t7.b(obj2);
            return (zzxx) obj2;
        } catch (Exception e7) {
            zzcg zza = zzh.zza(e7, new zzcg(zzce.zzb, zzcd.zzaa, e7.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j10 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j10, e7, this) != aVar) {
                throw zza;
            }
        }
    }
}
