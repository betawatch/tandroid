package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.ui.Cells.p2 {
    public final /* synthetic */ lv0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(lv0 lv0Var, Context context) {
        super(context, true);
        this.a5 = lv0Var;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean getIsPinned() {
        lv0 lv0Var = this.a5;
        ArrayList arrayList = lv0Var.f;
        su0 su0Var = lv0Var.s;
        if (su0Var == null || su0Var.getAdapter() != lv0Var) {
            return false;
        }
        lv0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
