package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import g7.y5;
import hd.c0;
import hd.f0;
import hd.s;
import hd.t;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzbe(this.zzc, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        zzcd zzcdVar;
        a aVar = a.a;
        kotlin.jvm.internal.p pVar = this.zzb;
        try {
            if (pVar != 0) {
                kotlin.jvm.internal.p pVar2 = (kotlin.jvm.internal.p) this.zza;
                y5.b(obj);
                pVar = pVar2;
            } else {
                y5.b(obj);
                kotlin.jvm.internal.p pVar3 = new kotlin.jvm.internal.p();
                zzbd zzbdVar = new zzbd(this.zzc, pVar3, null);
                this.zza = pVar3;
                this.zzb = 1;
                pVar = pVar3;
                if (f0.x(60000L, zzbdVar, this) == aVar) {
                    return aVar;
                }
            }
            return oc.i.a;
        } catch (Exception e10) {
            zzbo zzboVar = this.zzc;
            s zzf = zzboVar.zzf();
            Throwable th = (Throwable) pVar.a;
            if (th == null) {
                th = e10;
            }
            ((t) zzf).L(th);
            zzboVar.zzc = zzbp.zza;
            zzce zzceVar = zzce.zzb;
            Throwable th2 = (Throwable) pVar.a;
            if (th2 == null) {
                th2 = e10;
            }
            if (th2 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) th2).getErrorCode();
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
            throw new zzcg(zzceVar, zzcdVar, e10.getMessage(), null, 8, null);
        }
    }
}
