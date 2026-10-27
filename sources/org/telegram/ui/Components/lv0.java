package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lv0 extends org.telegram.ui.Cells.p2 {
    public final /* synthetic */ mv0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(mv0 mv0Var, Context context) {
        super(context, true);
        this.a5 = mv0Var;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean getIsPinned() {
        mv0 mv0Var = this.a5;
        ArrayList arrayList = mv0Var.f;
        tu0 tu0Var = mv0Var.s;
        if (tu0Var == null || tu0Var.getAdapter() != mv0Var) {
            return false;
        }
        mv0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
