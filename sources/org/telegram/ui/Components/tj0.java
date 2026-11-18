package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tj0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ uj0 e;

    public tj0(uj0 uj0Var, View view, int i7, float f10, float f11) {
        this.e = uj0Var;
        this.a = view;
        this.b = i7;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vj0 vj0Var = this.e.b;
        ck0 ck0Var = (ck0) vj0Var.b;
        if (this == ck0Var.R1) {
            ck0Var.R1 = null;
        }
        View view = this.a;
        if (view != null) {
            ck0Var.j1(view, 0.0f, 0.0f, false);
            if (((ck0) vj0Var.b).Q1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i7 = this.b;
            if (i7 != -1) {
                ck0 ck0Var2 = (ck0) vj0Var.b;
                oj0 oj0Var = ck0Var2.U0;
                if (oj0Var != null) {
                    oj0Var.c(i7, view);
                    return;
                }
                pj0 pj0Var = ck0Var2.V0;
                if (pj0Var != null) {
                    pj0Var.f(this.c - view.getX(), this.d - view.getY(), i7, view);
                }
            }
        }
    }
}
