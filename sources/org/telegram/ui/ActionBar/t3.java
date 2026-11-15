package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t3 {
    public final i4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public t3(i4 i4Var) {
        this.a = i4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z10 = this.b;
            i4 i4Var = this.a;
            if (z10 || this.c || this.d || !this.e) {
                g4 g4Var = i4Var.b;
                if (g4Var.f()) {
                    g4Var.G = true;
                    g4Var.x.start();
                    g4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = i4Var.a;
            w3 w3Var = i4Var.l;
            view.removeOnLayoutChangeListener(w3Var);
            i4Var.a.addOnLayoutChangeListener(w3Var);
            i4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
