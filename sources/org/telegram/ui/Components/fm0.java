package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fm0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ gm0 e;

    public fm0(gm0 gm0Var, View view, int i10, float f7, float f10) {
        this.e = gm0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hm0 hm0Var = this.e.b;
        nm0 nm0Var = (nm0) hm0Var.b;
        if (this == nm0Var.Q1) {
            nm0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            nm0Var.k1(view, 0.0f, 0.0f, false);
            if (((nm0) hm0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                nm0 nm0Var2 = (nm0) hm0Var.b;
                am0 am0Var = nm0Var2.T0;
                if (am0Var != null) {
                    am0Var.c(i10, view);
                    return;
                }
                bm0 bm0Var = nm0Var2.U0;
                if (bm0Var != null) {
                    bm0Var.e(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
