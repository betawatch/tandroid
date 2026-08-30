package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ((p70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((cp0) this.b).i;
                if (j5Var != null) {
                    j5Var.a();
                    break;
                }
                break;
            default:
                j81 j81Var = (j81) this.b;
                j81Var.h.a();
                j81Var.n.a();
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
                ((p70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((cp0) this.b).i;
                if (j5Var != null) {
                    j5Var.b();
                    break;
                }
                break;
            default:
                j81 j81Var = (j81) this.b;
                j81Var.h.b();
                j81Var.n.b();
                break;
        }
    }
}
