package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                org.telegram.messenger.at.e().c((lt) this.b, org.telegram.messenger.at.i4);
                break;
            case 3:
                ((n60) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((mn0) this.b).i;
                if (d5Var != null) {
                    d5Var.a();
                    break;
                }
                break;
            default:
                x41 x41Var = (x41) this.b;
                x41Var.h.a();
                x41Var.n.a();
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
                org.telegram.messenger.at.e().n((lt) this.b, org.telegram.messenger.at.i4);
                break;
            case 3:
                ((n60) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((mn0) this.b).i;
                if (d5Var != null) {
                    d5Var.b();
                    break;
                }
                break;
            default:
                x41 x41Var = (x41) this.b;
                x41Var.h.b();
                x41Var.n.b();
                break;
        }
    }

    public /* synthetic */ d5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
