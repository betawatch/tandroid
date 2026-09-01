package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hu0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ iu0 T4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu0(iu0 iu0Var, Context context) {
        super(context, true);
        this.T4 = iu0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        iu0 iu0Var = this.T4;
        ArrayList arrayList = iu0Var.f;
        qt0 qt0Var = iu0Var.s;
        if (qt0Var == null || qt0Var.getAdapter() != iu0Var) {
            return false;
        }
        iu0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
