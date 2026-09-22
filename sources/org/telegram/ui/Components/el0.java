package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class el0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ fl0 e;

    public el0(fl0 fl0Var, View view, int i10, float f7, float f10) {
        this.e = fl0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gl0 gl0Var = this.e.b;
        ll0 ll0Var = (ll0) gl0Var.b;
        if (this == ll0Var.S1) {
            ll0Var.S1 = null;
        }
        View view = this.a;
        if (view != null) {
            ll0Var.h1(view, 0.0f, 0.0f, false);
            if (((ll0) gl0Var.b).R1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                ll0 ll0Var2 = (ll0) gl0Var.b;
                zk0 zk0Var = ll0Var2.V0;
                if (zk0Var != null) {
                    zk0Var.d(i10, view);
                    return;
                }
                al0 al0Var = ll0Var2.W0;
                if (al0Var != null) {
                    al0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
