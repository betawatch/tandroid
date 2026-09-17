package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class f5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((g5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.o5) this.b).a();
                break;
            case 2:
                ((x70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.b).i;
                if (o5Var != null) {
                    o5Var.a();
                    break;
                }
                break;
            default:
                d91 d91Var = (d91) this.b;
                d91Var.h.a();
                d91Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((g5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.o5) this.b).b();
                break;
            case 2:
                ((x70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.b).i;
                if (o5Var != null) {
                    o5Var.b();
                    break;
                }
                break;
            default:
                d91 d91Var = (d91) this.b;
                d91Var.h.b();
                d91Var.n.b();
                break;
        }
    }
}
