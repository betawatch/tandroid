package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public nh(e40 e40Var, org.telegram.messenger.s3 s3Var, boolean z9) {
        this.d = e40Var;
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
                e40 e40Var = (e40) this.d;
                m30 m30Var = e40Var.H1;
                m30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.h4 = null;
                b20 b20Var = e40Var.R3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.c;
                b20Var.j(s3Var);
                if (e40Var.j2) {
                    e40Var.j2 = false;
                    e40Var.Q0(true);
                    if (this.b && s3Var != null) {
                        m30Var.v0(0);
                    }
                    e40Var.j2 = true;
                } else {
                    e40Var.Q0(true);
                }
                e40Var.b.requestLayout();
                return false;
        }
    }

    public nh(cn cnVar, ViewTreeObserver viewTreeObserver) {
        this.d = cnVar;
        this.c = viewTreeObserver;
    }
}
