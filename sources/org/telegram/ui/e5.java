package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ((org.telegram.ui.Components.e5) this.b).a();
                break;
            case 2:
                org.telegram.messenger.ns.e().c((os) this.b, org.telegram.messenger.ns.i4);
                break;
            case 3:
                ((p50) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((em0) this.b).i;
                if (e5Var != null) {
                    e5Var.a();
                    break;
                }
                break;
            default:
                f31 f31Var = (f31) this.b;
                f31Var.h.a();
                f31Var.n.a();
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
                ((org.telegram.ui.Components.e5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.ns.e().n((os) this.b, org.telegram.messenger.ns.i4);
                break;
            case 3:
                ((p50) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((em0) this.b).i;
                if (e5Var != null) {
                    e5Var.b();
                    break;
                }
                break;
            default:
                f31 f31Var = (f31) this.b;
                f31Var.h.b();
                f31Var.n.b();
                break;
        }
    }

    public /* synthetic */ e5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
