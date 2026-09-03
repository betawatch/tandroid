package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i4 {
    public final y4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public i4(y4 y4Var) {
        this.a = y4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z4 = this.b;
            y4 y4Var = this.a;
            if (z4 || this.c || this.d || !this.e) {
                w4 w4Var = y4Var.b;
                if (w4Var.f()) {
                    w4Var.G = true;
                    w4Var.x.start();
                    w4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = y4Var.a;
            l4 l4Var = y4Var.l;
            view.removeOnLayoutChangeListener(l4Var);
            y4Var.a.addOnLayoutChangeListener(l4Var);
            y4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
