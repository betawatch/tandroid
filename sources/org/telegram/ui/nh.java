package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public nh(f40 f40Var, org.telegram.messenger.s3 s3Var, boolean z9) {
        this.d = f40Var;
        this.c = s3Var;
        this.b = z9;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                wi wiVar = cnVar.o1;
                if (wiVar != null) {
                    wiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return cnVar.L8();
            default:
                f40 f40Var = (f40) this.d;
                n30 n30Var = f40Var.K1;
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.k4 = null;
                c20 c20Var = f40Var.U3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.c;
                c20Var.j(s3Var);
                if (f40Var.m2) {
                    f40Var.m2 = false;
                    f40Var.Q0(true);
                    if (this.b && s3Var != null) {
                        n30Var.v0(0);
                    }
                    f40Var.m2 = true;
                } else {
                    f40Var.Q0(true);
                }
                f40Var.b.requestLayout();
                return false;
        }
    }

    public nh(cn cnVar, ViewTreeObserver viewTreeObserver) {
        this.d = cnVar;
        this.c = viewTreeObserver;
    }
}
