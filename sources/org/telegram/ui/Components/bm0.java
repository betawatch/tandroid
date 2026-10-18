package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bm0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ cm0 e;

    public bm0(cm0 cm0Var, View view, int i10, float f7, float f10) {
        this.e = cm0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm0 dm0Var = this.e.b;
        im0 im0Var = (im0) dm0Var.b;
        if (this == im0Var.Q1) {
            im0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            im0Var.h1(view, 0.0f, 0.0f, false);
            if (((im0) dm0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                im0 im0Var2 = (im0) dm0Var.b;
                wl0 wl0Var = im0Var2.T0;
                if (wl0Var != null) {
                    wl0Var.a(i10, view);
                    return;
                }
                xl0 xl0Var = im0Var2.U0;
                if (xl0Var != null) {
                    xl0Var.d(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
