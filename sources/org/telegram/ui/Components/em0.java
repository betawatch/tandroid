package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class em0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ fm0 e;

    public em0(fm0 fm0Var, View view, int i10, float f7, float f10) {
        this.e = fm0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gm0 gm0Var = this.e.b;
        mm0 mm0Var = (mm0) gm0Var.b;
        if (this == mm0Var.Q1) {
            mm0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            mm0Var.k1(view, 0.0f, 0.0f, false);
            if (((mm0) gm0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                mm0 mm0Var2 = (mm0) gm0Var.b;
                zl0 zl0Var = mm0Var2.T0;
                if (zl0Var != null) {
                    zl0Var.c(i10, view);
                    return;
                }
                am0 am0Var = mm0Var2.U0;
                if (am0Var != null) {
                    am0Var.e(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
