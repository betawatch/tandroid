package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ h7(m7 m7Var, boolean z10, int i10) {
        this.a = i10;
        this.b = m7Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                try {
                    m7Var.k(0, this.c, false);
                    break;
                } catch (Exception unused) {
                    m7Var.j(0, false);
                    return;
                }
            case 1:
                m7 m7Var2 = this.b;
                m7Var2.Q = 0L;
                m7Var2.e(null, true, true);
                m7Var2.y = this.c;
                if (m7Var2.j0 != 0 && !m7Var2.e && !m7Var2.j && !m7Var2.r0) {
                    m7Var2.t();
                }
                m7Var2.s(-1);
                break;
            default:
                m7 m7Var3 = this.b;
                String str = m7Var3.P0;
                if (v2.a) {
                    f8.b("finished downloading file to " + m7Var3.L0 + " time = " + (System.currentTimeMillis() - m7Var3.d1) + " dc = " + m7Var3.T + " size = " + i0.i0(m7Var3.b0, false, false));
                }
                if (this.c) {
                    int i10 = m7Var3.b1;
                    if (i10 == 50331648) {
                        uz.e(m7Var3.R).i(w0.f(), 3, 1);
                    } else if (i10 == 33554432) {
                        uz.e(m7Var3.R).i(w0.f(), 2, 1);
                    } else if (i10 == 16777216) {
                        uz.e(m7Var3.R).i(w0.f(), 4, 1);
                    } else if (i10 == 67108864) {
                        if (str == null || !(str.toLowerCase().endsWith("mp3") || str.toLowerCase().endsWith("m4a"))) {
                            uz.e(m7Var3.R).i(w0.f(), 5, 1);
                        } else {
                            uz.e(m7Var3.R).i(w0.f(), 7, 1);
                        }
                    }
                }
                m7Var3.g0.c(m7Var3, m7Var3.L0);
                break;
        }
    }
}
