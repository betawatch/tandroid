package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w3 {
    public final l4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public w3(l4 l4Var) {
        this.a = l4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            l4 l4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                j4 j4Var = l4Var.b;
                if (j4Var.f()) {
                    j4Var.G = true;
                    j4Var.x.start();
                    j4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = l4Var.a;
            z3 z3Var = l4Var.l;
            view.removeOnLayoutChangeListener(z3Var);
            l4Var.a.addOnLayoutChangeListener(z3Var);
            l4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
