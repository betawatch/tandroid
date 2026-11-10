package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.Cells.t2 {
    public final /* synthetic */ js0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(js0 js0Var, Context context) {
        super(context, true);
        this.a5 = js0Var;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean getIsPinned() {
        js0 js0Var = this.a5;
        ArrayList arrayList = js0Var.f;
        sr0 sr0Var = js0Var.s;
        if (sr0Var == null || sr0Var.getAdapter() != js0Var) {
            return false;
        }
        js0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.uv) arrayList.get(R)).b;
    }
}
