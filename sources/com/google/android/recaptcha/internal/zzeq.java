package com.google.android.recaptcha.internal;

import b8.hb;
import b8.ib;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import dd.g;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;
import ud.c;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzeq implements RecaptchaClient, RecaptchaTasksClient {
    private static final c zza = new c("^[a-zA-Z0-9/_]{1,100}$");
    private final zzdw zzb;
    private final String zzc;
    private final zzhh zzd;
    private final dd.c zze;

    public zzeq(zzdw zzdwVar, String str, zzhh zzhhVar) {
        this.zzb = zzdwVar;
        this.zzc = str;
        this.zzd = zzhhVar;
        int i3 = zzby.zza;
        this.zze = hb.b(zzep.zza);
    }

    public static final void zzd(zzeq zzeqVar, long j10, RecaptchaAction recaptchaAction) {
        c cVar = zza;
        String input = recaptchaAction.getAction();
        cVar.getClass();
        j.e(input, "input");
        zzcg zzcgVar = !cVar.a.matcher(input).matches() ? new zzcg(zzce.zzg, zzcd.zzh, null, null, 12, null) : null;
        if (j10 < 5000) {
            zzcgVar = new zzcg(zzce.zzb, zzcd.zzI, null, null, 12, null);
        }
        if (zzcgVar != null) {
            throw zzcgVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(RecaptchaAction recaptchaAction, long j10, fd.c cVar) {
        zzek zzekVar;
        int i3;
        if (cVar instanceof zzek) {
            zzekVar = (zzek) cVar;
            int i10 = zzekVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzekVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzekVar.zza;
                gd.a aVar = gd.a.a;
                i3 = zzekVar.zzc;
                if (i3 != 0) {
                    ib.b(obj);
                    zzhh zzhhVar = this.zzd;
                    zzem zzemVar = new zzem(this, j10, recaptchaAction, null);
                    zzekVar.zzc = 1;
                    obj = zzemVar.invoke(zzhhVar, zzekVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return ((g) obj).a;
            }
        }
        zzekVar = new zzek(this, cVar);
        Object obj2 = zzekVar.zza;
        gd.a aVar2 = gd.a.a;
        i3 = zzekVar.zzc;
        if (i3 != 0) {
        }
        return ((g) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-0E7RQCE(RecaptchaAction recaptchaAction, long j10, fd.c cVar) {
        zzei zzeiVar;
        int i3;
        if (cVar instanceof zzei) {
            zzeiVar = (zzei) cVar;
            int i10 = zzeiVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzeiVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzeiVar.zza;
                Object obj2 = gd.a.a;
                i3 = zzeiVar.zzc;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return ((g) obj).a;
                }
                ib.b(obj);
                zzeiVar.zzc = 1;
                Object zze = zze(recaptchaAction, j10, zzeiVar);
                return zze == obj2 ? obj2 : zze;
            }
        }
        zzeiVar = new zzei(this, cVar);
        Object obj3 = zzeiVar.zza;
        Object obj22 = gd.a.a;
        i3 = zzeiVar.zzc;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-gIAlu-s(RecaptchaAction recaptchaAction, fd.c cVar) {
        zzej zzejVar;
        int i3;
        if (cVar instanceof zzej) {
            zzejVar = (zzej) cVar;
            int i10 = zzejVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzejVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzejVar.zza;
                Object obj2 = gd.a.a;
                i3 = zzejVar.zzc;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return ((g) obj).a;
                }
                ib.b(obj);
                zzejVar.zzc = 1;
                Object obj3 = execute-0E7RQCE(recaptchaAction, 10000L, zzejVar);
                return obj3 == obj2 ? obj2 : obj3;
            }
        }
        zzejVar = new zzej(this, cVar);
        Object obj4 = zzejVar.zza;
        Object obj22 = gd.a.a;
        i3 = zzejVar.zzc;
        if (i3 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzbv.zza(b0.c(((zzcr) this.zze.getValue()).zzb(), new zzen(this, recaptchaAction, 10000L, null)));
    }

    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        return zzbv.zza(b0.c(((zzcr) this.zze.getValue()).zzb(), new zzen(this, recaptchaAction, j10, null)));
    }
}
