package ai;

import bi.i6;
import java.util.HashMap;
import org.telegram.messenger.ep;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.b51;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(Object obj, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b51 b51Var;
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.d;
                long j3 = this.b;
                long j10 = this.c;
                l0Var.getClass();
                l0Var.g(j3, Math.max(120L, j10 - j3));
                break;
            case 1:
                mp mpVar = (mp) this.d;
                long j11 = this.b;
                long j12 = this.c;
                a0.h hVar = mpVar.T1;
                HashMap hashMap = mpVar.V1;
                if (j11 == 0) {
                    ep epVar = (ep) hVar.f(j12);
                    if (epVar != null) {
                        mpVar.R(epVar);
                        mpVar.S1.remove(epVar);
                        hVar.l(j12);
                        break;
                    }
                } else {
                    String str = j12 + "_" + j11;
                    ep epVar2 = (ep) hashMap.get(str);
                    if (epVar2 != null) {
                        mpVar.R(epVar2);
                        mpVar.U1.remove(epVar2);
                        hashMap.remove(str);
                        break;
                    }
                }
                break;
            case 2:
                rn.b0((rn) this.d, this.b, this.c);
                break;
            case 3:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.d;
                long j13 = this.b;
                long j14 = this.c;
                n1Var.h = j13;
                n1Var.n = j14;
                i6 i6Var = n1Var.a;
                if (i6Var != null && (b51Var = i6Var.g3) != null && i6Var.H) {
                    b51Var.O(true);
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
                                    yi.h hVar2 = jVar2.z;
                                    if (hVar2 != null) {
                                        long j20 = jVar2.j();
                                        jVar2.r = 0L;
                                        jVar2.s = j20;
                                        jVar2.j.execute(new org.telegram.utils.recorder.audio.c(1, jVar2, hVar2));
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
