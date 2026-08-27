package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pt0 extends org.telegram.ui.Cells.p2 {
    public final /* synthetic */ qt0 S4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(qt0 qt0Var, Context context) {
        super(context, true);
        this.S4 = qt0Var;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean getIsPinned() {
        qt0 qt0Var = this.S4;
        ArrayList arrayList = qt0Var.f;
        ys0 ys0Var = qt0Var.s;
        if (ys0Var == null || ys0Var.getAdapter() != qt0Var) {
            return false;
        }
        qt0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
