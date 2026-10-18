package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.ay0;
import ri.j;
import ri.p;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        org.telegram.ui.Components.s61 s61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new g5((ko) this.d, 4));
                break;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.b;
                long j11 = this.c;
                y1Var.f = j10;
                y1Var.h = j11;
                org.telegram.ui.Components.u61 u61Var = y1Var.a;
                if (u61Var != null && (s61Var = u61Var.W2) != null && u61Var.G) {
                    s61Var.N(true);
                    break;
                }
                break;
            case 2:
                ri.p pVar = (ri.p) this.d;
                long j12 = this.b;
                long j13 = this.c;
                if (pVar.m == ri.n.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    pVar.p = j14;
                    pVar.r = 0L;
                    pVar.s = ri.p.q(j14);
                    pVar.i();
                    break;
                }
                break;
            default:
                cc.e eVar = (cc.e) this.d;
                long j15 = this.b;
                long j16 = this.c;
                final ri.p pVar2 = (ri.p) eVar.c;
                if (j15 == pVar2.o) {
                    pVar2.n = null;
                    pVar2.p += j16;
                    pVar2.q = 0L;
                    pVar2.h.removeCallbacks(pVar2.D);
                    ri.n nVar = pVar2.m;
                    if (nVar != ri.n.s) {
                        if (nVar != ri.n.r) {
                            if (!pVar2.v) {
                                if (nVar == ri.n.d) {
                                    final ri.j jVar = pVar2.z;
                                    if (jVar != null) {
                                        long j17 = pVar2.j();
                                        pVar2.r = 0L;
                                        pVar2.s = j17;
                                        pVar2.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.d
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte[] bArr;
                                                p pVar3 = p.this;
                                                j jVar2 = jVar;
                                                try {
                                                    bArr = AudioRecorderNative.e(jVar2.b.getAbsolutePath());
                                                } catch (Throwable th2) {
                                                    pVar3.g.a("waveform extraction failed", th2);
                                                    bArr = null;
                                                }
                                                pVar3.h.post(new ay0(pVar3, jVar2, bArr, 16));
                                            }
                                        });
                                        break;
                                    } else {
                                        pVar2.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                pVar2.v = false;
                                pVar2.i();
                                break;
                            }
                        } else {
                            pVar2.c();
                            pVar2.s();
                            break;
                        }
                    } else {
                        pVar2.c();
                        pVar2.s();
                        pVar2.l("cancelled");
                        break;
                    }
                }
                break;
        }
    }
}
