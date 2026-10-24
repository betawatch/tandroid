package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j4 {
    public final a5 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public j4(a5 a5Var) {
        this.a = a5Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            a5 a5Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                y4 y4Var = a5Var.b;
                if (y4Var.f()) {
                    y4Var.G = true;
                    y4Var.x.start();
                    y4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = a5Var.a;
            n4 n4Var = a5Var.l;
            view.removeOnLayoutChangeListener(n4Var);
            a5Var.a.addOnLayoutChangeListener(n4Var);
            a5Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
