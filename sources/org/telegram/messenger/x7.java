package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg.f b;

    public /* synthetic */ x7(lg.f fVar, int i7) {
        this.a = i7;
        this.b = fVar;
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
        i7 i7Var;
        int i7;
        int i10;
        switch (this.a) {
            case 0:
                this.b.b(false);
                break;
            default:
                lg.f fVar = this.b;
                int i11 = fVar.a == 1 ? qp.s1(fVar.b).d0 : qp.s1(fVar.b).e0;
                ((ArrayList) fVar.e).clear();
                if (fVar.a == 1 && !((ArrayList) fVar.d).isEmpty()) {
                    i7Var = (i7) ((ArrayList) fVar.d).get(0);
                    if (i7Var.j && i7Var.W0 >= 1048576 && !i7Var.a && i7Var.Y != 3) {
                        if (i7Var.k) {
                            long j3 = i7Var.a0;
                            int i12 = i7Var.J;
                            if (i12 <= 0) {
                                i12 = 1048576;
                            }
                            break;
                        }
                        ((p5) fVar.f).a((x7) fVar.g);
                        ((p5) fVar.f).d((x7) fVar.g, 250L);
                        i7 = 0;
                        boolean z9 = false;
                        int i13 = 0;
                        while (i7 < ((ArrayList) fVar.d).size()) {
                            i7 i7Var2 = i7 > 0 ? (i7) ((ArrayList) fVar.d).get(i7 - 1) : null;
                            i7 i7Var3 = (i7) ((ArrayList) fVar.d).get(i7);
                            if (i7Var == null || i7Var3 == i7Var || (i7Var3.p0 == i7Var.p0 && b6.g())) {
                                if (i7 > 0 && !z9) {
                                    if (fVar.a == 1 && i7Var2 != null && i7Var2.j && i7Var2.W0 >= 1048576 && i7Var3.W0 <= 0) {
                                        z9 = true;
                                    }
                                    if (i13 > 0 && i7Var3.W0 == 0) {
                                        z9 = true;
                                    }
                                }
                                if (i7Var3.a) {
                                    i11++;
                                } else {
                                    if (!z9 && i7 < i11) {
                                        ((ArrayList) fVar.e).add(i7Var3);
                                    } else if (i7Var3.S && !i7Var3.Z) {
                                        i7Var3.l();
                                    }
                                    i13 = i7Var3.W0;
                                }
                            } else if (i7Var3.S && !i7Var3.Z) {
                                i7Var3.l();
                            }
                            i7++;
                        }
                        for (i10 = 0; i10 < ((ArrayList) fVar.e).size(); i10++) {
                            ((i7) ((ArrayList) fVar.e).get(i10)).r();
                        }
                        fVar.c = false;
                        break;
                    }
                }
                i7Var = null;
                i7 = 0;
                boolean z92 = false;
                int i132 = 0;
                while (i7 < ((ArrayList) fVar.d).size()) {
                }
                while (i10 < ((ArrayList) fVar.e).size()) {
                }
                fVar.c = false;
                break;
        }
    }
}
