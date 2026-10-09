package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jm0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ km0 e;

    public jm0(km0 km0Var, View view, int i10, float f7, float f10) {
        this.e = km0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lm0 lm0Var = this.e.b;
        qm0 qm0Var = (qm0) lm0Var.b;
        if (this == qm0Var.Q1) {
            qm0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            qm0Var.h1(view, 0.0f, 0.0f, false);
            if (((qm0) lm0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                qm0 qm0Var2 = (qm0) lm0Var.b;
                em0 em0Var = qm0Var2.T0;
                if (em0Var != null) {
                    em0Var.d(i10, view);
                    return;
                }
                fm0 fm0Var = qm0Var2.U0;
                if (fm0Var != null) {
                    fm0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
