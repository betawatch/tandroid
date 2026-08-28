package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import g7.y5;
import hd.c0;
import java.util.List;
import pc.g;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzgy extends i implements p {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgy(zzgz zzgzVar, zzzm zzzmVar, c cVar) {
        super(2, cVar);
        this.zza = zzgzVar;
        this.zzb = zzzmVar;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzgy(this.zza, this.zzb, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgy) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        zzgo zzgoVar2;
        zzgo zzgoVar3;
        zzgo zzgoVar4;
        zzgo zzgoVar5;
        zzgo zzgoVar6;
        a aVar = a.a;
        y5.b(obj);
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
                        List i9 = g.i(zzgoVar5.zzd(), zzb);
                        zzgoVar6 = zzgzVar.zzc;
                        zzgoVar6.zza(i9);
                    }
                    zzgoVar4 = zzgzVar.zzc;
                    if (zzgoVar4.zzb() >= 20) {
                        zzgzVar.zzf();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oc.i.a;
    }
}
