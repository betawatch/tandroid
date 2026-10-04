package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class yu0 extends org.telegram.ui.Cells.s2 {
    public final /* synthetic */ zu0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(zu0 zu0Var, Context context) {
        super(context, true);
        this.W4 = zu0Var;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean getIsPinned() {
        zu0 zu0Var = this.W4;
        ArrayList arrayList = zu0Var.f;
        hu0 hu0Var = zu0Var.s;
        if (hu0Var == null || hu0Var.getAdapter() != zu0Var) {
            return false;
        }
        zu0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
