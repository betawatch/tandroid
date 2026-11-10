package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((f5) this.b).b.P();
                break;
            case 1:
                ((org.telegram.ui.Components.f5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.qs.e().c((os) this.b, org.telegram.messenger.qs.i4);
                break;
            case 3:
                ((t50) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.f5 f5Var = ((fm0) this.b).i;
                if (f5Var != null) {
                    f5Var.a();
                    break;
                }
                break;
            default:
                j31 j31Var = (j31) this.b;
                j31Var.h.a();
                j31Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((f5) this.b).b.R();
                break;
            case 1:
                ((org.telegram.ui.Components.f5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.qs.e().n((os) this.b, org.telegram.messenger.qs.i4);
                break;
            case 3:
                ((t50) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.f5 f5Var = ((fm0) this.b).i;
                if (f5Var != null) {
                    f5Var.b();
                    break;
                }
                break;
            default:
                j31 j31Var = (j31) this.b;
                j31Var.h.b();
                j31Var.n.b();
                break;
        }
    }

    public /* synthetic */ e5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
