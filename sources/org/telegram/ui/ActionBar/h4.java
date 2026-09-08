package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h4 {
    public final x4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public h4(x4 x4Var) {
        this.a = x4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            x4 x4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                v4 v4Var = x4Var.b;
                if (v4Var.f()) {
                    v4Var.G = true;
                    v4Var.x.start();
                    v4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = x4Var.a;
            k4 k4Var = x4Var.l;
            view.removeOnLayoutChangeListener(k4Var);
            x4Var.a.addOnLayoutChangeListener(k4Var);
            x4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
