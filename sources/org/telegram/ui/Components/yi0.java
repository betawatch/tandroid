package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yi0 extends s4.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj0 b;

    public /* synthetic */ yi0(mj0 mj0Var, int i10) {
        this.a = i10;
        this.b = mj0Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.a) {
            case 0:
                super.c(rect, view, recyclerView, z0Var);
                mj0 mj0Var = this.b;
                if (!mj0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.i0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.i0.L(4.0f);
                    if (R == mj0Var.a0.b() - 1) {
                        if ((!mj0Var.U.isEmpty() && !org.telegram.messenger.vp.r1(mj0Var.J).A3()) || mj0Var.q()) {
                            rect.right = org.telegram.messenger.i0.L(2.0f);
                            break;
                        } else {
                            rect.right = org.telegram.messenger.i0.L(6.0f);
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
                    rect.left = org.telegram.messenger.i0.L(8.0f);
                }
                if (R2 == this.b.a0.b() - 1) {
                    rect.right = org.telegram.messenger.i0.L(8.0f);
                    break;
                }
                break;
        }
    }
}
