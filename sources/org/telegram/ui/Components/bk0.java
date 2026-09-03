package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bk0 extends f2.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk0 b;

    public /* synthetic */ bk0(pk0 pk0Var, int i10) {
        this.a = i10;
        this.b = pk0Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, i1Var);
                pk0 pk0Var = this.b;
                if (!pk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == pk0Var.U.h() - 1) {
                        if ((!pk0Var.R.isEmpty() && !MessagesController.getInstance(pk0Var.G).premiumFeaturesBlocked()) || pk0Var.q()) {
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
