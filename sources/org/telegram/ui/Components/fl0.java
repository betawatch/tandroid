package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fl0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ gl0 e;

    public fl0(gl0 gl0Var, View view, int i10, float f7, float f10) {
        this.e = gl0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hl0 hl0Var = this.e.b;
        ml0 ml0Var = (ml0) hl0Var.b;
        if (this == ml0Var.S1) {
            ml0Var.S1 = null;
        }
        View view = this.a;
        if (view != null) {
            ml0Var.h1(view, 0.0f, 0.0f, false);
            if (((ml0) hl0Var.b).R1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                ml0 ml0Var2 = (ml0) hl0Var.b;
                al0 al0Var = ml0Var2.V0;
                if (al0Var != null) {
                    al0Var.d(i10, view);
                    return;
                }
                bl0 bl0Var = ml0Var2.W0;
                if (bl0Var != null) {
                    bl0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
