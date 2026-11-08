package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public lh(c40 c40Var, org.telegram.messenger.s3 s3Var, boolean z9) {
        this.d = c40Var;
        this.c = s3Var;
        this.b = z9;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                an anVar = (an) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                ui uiVar = anVar.o1;
                if (uiVar != null) {
                    uiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return anVar.K8();
            default:
                c40 c40Var = (c40) this.d;
                k30 k30Var = c40Var.H1;
                k30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.h4 = null;
                z10 z10Var = c40Var.R3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.c;
                z10Var.j(s3Var);
                if (c40Var.j2) {
                    c40Var.j2 = false;
                    c40Var.Q0(true);
                    if (this.b && s3Var != null) {
                        k30Var.v0(0);
                    }
                    c40Var.j2 = true;
                } else {
                    c40Var.Q0(true);
                }
                c40Var.b.requestLayout();
                return false;
        }
    }

    public lh(an anVar, ViewTreeObserver viewTreeObserver) {
        this.d = anVar;
        this.c = viewTreeObserver;
    }
}
