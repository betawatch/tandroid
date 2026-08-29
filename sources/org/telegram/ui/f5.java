package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                ((org.telegram.ui.Components.n5) this.b).a();
                break;
            case 2:
                ((f70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((uo0) this.b).i;
                if (n5Var != null) {
                    n5Var.a();
                    break;
                }
                break;
            default:
                w71 w71Var = (w71) this.b;
                w71Var.h.a();
                w71Var.n.a();
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
                ((org.telegram.ui.Components.n5) this.b).b();
                break;
            case 2:
                ((f70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((uo0) this.b).i;
                if (n5Var != null) {
                    n5Var.b();
                    break;
                }
                break;
            default:
                w71 w71Var = (w71) this.b;
                w71Var.h.b();
                w71Var.n.b();
                break;
        }
    }
}
