package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                ((org.telegram.ui.Components.m5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.ks.e().c((os) this.b, org.telegram.messenger.ks.l4);
                break;
            case 3:
                ((r50) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((gm0) this.b).i;
                if (m5Var != null) {
                    m5Var.a();
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
                ((org.telegram.ui.Components.m5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.ks.e().n((os) this.b, org.telegram.messenger.ks.l4);
                break;
            case 3:
                ((r50) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((gm0) this.b).i;
                if (m5Var != null) {
                    m5Var.b();
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
