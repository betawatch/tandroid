package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ n7 c;

    public /* synthetic */ i7(m7 m7Var, n7 n7Var, int i10) {
        this.a = i10;
        this.b = m7Var;
        this.c = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                n7 n7Var = this.c;
                if (m7Var.m != null) {
                    f8.d("FileLoadOperation " + m7Var.r + " removing stream listener " + n7Var);
                    m7Var.m.remove(n7Var);
                    break;
                }
                break;
            default:
                m7 m7Var2 = this.b;
                n7 n7Var2 = this.c;
                if (m7Var2.m == null) {
                    m7Var2.m = new ArrayList();
                }
                if (n7Var2 != null && !m7Var2.m.contains(n7Var2)) {
                    m7Var2.m.add(n7Var2);
                }
                if (!m7Var2.m.isEmpty()) {
                    Utilities.d.a(m7Var2.f1);
                }
                if (n7Var2 != null && m7Var2.Y != 1 && m7Var2.Y != 0) {
                    n7Var2.a();
                    break;
                }
                break;
        }
    }
}
