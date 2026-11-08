package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v3 {
    public final k4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public v3(k4 k4Var) {
        this.a = k4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z9 = this.b;
            k4 k4Var = this.a;
            if (z9 || this.c || this.d || !this.e) {
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
            y3 y3Var = k4Var.l;
            view.removeOnLayoutChangeListener(y3Var);
            k4Var.a.addOnLayoutChangeListener(y3Var);
            k4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
