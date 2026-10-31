package com.google.android.recaptcha.internal;

import cd.c;
import ce.a;
import ce.d;
import ed.j;
import kotlin.jvm.internal.i;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzbn zzbnVar = new zzbn(this.zzd, cVar);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r6 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4 A[RETURN] */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        a aVar;
        Object obj2;
        zzbp zzbpVar;
        zzhk zzhkVar2;
        dd.a aVar2 = dd.a.a;
        int i10 = this.zzc;
        ad.j jVar = ad.j.a;
        try {
            if (i10 == 0) {
                b.b(obj);
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
                if (i10 != 1) {
                    if (i10 != 2) {
                        b.b(obj);
                        return jVar;
                    }
                    zzhkVar2 = (zzhk) this.zze;
                    b.b(obj);
                    this.zze = null;
                    this.zzc = 3;
                    return ((zzhg) obj).zza(zzhkVar2, this) != aVar2 ? aVar2 : jVar;
                }
                zzboVar = (zzbo) this.zzb;
                Object obj3 = (a) this.zza;
                zzhk zzhkVar3 = (zzhk) this.zze;
                b.b(obj);
                zzhkVar = zzhkVar3;
                obj2 = obj3;
            }
            zzbpVar = zzboVar.zzc;
            if (!i.a(zzbpVar, zzbp.zza)) {
                return jVar;
            }
            zzboVar.zzc = zzbp.zzb;
            ((d) obj2).e(null);
            zzbo zzboVar2 = this.zzd;
            zzboVar2.zza = e0.a();
            e0.q(zzbo.zzb(zzboVar2).zzc(), new zzbm(zzhkVar, zzboVar2, null));
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
            ((d) obj2).e(null);
        }
    }
}
