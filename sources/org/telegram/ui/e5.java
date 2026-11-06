package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                ((org.telegram.ui.Components.g5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.qs.e().c((ls) this.b, org.telegram.messenger.qs.i4);
                break;
            case 3:
                ((q50) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.b).i;
                if (g5Var != null) {
                    g5Var.a();
                    break;
                }
                break;
            default:
                h31 h31Var = (h31) this.b;
                h31Var.h.a();
                h31Var.n.a();
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
                ((org.telegram.ui.Components.g5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.qs.e().n((ls) this.b, org.telegram.messenger.qs.i4);
                break;
            case 3:
                ((q50) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.b).i;
                if (g5Var != null) {
                    g5Var.b();
                    break;
                }
                break;
            default:
                h31 h31Var = (h31) this.b;
                h31Var.h.b();
                h31Var.n.b();
                break;
        }
    }

    public /* synthetic */ e5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
