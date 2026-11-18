package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qs0 extends org.telegram.ui.Cells.t2 {
    public final /* synthetic */ rs0 b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(rs0 rs0Var, Context context) {
        super(context, true);
        this.b5 = rs0Var;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean getIsPinned() {
        rs0 rs0Var = this.b5;
        ArrayList arrayList = rs0Var.f;
        as0 as0Var = rs0Var.s;
        if (as0Var == null || as0Var.getAdapter() != rs0Var) {
            return false;
        }
        rs0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.ov) arrayList.get(R)).b;
    }
}
