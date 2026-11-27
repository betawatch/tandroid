package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
final class zzgy extends yfb implements is4 {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgy(zzgz zzgzVar, zzzm zzzmVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzgzVar;
        this.zzb = zzzmVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzgy(this.zza, this.zzb, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgy) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        zzgo zzgoVar2;
        zzgo zzgoVar3;
        zzgo zzgoVar4;
        zzgo zzgoVar5;
        zzgo zzgoVar6;
        ixe.b(obj);
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
                    List g = sl2.g(zzgoVar5.zzd(), zzb);
                    zzgoVar6 = zzgzVar.zzc;
                    zzgoVar6.zza(g);
                }
                zzgoVar4 = zzgzVar.zzc;
                if (zzgoVar4.zzb() >= 20) {
                    zzgzVar.zzf();
                }
            }
        }
        return f9c.a;
    }
}
