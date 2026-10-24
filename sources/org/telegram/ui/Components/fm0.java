package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        mm0 mm0Var = (mm0) hm0Var.b;
        if (this == mm0Var.Q1) {
            mm0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            mm0Var.j1(view, 0.0f, 0.0f, false);
            if (((mm0) hm0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                mm0 mm0Var2 = (mm0) hm0Var.b;
                am0 am0Var = mm0Var2.T0;
                if (am0Var != null) {
                    am0Var.d(i10, view);
                    return;
                }
                bm0 bm0Var = mm0Var2.U0;
                if (bm0Var != null) {
                    bm0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
