package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class tu0 extends org.telegram.ui.Cells.s2 {
    public final /* synthetic */ uu0 W4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(uu0 uu0Var, Context context) {
        super(context, true);
        this.W4 = uu0Var;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean getIsPinned() {
        uu0 uu0Var = this.W4;
        ArrayList arrayList = uu0Var.f;
        cu0 cu0Var = uu0Var.s;
        if (cu0Var == null || cu0Var.getAdapter() != uu0Var) {
            return false;
        }
        uu0Var.s.getClass();
        int S = RecyclerView.S(this);
        if (S < 0 || S >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(S)).pinned;
    }
}
