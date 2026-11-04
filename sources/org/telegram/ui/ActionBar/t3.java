package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t3 {
    public final k4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public t3(k4 k4Var) {
        this.a = k4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            k4 k4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                i4 i4Var = k4Var.b;
                if (i4Var.f()) {
                    i4Var.G = true;
                    i4Var.x.start();
                    i4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = k4Var.a;
            w3 w3Var = k4Var.l;
            view.removeOnLayoutChangeListener(w3Var);
            k4Var.a.addOnLayoutChangeListener(w3Var);
            k4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
