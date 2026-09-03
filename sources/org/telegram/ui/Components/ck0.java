package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ck0 extends f2.v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;

    public /* synthetic */ ck0(qk0 qk0Var, int i10) {
        this.a = i10;
        this.b = qk0Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, j1Var);
                qk0 qk0Var = this.b;
                if (!qk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == qk0Var.U.h() - 1) {
                        if ((!qk0Var.R.isEmpty() && !MessagesController.getInstance(qk0Var.G).premiumFeaturesBlocked()) || qk0Var.q()) {
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
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = AndroidUtilities.dp(8.0f);
                }
                if (R2 == this.b.U.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    break;
                }
                break;
        }
    }
}
