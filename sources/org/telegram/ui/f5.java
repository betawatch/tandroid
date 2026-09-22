package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ((x70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((xp0) this.b).i;
                if (n5Var != null) {
                    n5Var.a();
                    break;
                }
                break;
            default:
                d91 d91Var = (d91) this.b;
                d91Var.h.a();
                d91Var.n.a();
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
                ((x70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((xp0) this.b).i;
                if (n5Var != null) {
                    n5Var.b();
                    break;
                }
                break;
            default:
                d91 d91Var = (d91) this.b;
                d91Var.h.b();
                d91Var.n.b();
                break;
        }
    }
}
