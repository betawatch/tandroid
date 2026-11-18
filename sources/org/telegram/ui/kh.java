package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public kh(f40 f40Var, org.telegram.messenger.u3 u3Var, boolean z10) {
        this.d = f40Var;
        this.c = u3Var;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                vi viVar = bnVar.p1;
                if (viVar != null) {
                    viVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return bnVar.M8();
            default:
                f40 f40Var = (f40) this.d;
                n30 n30Var = f40Var.L1;
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.p4 = null;
                b20 b20Var = f40Var.Z3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.c;
                b20Var.j(u3Var);
                if (f40Var.n2) {
                    f40Var.n2 = false;
                    f40Var.R0(true);
                    if (this.b && u3Var != null) {
                        n30Var.v0(0);
                    }
                    f40Var.n2 = true;
                } else {
                    f40Var.R0(true);
                }
                f40Var.b.requestLayout();
                return false;
        }
    }

    public kh(bn bnVar, ViewTreeObserver viewTreeObserver) {
        this.d = bnVar;
        this.c = viewTreeObserver;
    }
}
