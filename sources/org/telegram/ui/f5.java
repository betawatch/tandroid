package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((org.telegram.ui.Components.q5) this.b).a();
                break;
            case 2:
                ((w70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((vp0) this.b).i;
                if (q5Var != null) {
                    q5Var.a();
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
                ((org.telegram.ui.Components.q5) this.b).b();
                break;
            case 2:
                ((w70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((vp0) this.b).i;
                if (q5Var != null) {
                    q5Var.b();
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
