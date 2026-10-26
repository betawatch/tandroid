package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l4 {
    public final c5 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public l4(c5 c5Var) {
        this.a = c5Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            c5 c5Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                a5 a5Var = c5Var.b;
                if (a5Var.f()) {
                    a5Var.G = true;
                    a5Var.x.start();
                    a5Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = c5Var.a;
            p4 p4Var = c5Var.l;
            view.removeOnLayoutChangeListener(p4Var);
            c5Var.a.addOnLayoutChangeListener(p4Var);
            c5Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
