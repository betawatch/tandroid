package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((e5) this.b).b.P();
                break;
            case 1:
                ((org.telegram.ui.Components.d5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.zs.e().c((mt) this.b, org.telegram.messenger.zs.i4);
                break;
            case 3:
                ((o60) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((on0) this.b).i;
                if (d5Var != null) {
                    d5Var.a();
                    break;
                }
                break;
            default:
                z41 z41Var = (z41) this.b;
                z41Var.h.a();
                z41Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((e5) this.b).b.R();
                break;
            case 1:
                ((org.telegram.ui.Components.d5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.zs.e().n((mt) this.b, org.telegram.messenger.zs.i4);
                break;
            case 3:
                ((o60) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((on0) this.b).i;
                if (d5Var != null) {
                    d5Var.b();
                    break;
                }
                break;
            default:
                z41 z41Var = (z41) this.b;
                z41Var.h.b();
                z41Var.n.b();
                break;
        }
    }

    public /* synthetic */ d5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
