package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fk0 extends s4.n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk0 b;

    public /* synthetic */ fk0(sk0 sk0Var, int i10) {
        this.a = i10;
        this.b = sk0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.a) {
            case 0:
                super.a(rect, view, recyclerView, z0Var);
                sk0 sk0Var = this.b;
                if (!sk0Var.q()) {
                    recyclerView.getClass();
                    int S = RecyclerView.S(view);
                    if (S == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (S == sk0Var.a0.h() - 1) {
                        if ((!sk0Var.U.isEmpty() && !MessagesController.getInstance(sk0Var.J).premiumFeaturesBlocked()) || sk0Var.q()) {
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
                int S2 = RecyclerView.S(view);
                if (S2 == 0) {
                    rect.left = AndroidUtilities.dp(8.0f);
                }
                if (S2 == this.b.a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    break;
                }
                break;
        }
    }
}
