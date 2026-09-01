package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j4 {
    public final z4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public j4(z4 z4Var) {
        this.a = z4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z4 = this.b;
            z4 z4Var = this.a;
            if (z4 || this.c || this.d || !this.e) {
                x4 x4Var = z4Var.b;
                if (x4Var.f()) {
                    x4Var.G = true;
                    x4Var.x.start();
                    x4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = z4Var.a;
            m4 m4Var = z4Var.l;
            view.removeOnLayoutChangeListener(m4Var);
            z4Var.a.addOnLayoutChangeListener(m4Var);
            z4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
