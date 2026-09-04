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
final class zzd extends j implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, long j3, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = zzgVar;
        this.zzc = j3;
        this.zzd = zzxnVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, cVar);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r11 != r0) goto L22;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        i iVar = i.a;
        try {
        } catch (Exception e7) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e7, this);
        }
        if (i10 == 0) {
            t7.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return iVar;
            }
            long j3 = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = e0.x(j3, zzcVar, this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    t7.b(obj);
                    throw zzcgVar;
                }
                t7.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != aVar) {
                    throw zzcgVar2;
                }
                return aVar;
            }
            t7.b(obj);
        }
        t7.b(((f) obj).a);
        this.zzb.zza = true;
        return iVar;
    }
}
