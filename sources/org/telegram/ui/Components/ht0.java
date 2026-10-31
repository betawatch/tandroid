package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ht0 extends org.telegram.ui.Cells.v2 {
    public final /* synthetic */ it0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(it0 it0Var, Context context) {
        super(context, true);
        this.a5 = it0Var;
    }

    @Override // org.telegram.ui.Cells.v2
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.v2
    public final boolean getIsPinned() {
        it0 it0Var = this.a5;
        ArrayList arrayList = it0Var.f;
        rs0 rs0Var = it0Var.s;
        if (rs0Var == null || rs0Var.getAdapter() != it0Var) {
            return false;
        }
        it0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.fw) arrayList.get(R)).b;
    }
}
