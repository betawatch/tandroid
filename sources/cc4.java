// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class cc4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u30 b;

    public /* synthetic */ cc4(u30 u30Var, byte b) {
        this.a = b;
        this.b = u30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r6 < r8) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111 A[LOOP:1: B:81:0x0107->B:83:0x0111, LOOP_END] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        lb4 lb4Var;
        int i;
        int i2;
        byte b = this.a;
        u30 u30Var = this.b;
        switch (b) {
            case 0:
                u30Var.b(false);
                break;
            default:
                boolean z = u30Var.a;
                int i3 = u30Var.b;
                int f = (z ? oc7.r1(i3).l4.f3 : oc7.r1(i3).l4.g3).f();
                ((ArrayList) u30Var.e).clear();
                if (u30Var.a && !((ArrayList) u30Var.d).isEmpty()) {
                    lb4Var = (lb4) ((ArrayList) u30Var.d).get(0);
                    if (lb4Var.j && lb4Var.W0 >= 1048576 && !lb4Var.a && lb4Var.Y != 3) {
                        if (lb4Var.k) {
                            long j = lb4Var.a0;
                            int i4 = lb4Var.J;
                            if (i4 <= 0) {
                                i4 = 1048576;
                            }
                            break;
                        }
                        ((mp3) u30Var.f).a((cc4) u30Var.g);
                        ((mp3) u30Var.f).d((cc4) u30Var.g, 250L);
                        i = 0;
                        boolean z2 = false;
                        int i5 = 0;
                        while (i < ((ArrayList) u30Var.d).size()) {
                            lb4 lb4Var2 = i > 0 ? (lb4) ((ArrayList) u30Var.d).get(i - 1) : null;
                            lb4 lb4Var3 = (lb4) ((ArrayList) u30Var.d).get(i);
                            if (lb4Var == null || lb4Var3 == lb4Var || (lb4Var3.p0 == lb4Var.p0 && ir3.d())) {
                                if (i > 0 && !z2) {
                                    if (u30Var.a && lb4Var2 != null && lb4Var2.j && lb4Var2.W0 >= 1048576 && lb4Var3.W0 <= 0) {
                                        z2 = true;
                                    }
                                    if (i5 > 0 && lb4Var3.W0 == 0) {
                                        z2 = true;
                                    }
                                }
                                if (lb4Var3.a) {
                                    f++;
                                } else {
                                    if (!z2 && i < f) {
                                        ((ArrayList) u30Var.e).add(lb4Var3);
                                    } else if (lb4Var3.S && !lb4Var3.Z) {
                                        lb4Var3.j();
                                    }
                                    i5 = lb4Var3.W0;
                                }
                            } else if (lb4Var3.S && !lb4Var3.Z) {
                                lb4Var3.j();
                            }
                            i++;
                        }
                        for (i2 = 0; i2 < ((ArrayList) u30Var.e).size(); i2++) {
                            ((lb4) ((ArrayList) u30Var.e).get(i2)).p();
                        }
                        u30Var.c = false;
                        break;
                    }
                }
                lb4Var = null;
                i = 0;
                boolean z22 = false;
                int i52 = 0;
                while (i < ((ArrayList) u30Var.d).size()) {
                }
                while (i2 < ((ArrayList) u30Var.e).size()) {
                }
                u30Var.c = false;
                break;
        }
    }
}
