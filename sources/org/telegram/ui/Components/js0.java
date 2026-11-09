package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class js0 extends org.telegram.ui.Cells.t2 {
    public final /* synthetic */ ks0 a5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(ks0 ks0Var, Context context) {
        super(context, true);
        this.a5 = ks0Var;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t2
    public final boolean getIsPinned() {
        ks0 ks0Var = this.a5;
        ArrayList arrayList = ks0Var.f;
        tr0 tr0Var = ks0Var.s;
        if (tr0Var == null || tr0Var.getAdapter() != ks0Var) {
            return false;
        }
        ks0Var.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((org.telegram.messenger.uv) arrayList.get(R)).b;
    }
}
