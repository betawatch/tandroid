package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x3 {
    public final m4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public x3(m4 m4Var) {
        this.a = m4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            m4 m4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                k4 k4Var = m4Var.b;
                if (k4Var.f()) {
                    k4Var.G = true;
                    k4Var.x.start();
                    k4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = m4Var.a;
            a4 a4Var = m4Var.l;
            view.removeOnLayoutChangeListener(a4Var);
            m4Var.a.addOnLayoutChangeListener(a4Var);
            m4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
