package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gi implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public gi(a50 a50Var, org.telegram.messenger.v3 v3Var, boolean z10) {
        this.d = a50Var;
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
                return unVar.H8();
            default:
                a50 a50Var = (a50) this.d;
                h40 h40Var = a50Var.H1;
                h40Var.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var.h4 = null;
                x20 x20Var = a50Var.R3;
                org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) this.c;
                x20Var.j(v3Var);
                if (a50Var.j2) {
                    a50Var.j2 = false;
                    a50Var.Q0(true);
                    if (this.b && v3Var != null) {
                        h40Var.v0(0);
                    }
                    a50Var.j2 = true;
                } else {
                    a50Var.Q0(true);
                }
                a50Var.b.requestLayout();
                return false;
        }
    }

    public gi(un unVar, ViewTreeObserver viewTreeObserver) {
        this.d = unVar;
        this.c = viewTreeObserver;
    }
}
