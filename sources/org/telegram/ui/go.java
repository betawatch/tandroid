package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ go(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.b71 b71Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new f5((ko) this.d, 4));
                break;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.b;
                long j11 = this.c;
                y1Var.f = j10;
                y1Var.h = j11;
                org.telegram.ui.Components.d71 d71Var = y1Var.a;
                if (d71Var != null && (b71Var = d71Var.Z2) != null && d71Var.G) {
                    b71Var.N(true);
                    break;
                }
                break;
            case 2:
                ri.o oVar = (ri.o) this.d;
                long j12 = this.b;
                long j13 = this.c;
                if (oVar.n == ri.m.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    oVar.q = j14;
                    oVar.s = 0L;
                    oVar.t = ri.o.q(j14);
                    oVar.i();
                    break;
                }
                break;
            default:
                cc.e eVar = (cc.e) this.d;
                long j15 = this.b;
                long j16 = this.c;
                ri.o oVar2 = (ri.o) eVar.c;
                if (j15 == oVar2.p) {
                    oVar2.o = null;
                    oVar2.q += j16;
                    oVar2.r = 0L;
                    oVar2.i.removeCallbacks(oVar2.E);
                    ri.m mVar = oVar2.n;
                    if (mVar != ri.m.s) {
                        if (mVar != ri.m.r) {
                            if (!oVar2.w) {
                                if (mVar == ri.m.d) {
                                    ri.i iVar = oVar2.A;
                                    if (iVar != null) {
                                        long j17 = oVar2.j();
                                        oVar2.s = 0L;
                                        oVar2.t = j17;
                                        oVar2.j.execute(new org.telegram.utils.recorder.audio.c(1, oVar2, iVar));
                                        break;
                                    } else {
                                        oVar2.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                oVar2.w = false;
                                oVar2.i();
                                break;
                            }
                        } else {
                            oVar2.c();
                            oVar2.s();
                            break;
                        }
                    } else {
                        oVar2.c();
                        oVar2.s();
                        oVar2.l("cancelled");
                        break;
                    }
                }
                break;
        }
    }
}
