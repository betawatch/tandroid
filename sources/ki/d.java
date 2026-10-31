package ki;

import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.oo;
import org.telegram.ui.web.p1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p51 p51Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                long j10 = this.b;
                long j11 = this.c;
                if (kVar.G == 7) {
                    long j12 = ((j10 - j11) * 48000) / 1000;
                    kVar.p = j12;
                    kVar.r = 0L;
                    kVar.s = k.r(j12);
                    kVar.i();
                    break;
                }
                break;
            case 1:
                g gVar = (g) this.d;
                long j13 = this.b;
                long j14 = this.c;
                k kVar2 = (k) gVar.c;
                if (j13 == kVar2.o) {
                    kVar2.n = null;
                    kVar2.p += j14;
                    kVar2.q = 0L;
                    kVar2.i.removeCallbacks(kVar2.D);
                    int i10 = kVar2.G;
                    if (i10 != 10) {
                        if (i10 != 9) {
                            if (!kVar2.v) {
                                if (i10 == 4) {
                                    j jVar = kVar2.z;
                                    if (jVar != null) {
                                        long j15 = kVar2.j();
                                        kVar2.r = 0L;
                                        kVar2.s = j15;
                                        kVar2.j.execute(new org.telegram.utils.recorder.audio.c(1, kVar2, jVar));
                                        break;
                                    } else {
                                        kVar2.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                kVar2.v = false;
                                kVar2.i();
                                break;
                            }
                        } else {
                            kVar2.c();
                            kVar2.t();
                            break;
                        }
                    } else {
                        kVar2.c();
                        kVar2.t();
                        kVar2.l("cancelled");
                        break;
                    }
                }
                break;
            case 2:
                vp vpVar = (vp) this.d;
                long j16 = this.b;
                long j17 = this.c;
                a0.h hVar = vpVar.Q1;
                HashMap hashMap = vpVar.S1;
                if (j16 == 0) {
                    np npVar = (np) hVar.f(j17);
                    if (npVar != null) {
                        vpVar.R(npVar);
                        vpVar.P1.remove(npVar);
                        hVar.l(j17);
                        break;
                    }
                } else {
                    String str = j17 + "_" + j16;
                    np npVar2 = (np) hashMap.get(str);
                    if (npVar2 != null) {
                        vpVar.R(npVar2);
                        vpVar.R1.remove(npVar2);
                        hashMap.remove(str);
                        break;
                    }
                }
                break;
            case 3:
                oo.a0((oo) this.d, this.b, this.c);
                break;
            default:
                p1 p1Var = (p1) this.d;
                long j18 = this.b;
                long j19 = this.c;
                p1Var.h = j18;
                p1Var.n = j19;
                ii iiVar = p1Var.a;
                if (iiVar != null && (p51Var = iiVar.f3) != null && iiVar.G) {
                    p51Var.O(true);
                    break;
                }
                break;
        }
    }
}
