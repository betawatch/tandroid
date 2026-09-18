package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((org.telegram.ui.Components.m5) this.b).a();
                break;
            case 2:
                ((z70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((xp0) this.b).i;
                if (m5Var != null) {
                    m5Var.a();
                    break;
                }
                break;
            default:
                b91 b91Var = (b91) this.b;
                b91Var.h.a();
                b91Var.n.a();
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
                ((org.telegram.ui.Components.m5) this.b).b();
                break;
            case 2:
                ((z70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((xp0) this.b).i;
                if (m5Var != null) {
                    m5Var.b();
                    break;
                }
                break;
            default:
                b91 b91Var = (b91) this.b;
                b91Var.h.b();
                b91Var.n.b();
                break;
        }
    }
}
