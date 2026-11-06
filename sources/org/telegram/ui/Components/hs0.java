package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
