package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.b).i;
                if (j5Var != null) {
                    j5Var.a();
                    break;
                }
                break;
            default:
                q81 q81Var = (q81) this.b;
                q81Var.h.a();
                q81Var.n.a();
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
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.b).i;
                if (j5Var != null) {
                    j5Var.b();
                    break;
                }
                break;
            default:
                q81 q81Var = (q81) this.b;
                q81Var.h.b();
                q81Var.n.b();
                break;
        }
    }
}
