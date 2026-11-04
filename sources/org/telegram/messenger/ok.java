package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.ui.Components.f41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ok(Object obj, long j10, long j11, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f41 f41Var;
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.d;
                long j10 = this.b;
                long j11 = this.c;
                a0.h hVar = hpVar.R1;
                HashMap hashMap = hpVar.T1;
                if (j10 == 0) {
                    zo zoVar = (zo) hVar.f(j11);
                    if (zoVar != null) {
                        hpVar.R(zoVar);
                        hpVar.Q1.remove(zoVar);
                        hVar.l(j11);
                        break;
                    }
                } else {
                    String str = j11 + "_" + j10;
                    zo zoVar2 = (zo) hashMap.get(str);
                    if (zoVar2 != null) {
                        hpVar.R(zoVar2);
                        hpVar.S1.remove(zoVar2);
                        hashMap.remove(str);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ln.b0((org.telegram.ui.ln) this.d, this.b, this.c);
                break;
            case 2:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.d;
                long j12 = this.b;
                long j13 = this.c;
                m1Var.h = j12;
                m1Var.n = j13;
                ai.h4 h4Var = m1Var.a;
                if (h4Var != null && (f41Var = h4Var.g3) != null && h4Var.H) {
                    f41Var.O(true);
                    break;
                }
                break;
            case 3:
                vi.j jVar = (vi.j) this.d;
                long j14 = this.b;
                long j15 = this.c;
                if (jVar.G == 7) {
                    long j16 = ((j14 - j15) * 48000) / 1000;
                    jVar.p = j16;
                    jVar.r = 0L;
                    jVar.s = vi.j.r(j16);
                    jVar.i();
                    break;
                }
                break;
            default:
                vi.f fVar = (vi.f) this.d;
                long j17 = this.b;
                long j18 = this.c;
                vi.j jVar2 = (vi.j) fVar.c;
                if (j17 == jVar2.o) {
                    jVar2.n = null;
                    jVar2.p += j18;
                    jVar2.q = 0L;
                    jVar2.i.removeCallbacks(jVar2.D);
                    int i3 = jVar2.G;
                    if (i3 != 10) {
                        if (i3 != 9) {
                            if (!jVar2.v) {
                                if (i3 == 4) {
                                    vi.i iVar = jVar2.z;
                                    if (iVar != null) {
                                        long j19 = jVar2.j();
                                        jVar2.r = 0L;
                                        jVar2.s = j19;
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
