package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g4 {
    public final w4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public g4(w4 w4Var) {
        this.a = w4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            w4 w4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                u4 u4Var = w4Var.b;
                if (u4Var.f()) {
                    u4Var.G = true;
                    u4Var.x.start();
                    u4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = w4Var.a;
            j4 j4Var = w4Var.l;
            view.removeOnLayoutChangeListener(j4Var);
            w4Var.a.addOnLayoutChangeListener(j4Var);
            w4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
