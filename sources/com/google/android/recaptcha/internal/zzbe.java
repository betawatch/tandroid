package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;
import zd.e0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzbe extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbe(zzbo zzboVar, c cVar) {
        super(2, cVar);
        this.zzc = zzboVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzbe(this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzcd zzcdVar;
        a aVar = a.a;
        kotlin.jvm.internal.p pVar = this.zzb;
        try {
            if (pVar != 0) {
                kotlin.jvm.internal.p pVar2 = (kotlin.jvm.internal.p) this.zza;
                t7.b(obj);
                pVar = pVar2;
            } else {
                t7.b(obj);
                kotlin.jvm.internal.p pVar3 = new kotlin.jvm.internal.p();
                zzbd zzbdVar = new zzbd(this.zzc, pVar3, null);
                this.zza = pVar3;
                this.zzb = 1;
                pVar = pVar3;
                if (e0.x(60000L, zzbdVar, this) == aVar) {
                    return aVar;
                }
            }
            return i.a;
        } catch (Exception e7) {
            zzbo zzboVar = this.zzc;
            s zzf = zzboVar.zzf();
            Throwable th2 = (Throwable) pVar.a;
            if (th2 == null) {
                th2 = e7;
            }
            ((t) zzf).L(th2);
            zzboVar.zzc = zzbp.zza;
            zzce zzceVar = zzce.zzb;
            Throwable th3 = (Throwable) pVar.a;
            if (th3 == null) {
                th3 = e7;
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
            throw new zzcg(zzceVar, zzcdVar, e7.getMessage(), null, 8, null);
        }
    }
}
