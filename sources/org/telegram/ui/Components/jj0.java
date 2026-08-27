package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jj0 extends f2.w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj0 b;

    public /* synthetic */ jj0(wj0 wj0Var, int i10) {
        this.a = i10;
        this.b = wj0Var;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, l1Var);
                wj0 wj0Var = this.b;
                if (!wj0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == wj0Var.T.h() - 1) {
                        if ((!wj0Var.Q.isEmpty() && !MessagesController.getInstance(wj0Var.F).premiumFeaturesBlocked()) || wj0Var.q()) {
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
