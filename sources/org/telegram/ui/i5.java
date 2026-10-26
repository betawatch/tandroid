package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((j5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.r5) this.b).a();
                break;
            case 2:
                ((j70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((mp0) this.b).i;
                if (r5Var != null) {
                    r5Var.a();
                    break;
                }
                break;
            default:
                y71 y71Var = (y71) this.b;
                y71Var.h.a();
                y71Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((j5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.r5) this.b).b();
                break;
            case 2:
                ((j70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((mp0) this.b).i;
                if (r5Var != null) {
                    r5Var.b();
                    break;
                }
                break;
            default:
                y71 y71Var = (y71) this.b;
                y71Var.h.b();
                y71Var.n.b();
                break;
        }
    }
}
