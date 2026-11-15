package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lj0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ mj0 e;

    public lj0(mj0 mj0Var, View view, int i7, float f10, float f11) {
        this.e = mj0Var;
        this.a = view;
        this.b = i7;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nj0 nj0Var = this.e.b;
        uj0 uj0Var = (uj0) nj0Var.b;
        if (this == uj0Var.R1) {
            uj0Var.R1 = null;
        }
        View view = this.a;
        if (view != null) {
            uj0Var.j1(view, 0.0f, 0.0f, false);
            if (((uj0) nj0Var.b).Q1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i7 = this.b;
            if (i7 != -1) {
                uj0 uj0Var2 = (uj0) nj0Var.b;
                gj0 gj0Var = uj0Var2.U0;
                if (gj0Var != null) {
                    gj0Var.b(i7, view);
                    return;
                }
                hj0 hj0Var = uj0Var2.V0;
                if (hj0Var != null) {
                    hj0Var.f(this.c - view.getX(), this.d - view.getY(), i7, view);
                }
            }
        }
    }
}
