package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                org.telegram.messenger.qs.e().c((ns) this.b, org.telegram.messenger.qs.i4);
                break;
            case 3:
                ((s50) this.b).b.P();
                break;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((em0) this.b).i;
                if (g5Var != null) {
                    g5Var.a();
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
                ((f5) this.b).b.R();
                break;
            case 1:
                ((org.telegram.ui.Components.g5) this.b).b();
                break;
            case 2:
                org.telegram.messenger.qs.e().n((ns) this.b, org.telegram.messenger.qs.i4);
                break;
            case 3:
                ((s50) this.b).b.R();
                break;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((em0) this.b).i;
                if (g5Var != null) {
                    g5Var.b();
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
