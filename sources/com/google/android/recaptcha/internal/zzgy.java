package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzgy extends ccb implements eq4 {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgy(zzgz zzgzVar, zzzm zzzmVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzgzVar;
        this.zzb = zzzmVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzgy(this.zza, this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgy) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        zzgo zzgoVar2;
        zzgo zzgoVar3;
        zzgo zzgoVar4;
        zzgo zzgoVar5;
        zzgo zzgoVar6;
        qse.b(obj);
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
                    List g = yk2.g(zzgoVar5.zzd(), zzb);
                    zzgoVar6 = zzgzVar.zzc;
                    zzgoVar6.zza(g);
                }
                zzgoVar4 = zzgzVar.zzc;
                if (zzgoVar4.zzb() >= 20) {
                    zzgzVar.zzf();
                }
            }
        }
        return g5c.a;
    }
}
