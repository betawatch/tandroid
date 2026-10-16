package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                ((org.telegram.ui.Components.q5) this.b).a();
                break;
            case 2:
                ((b80) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((zp0) this.b).i;
                if (q5Var != null) {
                    q5Var.a();
                    break;
                }
                break;
            default:
                j91 j91Var = (j91) this.b;
                j91Var.h.a();
                j91Var.n.a();
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
                ((org.telegram.ui.Components.q5) this.b).b();
                break;
            case 2:
                ((b80) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((zp0) this.b).i;
                if (q5Var != null) {
                    q5Var.b();
                    break;
                }
                break;
            default:
                j91 j91Var = (j91) this.b;
                j91Var.h.b();
                j91Var.n.b();
                break;
        }
    }
}
