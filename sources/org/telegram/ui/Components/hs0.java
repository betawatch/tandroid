package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hs0 extends org.telegram.ui.Cells.t2 {
    public final /* synthetic */ is0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(is0 is0Var, Context context) {
        super(context, true);
        this.a5 = is0Var;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean getIsPinned() {
        is0 is0Var = this.a5;
        ArrayList arrayList = is0Var.f;
        rr0 rr0Var = is0Var.s;
        if (rr0Var == null || rr0Var.getAdapter() != is0Var) {
            return false;
        }
        is0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.uv) arrayList.get(R)).b;
    }
}
