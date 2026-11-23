package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public lh(e40 e40Var, org.telegram.messenger.u3 u3Var, boolean z10) {
        this.d = e40Var;
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
                e40 e40Var = (e40) this.d;
                m30 m30Var = e40Var.L1;
                m30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.p4 = null;
                a20 a20Var = e40Var.Z3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.c;
                a20Var.j(u3Var);
                if (e40Var.n2) {
                    e40Var.n2 = false;
                    e40Var.R0(true);
                    if (this.b && u3Var != null) {
                        m30Var.v0(0);
                    }
                    e40Var.n2 = true;
                } else {
                    e40Var.R0(true);
                }
                e40Var.b.requestLayout();
                return false;
        }
    }

    public lh(bn bnVar, ViewTreeObserver viewTreeObserver) {
        this.d = bnVar;
        this.c = viewTreeObserver;
    }
}
