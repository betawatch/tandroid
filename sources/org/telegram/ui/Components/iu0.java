package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class iu0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ ju0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu0(ju0 ju0Var, Context context) {
        super(context, true);
        this.W4 = ju0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        ju0 ju0Var = this.W4;
        ArrayList arrayList = ju0Var.f;
        rt0 rt0Var = ju0Var.s;
        if (rt0Var == null || rt0Var.getAdapter() != ju0Var) {
            return false;
        }
        ju0Var.s.getClass();
        int S = RecyclerView.S(this);
        if (S < 0 || S >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(S)).pinned;
    }
}
