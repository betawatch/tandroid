package com.google.android.recaptcha.internal;

import gd.c;
import gd.g;
import jd.a;
import org.telegram.tgnet.TLObject;
import v7.s7;
import v7.t7;
import zd.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class zzif {
    private final c zza;

    public zzif() {
        int i10 = zzby.zza;
        this.zza = s7.a(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) ((g) zzifVar.zza).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, id.c cVar) {
        zzic zzicVar;
        int i10;
        if (cVar instanceof zzic) {
            zzicVar = (zzic) cVar;
            int i11 = zzicVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                a aVar = a.a;
                i10 = zzicVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                    return obj;
                }
                t7.b(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object f7 = e0.f(zzidVar, zzicVar);
                return f7 == aVar ? aVar : f7;
            }
        }
        zzicVar = new zzic(zzifVar, cVar);
        Object obj2 = zzicVar.zza;
        a aVar2 = a.a;
        i10 = zzicVar.zzc;
        if (i10 == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, id.c cVar) {
        return zzc(this, zzcyVar, zzyeVar, cVar);
    }
}
