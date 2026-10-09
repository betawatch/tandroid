package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.ui.Cells.s2 {
    public final /* synthetic */ lv0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(lv0 lv0Var, Context context) {
        super(context, true);
        this.a5 = lv0Var;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean getIsPinned() {
        lv0 lv0Var = this.a5;
        ArrayList arrayList = lv0Var.f;
        tu0 tu0Var = lv0Var.s;
        if (tu0Var == null || tu0Var.getAdapter() != lv0Var) {
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
