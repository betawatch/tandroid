package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class g4 {
    public final x4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public g4(x4 x4Var) {
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
