package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((h5) this.b).b.P();
                break;
            case 1:
                ((org.telegram.ui.Components.e5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.hs.e().c((js) this.b, org.telegram.messenger.hs.i4);
                break;
            case 3:
                ((k50) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((xl0) this.b).i;
                if (e5Var != null) {
                    e5Var.a();
                    break;
                }
                break;
            default:
                x21 x21Var = (x21) this.b;
                x21Var.h.a();
                x21Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((h5) this.b).b.R();
                break;
            case 1:
                ((org.telegram.ui.Components.e5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.hs.e().n((js) this.b, org.telegram.messenger.hs.i4);
                break;
            case 3:
                ((k50) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((xl0) this.b).i;
                if (e5Var != null) {
                    e5Var.b();
                    break;
                }
                break;
            default:
                x21 x21Var = (x21) this.b;
                x21Var.h.b();
                x21Var.n.b();
                break;
        }
    }

    public /* synthetic */ g5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }
}
