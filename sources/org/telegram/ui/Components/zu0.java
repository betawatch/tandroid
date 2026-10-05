package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zu0 extends org.telegram.ui.Cells.s2 {
    public final /* synthetic */ av0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(av0 av0Var, Context context) {
        super(context, true);
        this.W4 = av0Var;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean getIsPinned() {
        av0 av0Var = this.W4;
        ArrayList arrayList = av0Var.f;
        iu0 iu0Var = av0Var.s;
        if (iu0Var == null || iu0Var.getAdapter() != av0Var) {
            return false;
        }
        av0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
