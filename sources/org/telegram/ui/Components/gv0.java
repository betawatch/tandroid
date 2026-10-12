package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gv0 extends org.telegram.ui.Cells.s2 {
    public final /* synthetic */ hv0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(hv0 hv0Var, Context context) {
        super(context, true);
        this.a5 = hv0Var;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean getIsPinned() {
        hv0 hv0Var = this.a5;
        ArrayList arrayList = hv0Var.f;
        pu0 pu0Var = hv0Var.s;
        if (pu0Var == null || pu0Var.getAdapter() != hv0Var) {
            return false;
        }
        hv0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
