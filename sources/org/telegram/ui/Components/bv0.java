package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ cv0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(cv0 cv0Var, Context context) {
        super(context, true);
        this.a5 = cv0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        cv0 cv0Var = this.a5;
        ArrayList arrayList = cv0Var.f;
        ku0 ku0Var = cv0Var.s;
        if (ku0Var == null || ku0Var.getAdapter() != cv0Var) {
            return false;
        }
        cv0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
