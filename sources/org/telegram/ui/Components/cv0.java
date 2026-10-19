package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cv0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ dv0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(dv0 dv0Var, Context context) {
        super(context, true);
        this.a5 = dv0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        dv0 dv0Var = this.a5;
        ArrayList arrayList = dv0Var.f;
        lu0 lu0Var = dv0Var.s;
        if (lu0Var == null || lu0Var.getAdapter() != dv0Var) {
            return false;
        }
        dv0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
