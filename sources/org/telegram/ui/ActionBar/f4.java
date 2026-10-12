package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class f4 {
    public final v4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public f4(v4 v4Var) {
        this.a = v4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            v4 v4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                t4 t4Var = v4Var.b;
                if (t4Var.f()) {
                    t4Var.G = true;
                    t4Var.x.start();
                    t4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = v4Var.a;
            i4 i4Var = v4Var.l;
            view.removeOnLayoutChangeListener(i4Var);
            v4Var.a.addOnLayoutChangeListener(i4Var);
            v4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
