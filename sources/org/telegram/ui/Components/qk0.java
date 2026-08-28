package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qk0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ rk0 e;

    public qk0(rk0 rk0Var, View view, int i9, float f10, float f11) {
        this.e = rk0Var;
        this.a = view;
        this.b = i9;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.a0 a0Var = this.e.b;
        wk0 wk0Var = (wk0) a0Var.b;
        if (this == wk0Var.O1) {
            wk0Var.O1 = null;
        }
        View view = this.a;
        if (view != null) {
            wk0Var.h1(view, 0.0f, 0.0f, false);
            if (((wk0) a0Var.b).N1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i9 = this.b;
            if (i9 != -1) {
                wk0 wk0Var2 = (wk0) a0Var.b;
                mk0 mk0Var = wk0Var2.R0;
                if (mk0Var != null) {
                    mk0Var.a(i9, view);
                    return;
                }
                nk0 nk0Var = wk0Var2.S0;
                if (nk0Var != null) {
                    nk0Var.c(this.c - view.getX(), this.d - view.getY(), i9, view);
                }
            }
        }
    }
}
