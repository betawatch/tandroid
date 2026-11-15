package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public lh(c40 c40Var, org.telegram.messenger.s3 s3Var, boolean z10) {
        this.d = c40Var;
        this.c = s3Var;
        this.b = z10;
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
                ui uiVar = anVar.p1;
                if (uiVar != null) {
                    uiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return anVar.M8();
            default:
                c40 c40Var = (c40) this.d;
                k30 k30Var = c40Var.L1;
                k30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.p4 = null;
                y10 y10Var = c40Var.Z3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.c;
                y10Var.j(s3Var);
                if (c40Var.n2) {
                    c40Var.n2 = false;
                    c40Var.Q0(true);
                    if (this.b && s3Var != null) {
                        k30Var.v0(0);
                    }
                    c40Var.n2 = true;
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
