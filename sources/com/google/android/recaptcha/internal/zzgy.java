package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import gd.i;
import hd.g;
import id.c;
import java.util.List;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzgy(this.zza, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgy) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzgo zzgoVar;
        zzgo zzgoVar2;
        zzgo zzgoVar3;
        zzgo zzgoVar4;
        zzgo zzgoVar5;
        zzgo zzgoVar6;
        a aVar = a.a;
        t7.b(obj);
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
