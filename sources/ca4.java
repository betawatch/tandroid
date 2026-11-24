// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ca4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u20 b;

    public /* synthetic */ ca4(u20 u20Var, byte b) {
        this.a = b;
        this.b = u20Var;
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
        l94 l94Var;
        int i;
        int i2;
        byte b = this.a;
        u20 u20Var = this.b;
        switch (b) {
            case 0:
                u20Var.b(false);
                break;
            default:
                boolean z = u20Var.a;
                int i3 = u20Var.b;
                int f = (z ? na7.q1(i3).k4.f3 : na7.q1(i3).k4.g3).f();
                ((ArrayList) u20Var.e).clear();
                if (u20Var.a && !((ArrayList) u20Var.d).isEmpty()) {
                    l94Var = (l94) ((ArrayList) u20Var.d).get(0);
                    if (l94Var.j && l94Var.W0 >= 1048576 && !l94Var.a && l94Var.Y != 3) {
                        if (l94Var.k) {
                            long j = l94Var.a0;
                            int i4 = l94Var.J;
                            if (i4 <= 0) {
                                i4 = 1048576;
                            }
                            break;
                        }
                        ((co3) u20Var.f).a((ca4) u20Var.g);
                        ((co3) u20Var.f).d((ca4) u20Var.g, 250L);
                        i = 0;
                        boolean z2 = false;
                        int i5 = 0;
                        while (i < ((ArrayList) u20Var.d).size()) {
                            l94 l94Var2 = i > 0 ? (l94) ((ArrayList) u20Var.d).get(i - 1) : null;
                            l94 l94Var3 = (l94) ((ArrayList) u20Var.d).get(i);
                            if (l94Var == null || l94Var3 == l94Var || (l94Var3.p0 == l94Var.p0 && yp3.d())) {
                                if (i > 0 && !z2) {
                                    if (u20Var.a && l94Var2 != null && l94Var2.j && l94Var2.W0 >= 1048576 && l94Var3.W0 <= 0) {
                                        z2 = true;
                                    }
                                    if (i5 > 0 && l94Var3.W0 == 0) {
                                        z2 = true;
                                    }
                                }
                                if (l94Var3.a) {
                                    f++;
                                } else {
                                    if (!z2 && i < f) {
                                        ((ArrayList) u20Var.e).add(l94Var3);
                                    } else if (l94Var3.S && !l94Var3.Z) {
                                        l94Var3.j();
                                    }
                                    i5 = l94Var3.W0;
                                }
                            } else if (l94Var3.S && !l94Var3.Z) {
                                l94Var3.j();
                            }
                            i++;
                        }
                        for (i2 = 0; i2 < ((ArrayList) u20Var.e).size(); i2++) {
                            ((l94) ((ArrayList) u20Var.e).get(i2)).p();
                        }
                        u20Var.c = false;
                        break;
                    }
                }
                l94Var = null;
                i = 0;
                boolean z22 = false;
                int i52 = 0;
                while (i < ((ArrayList) u20Var.d).size()) {
                }
                while (i2 < ((ArrayList) u20Var.e).size()) {
                }
                u20Var.c = false;
                break;
        }
    }
}
