package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.ui.Components.m41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xk(Object obj, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m41 m41Var;
        switch (this.a) {
            case 0:
                qp qpVar = (qp) this.d;
                long j3 = this.b;
                long j10 = this.c;
                a0.h hVar = qpVar.Q1;
                HashMap hashMap = qpVar.S1;
                if (j3 == 0) {
                    ip ipVar = (ip) hVar.f(j10);
                    if (ipVar != null) {
                        qpVar.R(ipVar);
                        qpVar.P1.remove(ipVar);
                        hVar.l(j10);
                        break;
                    }
                } else {
                    String str = j10 + "_" + j3;
                    ip ipVar2 = (ip) hashMap.get(str);
                    if (ipVar2 != null) {
                        qpVar.R(ipVar2);
                        qpVar.R1.remove(ipVar2);
                        hashMap.remove(str);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.rn.b0((org.telegram.ui.rn) this.d, this.b, this.c);
                break;
            case 2:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.d;
                long j11 = this.b;
                long j12 = this.c;
                o1Var.h = j11;
                o1Var.n = j12;
                fi.w3 w3Var = o1Var.a;
                if (w3Var != null && (m41Var = w3Var.f3) != null && w3Var.G) {
                    m41Var.O(true);
                    break;
                }
                break;
            case 3:
                vi.h hVar2 = (vi.h) this.d;
                long j13 = this.b;
                long j14 = this.c;
                if (hVar2.G == 7) {
                    long j15 = ((j13 - j14) * 48000) / 1000;
                    hVar2.p = j15;
                    hVar2.r = 0L;
                    hVar2.s = vi.h.r(j15);
                    hVar2.i();
                    break;
                }
                break;
            default:
                ac.e eVar = (ac.e) this.d;
                long j16 = this.b;
                long j17 = this.c;
                vi.h hVar3 = (vi.h) eVar.c;
                if (j16 == hVar3.o) {
                    hVar3.n = null;
                    hVar3.p += j17;
                    hVar3.q = 0L;
                    hVar3.i.removeCallbacks(hVar3.D);
                    int i7 = hVar3.G;
                    if (i7 != 10) {
                        if (i7 != 9) {
                            if (!hVar3.v) {
                                if (i7 == 4) {
                                    vi.g gVar = hVar3.z;
                                    if (gVar != null) {
                                        long j18 = hVar3.j();
                                        hVar3.r = 0L;
                                        hVar3.s = j18;
                                        hVar3.j.execute(new org.telegram.utils.recorder.audio.c(1, hVar3, gVar));
                                        break;
                                    } else {
                                        hVar3.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                hVar3.v = false;
                                hVar3.i();
                                break;
                            }
                        } else {
                            hVar3.c();
                            hVar3.t();
                            break;
                        }
                    } else {
                        hVar3.c();
                        hVar3.t();
                        hVar3.l("cancelled");
                        break;
                    }
                }
                break;
        }
    }
}
