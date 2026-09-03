package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gu0 extends org.telegram.ui.Cells.q2 {
    public final /* synthetic */ hu0 T4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu0(hu0 hu0Var, Context context) {
        super(context, true);
        this.T4 = hu0Var;
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean getIsPinned() {
        hu0 hu0Var = this.T4;
        ArrayList arrayList = hu0Var.f;
        pt0 pt0Var = hu0Var.s;
        if (pt0Var == null || pt0Var.getAdapter() != hu0Var) {
            return false;
        }
        hu0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
