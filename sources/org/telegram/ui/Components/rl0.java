package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rl0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ sl0 e;

    public rl0(sl0 sl0Var, View view, int i10, float f7, float f10) {
        this.e = sl0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl0 tl0Var = this.e.b;
        yl0 yl0Var = (yl0) tl0Var.b;
        if (this == yl0Var.S1) {
            yl0Var.S1 = null;
        }
        View view = this.a;
        if (view != null) {
            yl0Var.i1(view, 0.0f, 0.0f, false);
            if (((yl0) tl0Var.b).R1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                yl0 yl0Var2 = (yl0) tl0Var.b;
                ml0 ml0Var = yl0Var2.V0;
                if (ml0Var != null) {
                    ml0Var.d(i10, view);
                    return;
                }
                nl0 nl0Var = yl0Var2.W0;
                if (nl0Var != null) {
                    nl0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
