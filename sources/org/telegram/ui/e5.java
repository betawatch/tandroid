package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                ((org.telegram.ui.Components.n5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.ls.e().c((os) this.b, org.telegram.messenger.ls.l4);
                break;
            case 3:
                ((r50) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.n5 n5Var = ((gm0) this.b).i;
                if (n5Var != null) {
                    n5Var.a();
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
                ((org.telegram.ui.Components.n5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.ls.e().n((os) this.b, org.telegram.messenger.ls.l4);
                break;
            case 3:
                ((r50) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.n5 n5Var = ((gm0) this.b).i;
                if (n5Var != null) {
                    n5Var.b();
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
