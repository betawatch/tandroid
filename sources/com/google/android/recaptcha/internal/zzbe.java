package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzbe extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbe(zzbo zzboVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzboVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzbe(this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29, types: [g5c, java.lang.Object] */
    @Override // of0
    public final Object invokeSuspend(Object obj) {
        zzcd zzcdVar;
        c59 c59Var;
        try {
            if (this.zzb != 0) {
                c59Var = (c59) this.zza;
                qse.b(obj);
            } else {
                qse.b(obj);
                c59Var = new c59();
                zzbd zzbdVar = new zzbd(this.zzc, c59Var, null);
                this.zza = c59Var;
                this.zzb = 1;
                Object a = mve.a(60000L, zzbdVar, this);
                bx2 bx2Var = bx2.a;
                if (a == bx2Var) {
                    return bx2Var;
                }
            }
            this = g5c.a;
            return this;
        } catch (Exception e) {
            zzbo zzboVar = this.zzc;
            bp2 zzf = zzboVar.zzf();
            Throwable th = (Throwable) c59Var.a;
            if (th == null) {
                th = e;
            }
            ((cp2) zzf).P(th);
            zzboVar.zzc = zzbp.zza;
            zzce zzceVar = zzce.zzb;
            Throwable th2 = (Throwable) c59Var.a;
            if (th2 == null) {
                th2 = e;
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
            throw new zzcg(zzceVar, zzcdVar, e.getMessage(), null, 8, null);
        }
    }
}
