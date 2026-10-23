package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class j5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((k5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.p5) this.b).a();
                break;
            case 2:
                ((h70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((gp0) this.b).i;
                if (p5Var != null) {
                    p5Var.a();
                    break;
                }
                break;
            default:
                x71 x71Var = (x71) this.b;
                x71Var.h.a();
                x71Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((k5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.p5) this.b).b();
                break;
            case 2:
                ((h70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((gp0) this.b).i;
                if (p5Var != null) {
                    p5Var.b();
                    break;
                }
                break;
            default:
                x71 x71Var = (x71) this.b;
                x71Var.h.b();
                x71Var.n.b();
                break;
        }
    }
}
