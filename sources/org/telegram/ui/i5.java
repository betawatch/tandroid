package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((j5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.r5) this.b).a();
                break;
            case 2:
                ((l70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((op0) this.b).i;
                if (r5Var != null) {
                    r5Var.a();
                    break;
                }
                break;
            default:
                a81 a81Var = (a81) this.b;
                a81Var.h.a();
                a81Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((j5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.r5) this.b).b();
                break;
            case 2:
                ((l70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((op0) this.b).i;
                if (r5Var != null) {
                    r5Var.b();
                    break;
                }
                break;
            default:
                a81 a81Var = (a81) this.b;
                a81Var.h.b();
                a81Var.n.b();
                break;
        }
    }
}
