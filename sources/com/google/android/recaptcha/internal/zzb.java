package com.google.android.recaptcha.internal;

import b7.h;
import gd.g;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
final class zzb extends j implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zzg zzgVar, String str, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, cVar);
        zzbVar.zze = obj;
        return zzbVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r12 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r12 != r0) goto L23;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i7 = this.zza;
        try {
        } catch (Exception unused) {
            zzg zzgVar = this.zzb;
            String str = this.zzc;
            this.zze = null;
            this.zza = 3;
            obj = zzgVar.zza(str, this);
        }
        if (i7 == 0) {
            h.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzg zzgVar2 = this.zzb;
            String str2 = this.zzc;
            long j3 = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            zzhf zzhfVar = new zzhf(zzgVar2.zzj(), new zzf(j3, zzgVar2, str2, null), null);
            if (zzhfVar != aVar) {
                obj = zzhfVar;
            }
            return aVar;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                h.b(obj);
                return new g(obj);
            }
            h.b(obj);
            obj = (zzxx) obj;
            return new g(obj);
        }
        zzhkVar = (zzhk) this.zze;
        h.b(obj);
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
