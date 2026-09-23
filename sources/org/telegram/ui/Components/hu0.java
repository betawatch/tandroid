package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hu0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ iu0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu0(iu0 iu0Var, Context context) {
        super(context, true);
        this.W4 = iu0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        iu0 iu0Var = this.W4;
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
