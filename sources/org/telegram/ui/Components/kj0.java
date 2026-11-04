package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kj0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ lj0 e;

    public kj0(lj0 lj0Var, View view, int i3, float f10, float f11) {
        this.e = lj0Var;
        this.a = view;
        this.b = i3;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mj0 mj0Var = this.e.b;
        tj0 tj0Var = (tj0) mj0Var.b;
        if (this == tj0Var.R1) {
            tj0Var.R1 = null;
        }
        View view = this.a;
        if (view != null) {
            tj0Var.j1(view, 0.0f, 0.0f, false);
            if (((tj0) mj0Var.b).Q1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i3 = this.b;
            if (i3 != -1) {
                tj0 tj0Var2 = (tj0) mj0Var.b;
                fj0 fj0Var = tj0Var2.U0;
                if (fj0Var != null) {
                    fj0Var.f(i3, view);
                    return;
                }
                gj0 gj0Var = tj0Var2.V0;
                if (gj0Var != null) {
                    gj0Var.b(this.c - view.getX(), this.d - view.getY(), i3, view);
                }
            }
        }
    }
}
