package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zi0 extends s4.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nj0 b;

    public /* synthetic */ zi0(nj0 nj0Var, int i10) {
        this.a = i10;
        this.b = nj0Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.a) {
            case 0:
                super.c(rect, view, recyclerView, z0Var);
                nj0 nj0Var = this.b;
                if (!nj0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.i0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.i0.L(4.0f);
                    if (R == nj0Var.a0.b() - 1) {
                        if ((!nj0Var.U.isEmpty() && !org.telegram.messenger.wp.r1(nj0Var.J).A3()) || nj0Var.q()) {
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
