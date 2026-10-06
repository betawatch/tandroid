package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class g5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((h5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.o5) this.b).a();
                break;
            case 2:
                ((w70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.b).i;
                if (o5Var != null) {
                    o5Var.a();
                    break;
                }
                break;
            default:
                t81 t81Var = (t81) this.b;
                t81Var.h.a();
                t81Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((h5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.o5) this.b).b();
                break;
            case 2:
                ((w70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.b).i;
                if (o5Var != null) {
                    o5Var.b();
                    break;
                }
                break;
            default:
                t81 t81Var = (t81) this.b;
                t81Var.h.b();
                t81Var.n.b();
                break;
        }
    }
}
