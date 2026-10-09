package com.google.android.recaptcha.internal;

import ae.d0;
import android.content.ContentValues;
import hd.i;
import id.g;
import java.util.List;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzgy extends j implements p {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgy(zzgz zzgzVar, zzzm zzzmVar, c cVar) {
        super(2, cVar);
        this.zza = zzgzVar;
        this.zzb = zzzmVar;
    }

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        return new zzgy(this.zza, this.zzb, cVar);
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgy) create((d0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        zzgo zzgoVar2;
        zzgo zzgoVar3;
        zzgo zzgoVar4;
        zzgo zzgoVar5;
        zzgo zzgoVar6;
        a aVar = a.a;
        a8.b(obj);
        zzzm zzzmVar = this.zzb;
        zzgz zzgzVar = this.zza;
        synchronized (zzgs.class) {
            try {
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
                        List i10 = g.i(zzgoVar5.zzd(), zzb);
                        zzgoVar6 = zzgzVar.zzc;
                        zzgoVar6.zza(i10);
                    }
                    zzgoVar4 = zzgzVar.zzc;
                    if (zzgoVar4.zzb() >= 20) {
                        zzgzVar.zzf();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i.a;
    }
}
