package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class k5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((l5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.p5) this.b).a();
                break;
            case 2:
                ((d70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.b).i;
                if (p5Var != null) {
                    p5Var.a();
                    break;
                }
                break;
            default:
                s71 s71Var = (s71) this.b;
                s71Var.h.a();
                s71Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((l5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.p5) this.b).b();
                break;
            case 2:
                ((d70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.b).i;
                if (p5Var != null) {
                    p5Var.b();
                    break;
                }
                break;
            default:
                s71 s71Var = (s71) this.b;
                s71Var.h.b();
                s71Var.n.b();
                break;
        }
    }
}
