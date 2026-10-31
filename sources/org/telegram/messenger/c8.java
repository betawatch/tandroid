package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg.h b;

    public /* synthetic */ c8(bg.h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r7 >= r9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e A[LOOP:1: B:80:0x0104->B:82:0x010e, LOOP_END] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m7 m7Var;
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                this.b.b(false);
                break;
            default:
                bg.h hVar = this.b;
                int i12 = hVar.a == 1 ? vp.r1(hVar.b).d0 : vp.r1(hVar.b).e0;
                ((ArrayList) hVar.e).clear();
                if (hVar.a == 1 && !((ArrayList) hVar.d).isEmpty()) {
                    m7Var = (m7) ((ArrayList) hVar.d).get(0);
                    if (m7Var.j && m7Var.W0 >= 1048576 && !m7Var.a && m7Var.Y != 3) {
                        if (m7Var.k) {
                            long j10 = m7Var.a0;
                            int i13 = m7Var.J;
                            if (i13 <= 0) {
                                i13 = 1048576;
                            }
                            break;
                        }
                        ((r5) hVar.f).a((c8) hVar.g);
                        ((r5) hVar.f).d((c8) hVar.g, 250L);
                        i10 = 0;
                        boolean z10 = false;
                        int i14 = 0;
                        while (i10 < ((ArrayList) hVar.d).size()) {
                            m7 m7Var2 = i10 > 0 ? (m7) ((ArrayList) hVar.d).get(i10 - 1) : null;
                            m7 m7Var3 = (m7) ((ArrayList) hVar.d).get(i10);
                            if (m7Var == null || m7Var3 == m7Var || (m7Var3.p0 == m7Var.p0 && d6.g())) {
                                if (i10 > 0 && !z10) {
                                    if (hVar.a == 1 && m7Var2 != null && m7Var2.j && m7Var2.W0 >= 1048576 && m7Var3.W0 <= 0) {
                                        z10 = true;
                                    }
                                    if (i14 > 0 && m7Var3.W0 == 0) {
                                        z10 = true;
                                    }
                                }
                                if (m7Var3.a) {
                                    i12++;
                                } else {
                                    if (!z10 && i10 < i12) {
                                        ((ArrayList) hVar.e).add(m7Var3);
                                    } else if (m7Var3.S && !m7Var3.Z) {
                                        m7Var3.l();
                                    }
                                    i14 = m7Var3.W0;
                                }
                            } else if (m7Var3.S && !m7Var3.Z) {
                                m7Var3.l();
                            }
                            i10++;
                        }
                        for (i11 = 0; i11 < ((ArrayList) hVar.e).size(); i11++) {
                            ((m7) ((ArrayList) hVar.e).get(i11)).r();
                        }
                        hVar.c = false;
                        break;
                    }
                }
                m7Var = null;
                i10 = 0;
                boolean z102 = false;
                int i142 = 0;
                while (i10 < ((ArrayList) hVar.d).size()) {
                }
                while (i11 < ((ArrayList) hVar.e).size()) {
                }
                hVar.c = false;
                break;
        }
    }
}
