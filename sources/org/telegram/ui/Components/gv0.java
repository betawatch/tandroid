package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class gv0 extends org.telegram.ui.Cells.q2 {
    public final /* synthetic */ hv0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(hv0 hv0Var, Context context) {
        super(context, true);
        this.a5 = hv0Var;
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q2
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
