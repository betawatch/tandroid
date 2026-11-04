package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gs0 extends org.telegram.ui.Cells.t2 {
    public final /* synthetic */ hs0 b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(hs0 hs0Var, Context context) {
        super(context, true);
        this.b5 = hs0Var;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean getIsPinned() {
        hs0 hs0Var = this.b5;
        ArrayList arrayList = hs0Var.f;
        qr0 qr0Var = hs0Var.s;
        if (qr0Var == null || qr0Var.getAdapter() != hs0Var) {
            return false;
        }
        hs0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.mv) arrayList.get(R)).b;
    }
}
