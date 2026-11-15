package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yh0 extends v4.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    public /* synthetic */ yh0(mi0 mi0Var, int i7) {
        this.a = i7;
        this.b = mi0Var;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        switch (this.a) {
            case 0:
                super.e(rect, view, recyclerView, b1Var);
                mi0 mi0Var = this.b;
                if (!mi0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == mi0Var.b0.b() - 1) {
                        if ((!mi0Var.V.isEmpty() && !org.telegram.messenger.np.s1(mi0Var.K).D3()) || mi0Var.q()) {
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
