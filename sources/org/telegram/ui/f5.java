package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((g5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.n5) this.b).a();
                break;
            case 2:
                ((w70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((vp0) this.b).i;
                if (n5Var != null) {
                    n5Var.a();
                    break;
                }
                break;
            default:
                f91 f91Var = (f91) this.b;
                f91Var.h.a();
                f91Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((g5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.n5) this.b).b();
                break;
            case 2:
                ((w70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((vp0) this.b).i;
                if (n5Var != null) {
                    n5Var.b();
                    break;
                }
                break;
            default:
                f91 f91Var = (f91) this.b;
                f91Var.h.b();
                f91Var.n.b();
                break;
        }
    }
}
