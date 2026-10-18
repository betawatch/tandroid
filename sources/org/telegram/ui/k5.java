package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class k5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((l5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.p5) this.b).a();
                break;
            case 2:
                ((f70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((fp0) this.b).i;
                if (p5Var != null) {
                    p5Var.a();
                    break;
                }
                break;
            default:
                u71 u71Var = (u71) this.b;
                u71Var.h.a();
                u71Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((l5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.p5) this.b).b();
                break;
            case 2:
                ((f70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((fp0) this.b).i;
                if (p5Var != null) {
                    p5Var.b();
                    break;
                }
                break;
            default:
                u71 u71Var = (u71) this.b;
                u71Var.h.b();
                u71Var.n.b();
                break;
        }
    }
}
