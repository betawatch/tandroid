package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ss0 extends org.telegram.ui.Cells.u2 {
    public final /* synthetic */ ts0 b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(ts0 ts0Var, Context context) {
        super(context, true);
        this.b5 = ts0Var;
    }

    @Override // org.telegram.ui.Cells.u2
    public final boolean Z() {
        return false;
    }

    @Override // org.telegram.ui.Cells.u2
    public final boolean getIsPinned() {
        ts0 ts0Var = this.b5;
        ArrayList arrayList = ts0Var.f;
        cs0 cs0Var = ts0Var.s;
        if (cs0Var == null || cs0Var.getAdapter() != ts0Var) {
            return false;
        }
        ts0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.ov) arrayList.get(R)).b;
    }
}
