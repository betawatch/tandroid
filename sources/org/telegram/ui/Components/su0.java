package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class su0 extends org.telegram.ui.Cells.s2 {
    public final /* synthetic */ tu0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(tu0 tu0Var, Context context) {
        super(context, true);
        this.W4 = tu0Var;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean getIsPinned() {
        tu0 tu0Var = this.W4;
        ArrayList arrayList = tu0Var.f;
        bu0 bu0Var = tu0Var.s;
        if (bu0Var == null || bu0Var.getAdapter() != tu0Var) {
            return false;
        }
        tu0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
