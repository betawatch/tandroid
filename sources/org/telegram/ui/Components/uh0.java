package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class uh0 extends v4.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii0 b;

    public /* synthetic */ uh0(ii0 ii0Var, int i7) {
        this.a = i7;
        this.b = ii0Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        switch (this.a) {
            case 0:
                super.e(rect, view, recyclerView, a1Var);
                ii0 ii0Var = this.b;
                if (!ii0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == ii0Var.a0.b() - 1) {
                        if ((!ii0Var.U.isEmpty() && !org.telegram.messenger.qp.s1(ii0Var.J).D3()) || ii0Var.q()) {
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
