package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import ie.d;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzbn extends j implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zzd = zzboVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzbn zzbnVar = new zzbn(this.zzd, cVar);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r6 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4 A[RETURN] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        ie.a aVar;
        Object obj2;
        zzbp zzbpVar;
        zzhk zzhkVar2;
        jd.a aVar2 = jd.a.a;
        int i7 = this.zzc;
        k kVar = k.a;
        try {
            if (i7 == 0) {
                b.c(obj);
                zzhkVar = (zzhk) this.zze;
                zzboVar = this.zzd;
                aVar = zzboVar.zzf;
                this.zze = zzhkVar;
                this.zza = aVar;
                this.zzb = zzboVar;
                this.zzc = 1;
                d dVar = (d) aVar;
                Object d = dVar.d(this);
                obj2 = dVar;
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        b.c(obj);
                        return kVar;
                    }
                    zzhkVar2 = (zzhk) this.zze;
                    b.c(obj);
                    this.zze = null;
                    this.zzc = 3;
                    return ((zzhg) obj).zza(zzhkVar2, this) != aVar2 ? aVar2 : kVar;
                }
                zzboVar = (zzbo) this.zzb;
                Object obj3 = (ie.a) this.zza;
                zzhk zzhkVar3 = (zzhk) this.zze;
                b.c(obj);
                zzhkVar = zzhkVar3;
                obj2 = obj3;
            }
            zzbpVar = zzboVar.zzc;
            if (!kotlin.jvm.internal.j.a(zzbpVar, zzbp.zza)) {
                return kVar;
            }
            zzboVar.zzc = zzbp.zzb;
            ((d) obj2).f(null);
            zzbo zzboVar2 = this.zzd;
            zzboVar2.zza = b0.a();
            b0.q(zzbo.zzb(zzboVar2).zzc(), new zzbm(zzhkVar, zzboVar2, null));
            this.zze = zzhkVar;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzhg zzhgVar = new zzhg(new zzbj(zzboVar2, null));
            if (zzhgVar != aVar2) {
                zzhkVar2 = zzhkVar;
                obj = zzhgVar;
                this.zze = null;
                this.zzc = 3;
                if (((zzhg) obj).zza(zzhkVar2, this) != aVar2) {
                }
            }
        } finally {
            ((d) obj2).f(null);
        }
    }
}
