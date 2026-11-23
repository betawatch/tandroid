package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ji0 extends v4.o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi0 b;

    public /* synthetic */ ji0(xi0 xi0Var, int i7) {
        this.a = i7;
        this.b = xi0Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        switch (this.a) {
            case 0:
                super.e(rect, view, recyclerView, c1Var);
                xi0 xi0Var = this.b;
                if (!xi0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == xi0Var.b0.b() - 1) {
                        if ((!xi0Var.V.isEmpty() && !org.telegram.messenger.np.u1(xi0Var.K).K3()) || xi0Var.q()) {
                            rect.right = org.telegram.messenger.g0.L(2.0f);
                            break;
                        } else {
                            rect.right = org.telegram.messenger.g0.L(6.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = 0;
                    rect.right = 0;
                    break;
                }
                break;
            default:
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = org.telegram.messenger.g0.L(8.0f);
                }
                if (R2 == this.b.b0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    break;
                }
                break;
        }
    }
}
