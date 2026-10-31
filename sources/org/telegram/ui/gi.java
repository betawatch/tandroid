package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gi implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public gi(b50 b50Var, org.telegram.messenger.v3 v3Var, boolean z10) {
        this.d = b50Var;
        this.c = v3Var;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                un unVar = (un) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                qj qjVar = unVar.o1;
                if (qjVar != null) {
                    qjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return unVar.D8();
            default:
                b50 b50Var = (b50) this.d;
                i40 i40Var = b50Var.H1;
                i40Var.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var.h4 = null;
                y20 y20Var = b50Var.R3;
                org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) this.c;
                y20Var.j(v3Var);
                if (b50Var.j2) {
                    b50Var.j2 = false;
                    b50Var.Q0(true);
                    if (this.b && v3Var != null) {
                        i40Var.v0(0);
                    }
                    b50Var.j2 = true;
                } else {
                    b50Var.Q0(true);
                }
                b50Var.b.requestLayout();
                return false;
        }
    }

    public gi(un unVar, ViewTreeObserver viewTreeObserver) {
        this.d = unVar;
        this.c = viewTreeObserver;
    }
}
