package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nt0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ ot0 S4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(ot0 ot0Var, Context context) {
        super(context, true);
        this.S4 = ot0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        ot0 ot0Var = this.S4;
        ArrayList arrayList = ot0Var.f;
        ws0 ws0Var = ot0Var.s;
        if (ws0Var == null || ws0Var.getAdapter() != ot0Var) {
            return false;
        }
        ot0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
