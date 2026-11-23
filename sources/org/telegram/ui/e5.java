package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((f5) this.b).b.Q();
                break;
            case 1:
                ((org.telegram.ui.Components.m5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.ks.e().c((os) this.b, org.telegram.messenger.ks.l4);
                break;
            case 3:
                ((r50) this.b).b.Q();
                break;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((em0) this.b).i;
                if (m5Var != null) {
                    m5Var.a();
                    break;
                }
                break;
            default:
                i31 i31Var = (i31) this.b;
                i31Var.h.a();
                i31Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((f5) this.b).b.S();
                break;
            case 1:
                ((org.telegram.ui.Components.m5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.ks.e().n((os) this.b, org.telegram.messenger.ks.l4);
                break;
            case 3:
                ((r50) this.b).b.S();
                break;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((em0) this.b).i;
                if (m5Var != null) {
                    m5Var.b();
                    break;
                }
                break;
            default:
                i31 i31Var = (i31) this.b;
                i31Var.h.b();
                i31Var.n.b();
                break;
        }
    }

    public /* synthetic */ e5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
