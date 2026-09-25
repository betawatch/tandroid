package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ((org.telegram.ui.Components.o5) this.b).a();
                break;
            case 2:
                ((s70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.b).i;
                if (o5Var != null) {
                    o5Var.a();
                    break;
                }
                break;
            default:
                u81 u81Var = (u81) this.b;
                u81Var.h.a();
                u81Var.n.a();
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
                ((org.telegram.ui.Components.o5) this.b).b();
                break;
            case 2:
                ((s70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.b).i;
                if (o5Var != null) {
                    o5Var.b();
                    break;
                }
                break;
            default:
                u81 u81Var = (u81) this.b;
                u81Var.h.b();
                u81Var.n.b();
                break;
        }
    }
}
