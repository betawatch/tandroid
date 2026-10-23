package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class cm0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ dm0 e;

    public cm0(dm0 dm0Var, View view, int i10, float f7, float f10) {
        this.e = dm0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        em0 em0Var = this.e.b;
        jm0 jm0Var = (jm0) em0Var.b;
        if (this == jm0Var.Q1) {
            jm0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            jm0Var.h1(view, 0.0f, 0.0f, false);
            if (((jm0) em0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                jm0 jm0Var2 = (jm0) em0Var.b;
                xl0 xl0Var = jm0Var2.T0;
                if (xl0Var != null) {
                    xl0Var.a(i10, view);
                    return;
                }
                yl0 yl0Var = jm0Var2.U0;
                if (yl0Var != null) {
                    yl0Var.d(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
