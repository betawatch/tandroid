package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d7(i7 i7Var, boolean z9, int i7) {
        this.a = i7;
        this.b = i7Var;
        this.c = z9;
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
                    int i7 = i7Var3.b1;
                    if (i7 == 50331648) {
                        jz.e(i7Var3.R).i(t0.f(), 3, 1);
                    } else if (i7 == 33554432) {
                        jz.e(i7Var3.R).i(t0.f(), 2, 1);
                    } else if (i7 == 16777216) {
                        jz.e(i7Var3.R).i(t0.f(), 4, 1);
                    } else if (i7 == 67108864) {
                        if (str == null || !(str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            jz.e(i7Var3.R).i(t0.f(), 5, 1);
                        } else {
                            jz.e(i7Var3.R).i(t0.f(), 7, 1);
                        }
                    }
                }
                i7Var3.g0.c(i7Var3, i7Var3.L0);
                break;
        }
    }
}
