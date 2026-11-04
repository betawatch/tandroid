package com.google.android.recaptcha.internal;

import b8.ib;
import com.google.android.play.core.integrity.StandardIntegrityException;
import dd.k;
import fd.c;
import hd.j;
import kotlin.jvm.internal.r;
import od.p;
import wd.b0;
import wd.s;
import wd.t;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzbe(this.zzc, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        zzcd zzcdVar;
        gd.a aVar = gd.a.a;
        r rVar = this.zzb;
        try {
            if (rVar != 0) {
                r rVar2 = (r) this.zza;
                ib.b(obj);
                rVar = rVar2;
            } else {
                ib.b(obj);
                r rVar3 = new r();
                zzbd zzbdVar = new zzbd(this.zzc, rVar3, null);
                this.zza = rVar3;
                this.zzb = 1;
                rVar = rVar3;
                if (b0.z(60000L, zzbdVar, this) == aVar) {
                    return aVar;
                }
            }
            return k.a;
        } catch (Exception e10) {
            zzbo zzboVar = this.zzc;
            s zzf = zzboVar.zzf();
            Throwable th2 = (Throwable) rVar.a;
            if (th2 == null) {
                th2 = e10;
            }
            ((t) zzf).Q(th2);
            zzboVar.zzc = zzbp.zza;
            zzce zzceVar = zzce.zzb;
            Throwable th3 = (Throwable) rVar.a;
            if (th3 == null) {
                th3 = e10;
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
            throw new zzcg(zzceVar, zzcdVar, e10.getMessage(), null, 8, null);
        }
    }
}
