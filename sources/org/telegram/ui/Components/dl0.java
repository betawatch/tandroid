package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dl0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ el0 e;

    public dl0(el0 el0Var, View view, int i10, float f9, float f10) {
        this.e = el0Var;
        this.a = view;
        this.b = i10;
        this.c = f9;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.y yVar = this.e.b;
        jl0 jl0Var = (jl0) yVar.b;
        if (this == jl0Var.O1) {
            jl0Var.O1 = null;
        }
        View view = this.a;
        if (view != null) {
            jl0Var.h1(view, 0.0f, 0.0f, false);
            if (((jl0) yVar.b).N1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                jl0 jl0Var2 = (jl0) yVar.b;
                zk0 zk0Var = jl0Var2.R0;
                if (zk0Var != null) {
                    zk0Var.c(i10, view);
                    return;
                }
                al0 al0Var = jl0Var2.S0;
                if (al0Var != null) {
                    al0Var.b(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
