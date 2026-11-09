package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vh0 extends v4.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ji0 b;

    public /* synthetic */ vh0(ji0 ji0Var, int i7) {
        this.a = i7;
        this.b = ji0Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        switch (this.a) {
            case 0:
                super.e(rect, view, recyclerView, a1Var);
                ji0 ji0Var = this.b;
                if (!ji0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == ji0Var.a0.b() - 1) {
                        if ((!ji0Var.U.isEmpty() && !org.telegram.messenger.qp.s1(ji0Var.J).D3()) || ji0Var.q()) {
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
                if (R2 == this.b.a0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    break;
                }
                break;
        }
    }
}
