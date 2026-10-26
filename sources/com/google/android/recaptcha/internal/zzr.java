package com.google.android.recaptcha.internal;

import a8.jd;
import android.app.Application;
import ce.i0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import jd.f;
import ld.c;
import m8.b;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class zzr extends i implements p {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzu zzuVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzr(this.zzb, this.zzc, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        String str;
        String str2;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            try {
                if (i10 == 0) {
                    jd.b(obj);
                    i0Var = this.zzb.zzc;
                    if (i0Var == null) {
                        i0Var = null;
                    }
                    this.zza = 1;
                    obj = i0Var.await(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        jd.b(obj);
                        str2 = ((b) obj).a;
                        if (str2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String str3 = this.zzc;
                        zzxw zzf = zzxx.zzf();
                        zzf.zze(str3);
                        zzxi zzf2 = zzxj.zzf();
                        zzf2.zze(str2);
                        zzf.zzf((zzxj) zzf2.zzk());
                        return new f((zzxx) zzf.zzk());
                    }
                    jd.b(obj);
                }
                m8.a aVar2 = new m8.a();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                aVar2.a = str != null ? str : null;
                aVar2.b = this.zzc;
                Application context = zzu.zzl(zzuVar);
                kotlin.jvm.internal.i.e(context, "context");
                b8.f fVar = new b8.f(context, b8.f.k, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
                u b10 = v.b();
                b10.d = new l6.c[]{m8.f.a};
                b10.c = new rb.c(aVar2, 7);
                b10.a = 34002;
                Task e = fVar.e(0, b10.a());
                kotlin.jvm.internal.i.d(e, "doRead(...)");
                i0 zza = zzdf.zza(e);
                this.zza = 2;
                obj = zza.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                str2 = ((b) obj).a;
                if (str2 != null) {
                }
            } catch (Exception unused) {
                return new f(jd.a(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
            }
        } catch (Exception unused2) {
            return new f(jd.a(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
        }
    }
}
