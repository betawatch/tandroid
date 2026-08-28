package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((f5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.i5) this.b).a();
                break;
            case 2:
                ((c70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((vo0) this.b).i;
                if (i5Var != null) {
                    i5Var.a();
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
                ((f5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.i5) this.b).b();
                break;
            case 2:
                ((c70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((vo0) this.b).i;
                if (i5Var != null) {
                    i5Var.b();
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
