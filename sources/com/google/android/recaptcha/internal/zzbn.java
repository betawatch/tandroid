package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import fe.d;
import hd.j;
import od.p;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzbn zzbnVar = new zzbn(this.zzd, cVar);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r6 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4 A[RETURN] */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        fe.a aVar;
        Object obj2;
        zzbp zzbpVar;
        zzhk zzhkVar2;
        gd.a aVar2 = gd.a.a;
        int i3 = this.zzc;
        k kVar = k.a;
        try {
            if (i3 == 0) {
                ib.b(obj);
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
                if (i3 != 1) {
                    if (i3 != 2) {
                        ib.b(obj);
                        return kVar;
                    }
                    zzhkVar2 = (zzhk) this.zze;
                    ib.b(obj);
                    this.zze = null;
                    this.zzc = 3;
                    return ((zzhg) obj).zza(zzhkVar2, this) != aVar2 ? aVar2 : kVar;
                }
                zzboVar = (zzbo) this.zzb;
                Object obj3 = (fe.a) this.zza;
                zzhk zzhkVar3 = (zzhk) this.zze;
                ib.b(obj);
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
