package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
