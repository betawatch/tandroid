package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hi0 extends v4.o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;

    public /* synthetic */ hi0(vi0 vi0Var, int i7) {
        this.a = i7;
        this.b = vi0Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        switch (this.a) {
            case 0:
                super.e(rect, view, recyclerView, c1Var);
                vi0 vi0Var = this.b;
                if (!vi0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == vi0Var.b0.b() - 1) {
                        if ((!vi0Var.V.isEmpty() && !org.telegram.messenger.mp.u1(vi0Var.K).K3()) || vi0Var.q()) {
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
