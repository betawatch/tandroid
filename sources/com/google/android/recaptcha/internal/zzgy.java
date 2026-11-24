package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzgy extends eeb implements fs4 {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgy(zzgz zzgzVar, zzzm zzzmVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzgzVar;
        this.zzb = zzzmVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzgy(this.zza, this.zzb, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgy) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        zzgo zzgoVar2;
        zzgo zzgoVar3;
        zzgo zzgoVar4;
        zzgo zzgoVar5;
        zzgo zzgoVar6;
        tue.b(obj);
        zzzm zzzmVar = this.zzb;
        zzgz zzgzVar = this.zza;
        synchronized (zzgs.class) {
            zzgoVar = zzgzVar.zzc;
            if (zzgoVar != null) {
                byte[] zzd = zzzmVar.zzd();
                zzgp zzgpVar = new zzgp(zzpp.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                zzgoVar2 = zzgzVar.zzc;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzgpVar.zzc());
                contentValues.put("ts", Long.valueOf(zzgpVar.zzb()));
                zzgoVar2.getWritableDatabase().insert("ce", null, contentValues);
                zzgoVar3 = zzgzVar.zzc;
                int zzb = zzgoVar3.zzb() - 500;
                if (zzb > 0) {
                    zzgoVar5 = zzgzVar.zzc;
                    List g = km2.g(zzgoVar5.zzd(), zzb);
                    zzgoVar6 = zzgzVar.zzc;
                    zzgoVar6.zza(g);
                }
                zzgoVar4 = zzgzVar.zzc;
                if (zzgoVar4.zzb() >= 20) {
                    zzgzVar.zzf();
                }
            }
        }
        return g7c.a;
    }
}
