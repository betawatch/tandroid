package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ ev0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ev0 ev0Var, Context context) {
        super(context, true);
        this.a5 = ev0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        ev0 ev0Var = this.a5;
        ArrayList arrayList = ev0Var.f;
        mu0 mu0Var = ev0Var.s;
        if (mu0Var == null || mu0Var.getAdapter() != ev0Var) {
            return false;
        }
        ev0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
