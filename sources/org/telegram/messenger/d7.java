package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d7(i7 i7Var, boolean z10, int i3) {
        this.a = i3;
        this.b = i7Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                try {
                    i7Var.k(0, this.c, false);
                    break;
                } catch (Exception unused) {
                    i7Var.j(0, false);
                    return;
                }
            case 1:
                i7 i7Var2 = this.b;
                i7Var2.Q = 0L;
                i7Var2.e(null, true, true);
                i7Var2.y = this.c;
                if (i7Var2.j0 != 0 && !i7Var2.e && !i7Var2.j && !i7Var2.r0) {
                    i7Var2.t();
                }
                i7Var2.s(-1);
                break;
            default:
                i7 i7Var3 = this.b;
                String str = i7Var3.P0;
                if (r2.a) {
                    a8.b("finished downloading file to " + i7Var3.L0 + " time = " + (System.currentTimeMillis() - i7Var3.d1) + " dc = " + i7Var3.T + " size = " + g0.i0(i7Var3.b0, false, false));
                }
                if (this.c) {
                    int i3 = i7Var3.b1;
                    if (i3 == 50331648) {
                        bz.e(i7Var3.R).i(t0.f(), 3, 1);
                    } else if (i3 == 33554432) {
                        bz.e(i7Var3.R).i(t0.f(), 2, 1);
                    } else if (i3 == 16777216) {
                        bz.e(i7Var3.R).i(t0.f(), 4, 1);
                    } else if (i3 == 67108864) {
                        if (str == null || !(str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            bz.e(i7Var3.R).i(t0.f(), 5, 1);
                        } else {
                            bz.e(i7Var3.R).i(t0.f(), 7, 1);
                        }
                    }
                }
                i7Var3.g0.c(i7Var3, i7Var3.L0);
                break;
        }
    }
}
