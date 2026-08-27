package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ((org.telegram.ui.Components.i5) this.b).a();
                break;
            case 2:
                ((f70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((wo0) this.b).i;
                if (i5Var != null) {
                    i5Var.a();
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
                ((g5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.i5) this.b).b();
                break;
            case 2:
                ((f70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((wo0) this.b).i;
                if (i5Var != null) {
                    i5Var.b();
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
