package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import dd.p;
import k7.q7;
import kotlin.jvm.internal.q;
import ld.c0;
import ld.e0;
import ld.s;
import ld.t;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzbe extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbe(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zzc = zzboVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzbe(this.zzc, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        zzcd zzcdVar;
        a aVar = a.a;
        q qVar = this.zzb;
        try {
            if (qVar != 0) {
                q qVar2 = (q) this.zza;
                q7.b(obj);
                qVar = qVar2;
            } else {
                q7.b(obj);
                q qVar3 = new q();
                zzbd zzbdVar = new zzbd(this.zzc, qVar3, null);
                this.zza = qVar3;
                this.zzb = 1;
                qVar = qVar3;
                if (e0.x(60000L, zzbdVar, this) == aVar) {
                    return aVar;
                }
            }
            return sc.i.a;
        } catch (Exception e6) {
            zzbo zzboVar = this.zzc;
            s zzf = zzboVar.zzf();
            Throwable th2 = (Throwable) qVar.a;
            if (th2 == null) {
                th2 = e6;
            }
            ((t) zzf).L(th2);
            zzboVar.zzc = zzbp.zza;
            zzce zzceVar = zzce.zzb;
            Throwable th3 = (Throwable) qVar.a;
            if (th3 == null) {
                th3 = e6;
            }
            if (th3 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) th3).getErrorCode();
                if (errorCode == -100) {
                    zzcdVar = zzcd.zzaV;
                } else if (errorCode == -12) {
                    zzcdVar = zzcd.zzaO;
                } else if (errorCode == -3) {
                    zzcdVar = zzcd.zzaI;
                } else if (errorCode == -2) {
                    zzcdVar = zzcd.zzaH;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case -19:
                            zzcdVar = zzcd.zzaU;
                            break;
                        case -18:
                            zzcdVar = zzcd.zzaT;
                            break;
                        case -17:
                            zzcdVar = zzcd.zzaS;
                            break;
                        case -16:
                            zzcdVar = zzcd.zzaR;
                            break;
                        case -15:
                            zzcdVar = zzcd.zzaQ;
                            break;
                        case -14:
                            zzcdVar = zzcd.zzaP;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    zzcdVar = zzcd.zzaN;
                                    break;
                                case -8:
                                    zzcdVar = zzcd.zzaM;
                                    break;
                                case -7:
                                    zzcdVar = zzcd.zzaL;
                                    break;
                                case -6:
                                    zzcdVar = zzcd.zzaK;
                                    break;
                                case -5:
                                    zzcdVar = zzcd.zzaJ;
                                    break;
                                default:
                                    zzcdVar = zzcd.zza;
                                    break;
                            }
                    }
                } else {
                    zzcdVar = zzcd.zzaG;
                }
            } else {
                zzcdVar = zzcd.zza;
            }
            throw new zzcg(zzceVar, zzcdVar, e6.getMessage(), null, 8, null);
        }
    }
}
