package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qu0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ ru0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(ru0 ru0Var, Context context) {
        super(context, true);
        this.W4 = ru0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        ru0 ru0Var = this.W4;
        ArrayList arrayList = ru0Var.f;
        zt0 zt0Var = ru0Var.s;
        if (zt0Var == null || zt0Var.getAdapter() != ru0Var) {
            return false;
        }
        ru0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
