package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class uu0 extends org.telegram.ui.Cells.s2 {
    public final /* synthetic */ vu0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(vu0 vu0Var, Context context) {
        super(context, true);
        this.W4 = vu0Var;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean getIsPinned() {
        vu0 vu0Var = this.W4;
        ArrayList arrayList = vu0Var.f;
        du0 du0Var = vu0Var.s;
        if (du0Var == null || du0Var.getAdapter() != vu0Var) {
            return false;
        }
        vu0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
