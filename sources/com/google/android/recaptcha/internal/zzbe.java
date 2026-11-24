package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzbe extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbe(zzbo zzboVar, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzboVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzbe(this.zzc, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29, types: [g7c, java.lang.Object] */
    @Override // og0
    public final Object invokeSuspend(Object obj) {
        zzcd zzcdVar;
        e79 e79Var;
        try {
            if (this.zzb != 0) {
                e79Var = (e79) this.zza;
                tue.b(obj);
            } else {
                tue.b(obj);
                e79Var = new e79();
                zzbd zzbdVar = new zzbd(this.zzc, e79Var, null);
                this.zza = e79Var;
                this.zzb = 1;
                Object a = oxe.a(60000L, zzbdVar, this);
                ly2 ly2Var = ly2.a;
                if (a == ly2Var) {
                    return ly2Var;
                }
            }
            this = g7c.a;
            return this;
        } catch (Exception e) {
            zzbo zzboVar = this.zzc;
            mq2 zzf = zzboVar.zzf();
            Throwable th = (Throwable) e79Var.a;
            if (th == null) {
                th = e;
            }
            ((nq2) zzf).P(th);
            zzboVar.zzc = zzbp.zza;
            zzce zzceVar = zzce.zzb;
            Throwable th2 = (Throwable) e79Var.a;
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
