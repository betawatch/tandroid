package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gu0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ hu0 T4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu0(hu0 hu0Var, Context context) {
        super(context, true);
        this.T4 = hu0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
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
