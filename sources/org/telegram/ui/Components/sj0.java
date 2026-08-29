package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sj0 extends f2.v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ sj0(fk0 fk0Var, int i10) {
        this.a = i10;
        this.b = fk0Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, k1Var);
                fk0 fk0Var = this.b;
                if (!fk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == fk0Var.T.h() - 1) {
                        if ((!fk0Var.Q.isEmpty() && !MessagesController.getInstance(fk0Var.F).premiumFeaturesBlocked()) || fk0Var.q()) {
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
                if (R2 == this.b.T.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    break;
                }
                break;
        }
    }
}
