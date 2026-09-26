package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pl0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ql0 e;

    public pl0(ql0 ql0Var, View view, int i10, float f7, float f10) {
        this.e = ql0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rl0 rl0Var = this.e.b;
        wl0 wl0Var = (wl0) rl0Var.b;
        if (this == wl0Var.S1) {
            wl0Var.S1 = null;
        }
        View view = this.a;
        if (view != null) {
            wl0Var.h1(view, 0.0f, 0.0f, false);
            if (((wl0) rl0Var.b).R1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                wl0 wl0Var2 = (wl0) rl0Var.b;
                kl0 kl0Var = wl0Var2.V0;
                if (kl0Var != null) {
                    kl0Var.d(i10, view);
                    return;
                }
                ll0 ll0Var = wl0Var2.W0;
                if (ll0Var != null) {
                    ll0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
