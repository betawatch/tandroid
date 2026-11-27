package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzbe extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbe(zzbo zzboVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = zzboVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzbe(this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29, types: [f9c, java.lang.Object] */
    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzcd zzcdVar;
        p89 p89Var;
        try {
            if (this.zzb != 0) {
                p89Var = (p89) this.zza;
                ixe.b(obj);
            } else {
                ixe.b(obj);
                p89Var = new p89();
                zzbd zzbdVar = new zzbd(this.zzc, p89Var, null);
                this.zza = p89Var;
                this.zzb = 1;
                Object a = e0f.a(60000L, zzbdVar, this);
                vx2 vx2Var = vx2.a;
                if (a == vx2Var) {
                    return vx2Var;
                }
            }
            this = f9c.a;
            return this;
        } catch (Exception e) {
            zzbo zzboVar = this.zzc;
            up2 zzf = zzboVar.zzf();
            Throwable th = (Throwable) p89Var.a;
            if (th == null) {
                th = e;
            }
            ((vp2) zzf).P(th);
            zzboVar.zzc = zzbp.zza;
            zzce zzceVar = zzce.zzb;
            Throwable th2 = (Throwable) p89Var.a;
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
