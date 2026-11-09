package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hj0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ij0 e;

    public hj0(ij0 ij0Var, View view, int i7, float f10, float f11) {
        this.e = ij0Var;
        this.a = view;
        this.b = i7;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jj0 jj0Var = this.e.b;
        qj0 qj0Var = (qj0) jj0Var.b;
        if (this == qj0Var.Q1) {
            qj0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            qj0Var.j1(view, 0.0f, 0.0f, false);
            if (((qj0) jj0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i7 = this.b;
            if (i7 != -1) {
                qj0 qj0Var2 = (qj0) jj0Var.b;
                cj0 cj0Var = qj0Var2.T0;
                if (cj0Var != null) {
                    cj0Var.c(i7, view);
                    return;
                }
                dj0 dj0Var = qj0Var2.U0;
                if (dj0Var != null) {
                    dj0Var.f(this.c - view.getX(), this.d - view.getY(), i7, view);
                }
            }
        }
    }
}
