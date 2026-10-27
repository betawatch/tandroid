package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ko(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.k71 k71Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new e5((oo) this.d, 4));
                break;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.b;
                long j11 = this.c;
                y1Var.h = j10;
                y1Var.n = j11;
                org.telegram.ui.Components.m71 m71Var = y1Var.a;
                if (m71Var != null && (k71Var = m71Var.g3) != null && m71Var.G) {
                    k71Var.O(true);
                    break;
                }
                break;
            case 2:
                ui.o oVar = (ui.o) this.d;
                long j12 = this.b;
                long j13 = this.c;
                if (oVar.n == ui.m.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    oVar.q = j14;
                    oVar.s = 0L;
                    oVar.t = ui.o.q(j14);
                    oVar.i();
                    break;
                }
                break;
            default:
                dc.e eVar = (dc.e) this.d;
                long j15 = this.b;
                long j16 = this.c;
                ui.o oVar2 = (ui.o) eVar.c;
                if (j15 == oVar2.p) {
                    oVar2.o = null;
                    oVar2.q += j16;
                    oVar2.r = 0L;
                    oVar2.i.removeCallbacks(oVar2.E);
                    ui.m mVar = oVar2.n;
                    if (mVar != ui.m.s) {
                        if (mVar != ui.m.r) {
                            if (!oVar2.w) {
                                if (mVar == ui.m.d) {
                                    ui.i iVar = oVar2.A;
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
