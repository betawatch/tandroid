package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tk0 extends s4.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl0 b;

    public /* synthetic */ tk0(gl0 gl0Var, int i10) {
        this.a = i10;
        this.b = gl0Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        switch (this.a) {
            case 0:
                super.d(rect, view, recyclerView, b1Var);
                gl0 gl0Var = this.b;
                if (!gl0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == gl0Var.a0.h() - 1) {
                        if ((!gl0Var.U.isEmpty() && !MessagesController.getInstance(gl0Var.J).premiumFeaturesBlocked()) || gl0Var.q()) {
                            rect.right = AndroidUtilities.dp(2.0f);
                            break;
                        } else {
                            rect.right = AndroidUtilities.dp(6.0f);
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
                    rect.left = AndroidUtilities.dp(8.0f);
                }
                if (R2 == this.b.a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    break;
                }
                break;
        }
    }
}
