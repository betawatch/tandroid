package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Cells.r2 {
    public final /* synthetic */ ev0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ev0 ev0Var, Context context) {
        super(context, true);
        this.a5 = ev0Var;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean getIsPinned() {
        ev0 ev0Var = this.a5;
        ArrayList arrayList = ev0Var.f;
        mu0 mu0Var = ev0Var.s;
        if (mu0Var == null || mu0Var.getAdapter() != ev0Var) {
            return false;
        }
        ev0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
    }
}
