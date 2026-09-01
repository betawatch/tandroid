package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((i5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.j5) this.b).a();
                break;
            case 2:
                ((q70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ep0) this.b).i;
                if (j5Var != null) {
                    j5Var.a();
                    break;
                }
                break;
            default:
                k81 k81Var = (k81) this.b;
                k81Var.h.a();
                k81Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((i5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.j5) this.b).b();
                break;
            case 2:
                ((q70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ep0) this.b).i;
                if (j5Var != null) {
                    j5Var.b();
                    break;
                }
                break;
            default:
                k81 k81Var = (k81) this.b;
                k81Var.h.b();
                k81Var.n.b();
                break;
        }
    }
}
