package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import jd.c;
import k7.p7;
import k7.q7;
import kotlin.jvm.internal.j;
import ld.e0;
import org.telegram.tgnet.TLObject;
import sc.f;
import sc.g;
import vc.a;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class zzeq implements RecaptchaClient, RecaptchaTasksClient {
    private static final c zza = new c();
    private final zzdw zzb;
    private final String zzc;
    private final zzhh zzd;
    private final sc.c zze;

    public zzeq(zzdw zzdwVar, String str, zzhh zzhhVar) {
        this.zzb = zzdwVar;
        this.zzc = str;
        this.zzd = zzhhVar;
        int i10 = zzby.zza;
        this.zze = p7.a(zzep.zza);
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
    public final Object zze(RecaptchaAction recaptchaAction, long j10, uc.c cVar) {
        zzek zzekVar;
        int i10;
        if (cVar instanceof zzek) {
            zzekVar = (zzek) cVar;
            int i11 = zzekVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzekVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzekVar.zza;
                a aVar = a.a;
                i10 = zzekVar.zzc;
                if (i10 != 0) {
                    q7.b(obj);
                    zzhh zzhhVar = this.zzd;
                    zzem zzemVar = new zzem(this, j10, recaptchaAction, null);
                    zzekVar.zzc = 1;
                    obj = zzemVar.invoke(zzhhVar, zzekVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q7.b(obj);
                }
                return ((f) obj).a;
            }
        }
        zzekVar = new zzek(this, cVar);
        Object obj2 = zzekVar.zza;
        a aVar2 = a.a;
        i10 = zzekVar.zzc;
        if (i10 != 0) {
        }
        return ((f) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-0E7RQCE(RecaptchaAction recaptchaAction, long j10, uc.c cVar) {
        zzei zzeiVar;
        int i10;
        if (cVar instanceof zzei) {
            zzeiVar = (zzei) cVar;
            int i11 = zzeiVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzeiVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzeiVar.zza;
                Object obj2 = a.a;
                i10 = zzeiVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q7.b(obj);
                    return ((f) obj).a;
                }
                q7.b(obj);
                zzeiVar.zzc = 1;
                Object zze = zze(recaptchaAction, j10, zzeiVar);
                return zze == obj2 ? obj2 : zze;
            }
        }
        zzeiVar = new zzei(this, cVar);
        Object obj3 = zzeiVar.zza;
        Object obj22 = a.a;
        i10 = zzeiVar.zzc;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-gIAlu-s(RecaptchaAction recaptchaAction, uc.c cVar) {
        zzej zzejVar;
        int i10;
        if (cVar instanceof zzej) {
            zzejVar = (zzej) cVar;
            int i11 = zzejVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzejVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzejVar.zza;
                Object obj2 = a.a;
                i10 = zzejVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q7.b(obj);
                    return ((f) obj).a;
                }
                q7.b(obj);
                zzejVar.zzc = 1;
                Object obj3 = execute-0E7RQCE(recaptchaAction, 10000L, zzejVar);
                return obj3 == obj2 ? obj2 : obj3;
            }
        }
        zzejVar = new zzej(this, cVar);
        Object obj4 = zzejVar.zza;
        Object obj22 = a.a;
        i10 = zzejVar.zzc;
        if (i10 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzbv.zza(e0.c(((zzcr) ((g) this.zze).a()).zzb(), new zzen(this, recaptchaAction, 10000L, null)));
    }

    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        return zzbv.zza(e0.c(((zzcr) ((g) this.zze).a()).zzb(), new zzen(this, recaptchaAction, j10, null)));
    }
}
