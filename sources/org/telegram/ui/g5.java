package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ((u70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((pp0) this.b).i;
                if (o5Var != null) {
                    o5Var.a();
                    break;
                }
                break;
            default:
                s81 s81Var = (s81) this.b;
                s81Var.h.a();
                s81Var.n.a();
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
                ((u70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((pp0) this.b).i;
                if (o5Var != null) {
                    o5Var.b();
                    break;
                }
                break;
            default:
                s81 s81Var = (s81) this.b;
                s81Var.h.b();
                s81Var.n.b();
                break;
        }
    }
}
