package ai;

import bi.v3;
import java.util.HashMap;
import org.telegram.messenger.fp;
import org.telegram.messenger.np;
import org.telegram.ui.Components.p41;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(Object obj, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p41 p41Var;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.d;
                long j3 = this.b;
                long j10 = this.c;
                n0Var.getClass();
                n0Var.e(j3, Math.max(120L, j10 - j3));
                break;
            case 1:
                np npVar = (np) this.d;
                long j11 = this.b;
                long j12 = this.c;
                a0.h hVar = npVar.R1;
                HashMap hashMap = npVar.T1;
                if (j11 == 0) {
                    fp fpVar = (fp) hVar.f(j12);
                    if (fpVar != null) {
                        npVar.R(fpVar);
                        npVar.Q1.remove(fpVar);
                        hVar.l(j12);
                        break;
                    }
                } else {
                    String str = j12 + "_" + j11;
                    fp fpVar2 = (fp) hashMap.get(str);
                    if (fpVar2 != null) {
                        npVar.R(fpVar2);
                        npVar.S1.remove(fpVar2);
                        hashMap.remove(str);
                        break;
                    }
                }
                break;
            case 2:
                qn.b0((qn) this.d, this.b, this.c);
                break;
            case 3:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.d;
                long j13 = this.b;
                long j14 = this.c;
                n1Var.h = j13;
                n1Var.n = j14;
                v3 v3Var = n1Var.a;
                if (v3Var != null && (p41Var = v3Var.g3) != null && v3Var.H) {
                    p41Var.O(true);
                    break;
                }
                break;
            case 4:
                yi.j jVar = (yi.j) this.d;
                long j15 = this.b;
                long j16 = this.c;
                if (jVar.G == 7) {
                    long j17 = ((j15 - j16) * 48000) / 1000;
                    jVar.p = j17;
                    jVar.r = 0L;
                    jVar.s = yi.j.r(j17);
                    jVar.i();
                    break;
                }
                break;
            default:
                ac.e eVar = (ac.e) this.d;
                long j18 = this.b;
                long j19 = this.c;
                yi.j jVar2 = (yi.j) eVar.c;
                if (j18 == jVar2.o) {
                    jVar2.n = null;
                    jVar2.p += j19;
                    jVar2.q = 0L;
                    jVar2.i.removeCallbacks(jVar2.D);
                    int i7 = jVar2.G;
                    if (i7 != 10) {
                        if (i7 != 9) {
                            if (!jVar2.v) {
                                if (i7 == 4) {
                                    yi.i iVar = jVar2.z;
                                    if (iVar != null) {
                                        long j20 = jVar2.j();
                                        jVar2.r = 0L;
                                        jVar2.s = j20;
                                        jVar2.j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, iVar));
                                        break;
                                    } else {
                                        jVar2.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                jVar2.v = false;
                                jVar2.i();
                                break;
                            }
                        } else {
                            jVar2.c();
                            jVar2.t();
                            break;
                        }
                    } else {
                        jVar2.c();
                        jVar2.t();
                        jVar2.l("cancelled");
                        break;
                    }
                }
                break;
        }
    }
}
