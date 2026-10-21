package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eo(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.u61 u61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new g5((io) this.d, 4));
                break;
            case 1:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.d;
                long j10 = this.b;
                long j11 = this.c;
                x1Var.f = j10;
                x1Var.h = j11;
                org.telegram.ui.Components.w61 w61Var = x1Var.a;
                if (w61Var != null && (u61Var = w61Var.W2) != null && w61Var.G) {
                    u61Var.N(true);
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
