package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ((org.telegram.ui.Components.j5) this.b).a();
                break;
            case 2:
                ((r70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.b).i;
                if (j5Var != null) {
                    j5Var.a();
                    break;
                }
                break;
            default:
                r81 r81Var = (r81) this.b;
                r81Var.h.a();
                r81Var.n.a();
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
                ((org.telegram.ui.Components.j5) this.b).b();
                break;
            case 2:
                ((r70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.b).i;
                if (j5Var != null) {
                    j5Var.b();
                    break;
                }
                break;
            default:
                r81 r81Var = (r81) this.b;
                r81Var.h.b();
                r81Var.n.b();
                break;
        }
    }
}
