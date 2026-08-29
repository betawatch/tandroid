package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yt0 extends org.telegram.ui.Cells.p2 {
    public final /* synthetic */ zt0 S4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(zt0 zt0Var, Context context) {
        super(context, true);
        this.S4 = zt0Var;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean getIsPinned() {
        zt0 zt0Var = this.S4;
        ArrayList arrayList = zt0Var.f;
        ht0 ht0Var = zt0Var.s;
        if (ht0Var == null || ht0Var.getAdapter() != zt0Var) {
            return false;
        }
        zt0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
