package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c4 {
    public final s4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public c4(s4 s4Var) {
        this.a = s4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            s4 s4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                q4 q4Var = s4Var.b;
                if (q4Var.f()) {
                    q4Var.G = true;
                    q4Var.x.start();
                    q4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = s4Var.a;
            f4 f4Var = s4Var.l;
            view.removeOnLayoutChangeListener(f4Var);
            s4Var.a.addOnLayoutChangeListener(f4Var);
            s4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
